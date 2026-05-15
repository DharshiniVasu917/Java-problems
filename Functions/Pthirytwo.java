public class Main {
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    static int countPalindromes(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            if(isPalindrome(files[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"madam", "level", "Main.java"};
        System.out.println(countPalindromes(files));
    }
}
