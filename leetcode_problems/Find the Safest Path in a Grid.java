import java.util.*;

class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] dist = new int[n][n];

        for (int[] row : dist) {
            Arrays.fill(row, -1);
        }

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    dist[i][j] = 0;
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int[] d : dirs) {
                int nx = cur[0] + d[0];
                int ny = cur[1] + d[1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        boolean[][] visited = new boolean[n][n];

        pq.offer(new int[]{0, 0, dist[0][0]});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int x = cur[0];
            int y = cur[1];
            int safe = cur[2];

            if (visited[x][y]) {
                continue;
            }

            visited[x][y] = true;

            if (x == n - 1 && y == n - 1) {
                return safe;
            }

            for (int[] d : dirs) {
                int nx = x + d[0];
                int ny = y + d[1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                    pq.offer(new int[]{
                        nx,
                        ny,
                        Math.min(safe, dist[nx][ny])
                    });
                }
            }
        }

        return 0;
    }
}
