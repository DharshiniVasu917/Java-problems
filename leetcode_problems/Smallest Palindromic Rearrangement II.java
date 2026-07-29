class Solution {
    private static final long MAX = 1_000_001L;
    public String smallestPalindrome(String s, long k) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;

        int oddCount = 0;
        for (int c : count) if (c % 2 == 1) oddCount++;
        if (oddCount > 1) return "";

        int[] half = new int[26];
        char midLetter = 0;
        for (int i = 0; i < 26; i++) {
            half[i] = count[i] / 2;
            if (count[i] % 2 == 1) midLetter = (char) ('a' + i);
        }

        long totalPerm = countArrangements(half.clone());
        if (k > totalPerm) return "";

        String left = generateLeftHalf(half, k);
        StringBuilder sb = new StringBuilder(left);
        if (midLetter != 0) sb.append(midLetter);
        sb.append(new StringBuilder(left).reverse());
        return sb.toString();
    }

    private String generateLeftHalf(int[] half, long k) {
        int halfLen = 0;
        for (int f : half) halfLen += f;

        StringBuilder left = new StringBuilder();
        for (int pos = 0; pos < halfLen; pos++) {
            for (int i = 0; i < 26; i++) {
                if (half[i] == 0) continue;
                half[i]--;
                long arrangements = countArrangements(half.clone());
                if (arrangements >= k) {
                    left.append((char) ('a' + i));
                    break;
                } else {
                    k -= arrangements;
                    half[i]++;
                }
            }
        }
        return left.toString();
    }

    // Number of distinct permutations of the multiset described by count[]
    private long countArrangements(int[] count) {
        int total = 0;
        for (int f : count) total += f;

        long res = 1;
        for (int freq : count) {
            res *= nCk(total, freq);
            if (res >= MAX) return MAX;
            total -= freq;
        }
        return res;
    }

    private long nCk(int n, int k) {
        long res = 1;
        int kk = Math.min(k, n - k);
        for (int i = 1; i <= kk; i++) {
            res = res * (n - i + 1) / i;
            if (res >= MAX) return MAX;
        }
        return res;
    }
}
