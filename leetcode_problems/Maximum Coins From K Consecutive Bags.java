import java.util.Arrays;

class Solution {
    public long maximumCoins(int[][] coins, int k) {
        Arrays.sort(coins, (a, b) -> Integer.compare(a[0], b[0]));

        return Math.max(calc(coins, k), calcReverse(coins, k));
    }

    private long calc(int[][] coins, int k) {
        long ans = 0, sum = 0;
        int j = 0;

        for (int[] bag : coins) {
            int left = bag[0];
            int right = bag[1];
            int value = bag[2];

            while (j < coins.length && coins[j][1] < left + k) {
                sum += 1L * (coins[j][1] - coins[j][0] + 1) * coins[j][2];
                j++;
            }

            long cur = sum;

            if (j < coins.length && coins[j][0] < left + k) {
                cur += 1L * (left + k - coins[j][0]) * coins[j][2];
            }

            ans = Math.max(ans, cur);

            sum -= 1L * (right - left + 1) * value;
        }

        return ans;
    }

    private long calcReverse(int[][] coins, int k) {
        int n = coins.length;
        int[][] rev = new int[n][3];

        for (int i = 0; i < n; i++) {
            rev[i][0] = -coins[n - 1 - i][1];
            rev[i][1] = -coins[n - 1 - i][0];
            rev[i][2] = coins[n - 1 - i][2];
        }

        return calc(rev, k);
    }
}
