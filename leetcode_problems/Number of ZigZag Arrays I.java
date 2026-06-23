class Solution {
    public int zigZagArrays(int n, int l, int r) {
        final int MOD = 1_000_000_007;
        int m = r - l + 1;
        long[] up = new long[m];
        long[] down = new long[m];

        for (int i = 0; i < m; i++) {
            up[i] = i;
            down[i] = m - 1 - i;
        }

        for (int len = 3; len <= n; len++) {
            long[] newUp = new long[m];
            long[] newDown = new long[m];

            long prefix = 0;
            for (int j = 0; j < m; j++) {
                newUp[j] = prefix;
                prefix = (prefix + down[j]) % MOD;
            }

            long suffix = 0;
            for (int j = m - 1; j >= 0; j--) {
                newDown[j] = suffix;
                suffix = (suffix + up[j]) % MOD;
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;
        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }
        return (int) ans;
    }
}
