class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        final int MOD = 1_000_000_007;

        int n = s.length();

        int[] next = new int[n + 1];
        next[n] = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != '0')
                next[i] = i;
            else
                next[i] = next[i + 1];
        }

        int[] map = new int[n];
        java.util.Arrays.fill(map, -1);

        java.util.ArrayList<Integer> digits = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> pos = new java.util.ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') {
                map[i] = digits.size();
                digits.add(s.charAt(i) - '0');
                pos.add(i);
            }
        }

        int m = digits.size();

        long[] pow10 = new long[m + 1];
        pow10[0] = 1;
        for (int i = 1; i <= m; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        long[] prefixNum = new long[m + 1];
        long[] prefixSum = new long[m + 1];

        for (int i = 0; i < m; i++) {
            prefixNum[i + 1] = (prefixNum[i] * 10 + digits.get(i)) % MOD;
            prefixSum[i + 1] = prefixSum[i] + digits.get(i);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int first = next[l];
            if (first == -1 || first > r) {
                ans[i] = 0;
                continue;
            }

            int left = map[first];

            int lo = left;
            int hi = m - 1;
            int right = left;

            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (pos.get(mid) <= r) {
                    right = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

            int len = right - left + 1;

            long x = (prefixNum[right + 1]
                    - (prefixNum[left] * pow10[len]) % MOD
                    + MOD) % MOD;

            long sum = prefixSum[right + 1] - prefixSum[left];

            ans[i] = (int) ((x * (sum % MOD)) % MOD);
        }

        return ans;
    }
}
