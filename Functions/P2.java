public class Main {

    public static int longestSubstring(String s) {
        int[] index = new int[256];
        for(int i = 0; i < 256; i++) {
            index[i] = -1;
        }

        int maxLen = 0, start = 0;

        for(int i = 0; i < s.length(); i++) {
            if(index[s.charAt(i)] >= start) {
                start = index[s.charAt(i)] + 1;
            }

            index[s.charAt(i)] = i;
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
    }
}
