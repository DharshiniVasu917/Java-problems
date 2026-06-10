import java.util.*;

class Solution {
    static class Node {
        long value;
        int l, r;

        Node(long value, int l, int r) {
            this.value = value;
            this.l = l;
            this.r = r;
        }
    }

    int[][] stMax, stMin;
    int[] log;

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        buildSparseTables(nums);

        PriorityQueue<Node> pq =
            new PriorityQueue<>((a, b) -> Long.compare(b.value, a.value));

        for (int l = 0; l < n; l++) {
            long val = rangeMax(l, n - 1) - rangeMin(l, n - 1);
            pq.offer(new Node(val, l, n - 1));
        }

        long ans = 0;

        while (k-- > 0) {
            Node cur = pq.poll();
            ans += cur.value;

            if (cur.r > cur.l) {
                int nr = cur.r - 1;
                long val = rangeMax(cur.l, nr) - rangeMin(cur.l, nr);
                pq.offer(new Node(val, cur.l, nr));
            }
        }

        return ans;
    }

    private void buildSparseTables(int[] nums) {
        int n = nums.length;

        log = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        int K = log[n] + 1;

        stMax = new int[K][n];
        stMin = new int[K][n];

        for (int i = 0; i < n; i++) {
            stMax[0][i] = nums[i];
            stMin[0][i] = nums[i];
        }

        for (int j = 1; j < K; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                stMax[j][i] = Math.max(
                    stMax[j - 1][i],
                    stMax[j - 1][i + (1 << (j - 1))]
                );

                stMin[j][i] = Math.min(
                    stMin[j - 1][i],
                    stMin[j - 1][i + (1 << (j - 1))]
                );
            }
        }
    }

    private int rangeMax(int l, int r) {
        int j = log[r - l + 1];
        return Math.max(
            stMax[j][l],
            stMax[j][r - (1 << j) + 1]
        );
    }

    private int rangeMin(int l, int r) {
        int j = log[r - l + 1];
        return Math.min(
            stMin[j][l],
            stMin[j][r - (1 << j) + 1]
        );
    }
}
