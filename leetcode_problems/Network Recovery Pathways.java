import java.util.*;

class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;
        List<int[]>[] adj = new List[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        int[] indeg = new int[n];
        for (int[] e : edges) {
            adj[e[0]].add(new int[]{e[1], e[2]});
            indeg[e[1]]++;
        }
        int[] topo = new int[n];
        int idx = 0;
        int[] tmpIndeg = indeg.clone();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (tmpIndeg[i] == 0) queue.add(i);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            topo[idx++] = u;
            for (int[] nx : adj[u]) {
                if (--tmpIndeg[nx[0]] == 0) queue.add(nx[0]);
            }
        }

        int lo = 0, hi = 0;
        for (int[] e : edges) hi = Math.max(hi, e[2]);
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (feasible(mid, n, topo, adj, online, k)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    private boolean feasible(int x, int n, int[] topo, List<int[]>[] adj, boolean[] online, long k) {
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE / 2);
        dist[0] = 0;
        for (int u : topo) {
            if (!online[u]) continue;
            if (dist[u] >= Long.MAX_VALUE / 2) continue;
            for (int[] nx : adj[u]) {
                int v = nx[0], c = nx[1];
                if (c < x) continue;
                if (!online[v]) continue;
                if (dist[u] + c < dist[v]) dist[v] = dist[u] + c;
            }
        }
        return dist[n - 1] <= k;
    }
}
