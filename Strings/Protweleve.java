public class Main {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                count[ch - 'a'] = 1;
            } else if(ch >= 'A' && ch <= 'Z') {
                count[ch - 'A'] = 1;
            }
        }

        boolean isPangram = true;

        for(int i = 0; i < 26; i++) {
            if(count[i] == 0) {
                isPangram = false;
                break;
            }
        }

        if(isPangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}
