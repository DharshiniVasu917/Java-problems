class Solution {
    private static final int MOD = 1_000_000_007;
    private int[][][] dp;
    private int[] nums;

    public int subsequencePairCount(int[] nums) {
        this.nums = nums;

        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        dp = new int[nums.length + 1][max + 1][max + 1];

        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j <= max; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(0, 0, 0);
    }

    private int solve(int idx, int g1, int g2) {
        if (idx == nums.length) {
            return (g1 != 0 && g1 == g2) ? 1 : 0;
        }

        if (dp[idx][g1][g2] != -1) {
            return dp[idx][g1][g2];
        }

        long ans = 0;

        // Ignore current number
        ans += solve(idx + 1, g1, g2);

        // Put in first subsequence
        ans += solve(idx + 1, gcd(g1, nums[idx]), g2);

        // Put in second subsequence
        ans += solve(idx + 1, g1, gcd(g2, nums[idx]));

        dp[idx][g1][g2] = (int) (ans % MOD);
        return dp[idx][g1][g2];
    }

    private int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
