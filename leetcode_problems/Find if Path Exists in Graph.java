import java.util.*;

class Solution {
    private List<List<Integer>> adj = new ArrayList<>();
    private boolean[] isVisited;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        isVisited = new boolean[n];
        buildAdjacency(edges, n);
        return bfs(source, destination);
    }

    public void buildAdjacency(int[][] edges, int n) {
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] each : edges) {
            adj.get(each[0]).add(each[1]);
            adj.get(each[1]).add(each[0]);
        }
    }

    public boolean bfs(int src, int dest) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(src);
        isVisited[src] = true;

        while (!que.isEmpty()) {
            int node = que.poll();

            if (node == dest) {
                return true;
            }

            for (int nei : adj.get(node)) {
                if (!isVisited[nei]) {
                    isVisited[nei] = true;
                    que.offer(nei);
                }
            }
        }

        return false;
    }
}
