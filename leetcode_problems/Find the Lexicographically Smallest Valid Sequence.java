class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[] suf = new int[m + 1];
        suf[m] = n;

        int j = m - 1;

        for (int i = n - 1; i >= 0 && j >= 0; i--) {
            if (word1.charAt(i) == word2.charAt(j)) {
                suf[j] = i;
                j--;
            }
        }

        if (j >= 0) {
            return new int[0];
        }

        int[] ans = new int[m];

        int p = 0;
        boolean changed = false;

        for (int i = 0; i < m; i++) {

            while (p < n) {

                if (word1.charAt(p) == word2.charAt(i)) {
                    ans[i] = p++;
                    break;
                }

                // Use the allowed mismatch here.
                if (!changed && p + 1 <= suf[i + 1]) {
                    ans[i] = p++;
                    changed = true;
                    break;
                }

                p++;
            }
        }

        return ans;
    }
}
