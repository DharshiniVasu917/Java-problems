public class Main {
    static boolean onlyAlphabets(String s) {

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!((ch >= 'a' && ch <= 'z') ||
                 (ch >= 'A' && ch <= 'Z'))) {
                return false;
            }
        }

        return true;
    }

    static int countAlphabetFiles(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            if(onlyAlphabets(files[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"Main", "Test123", "Code"};
        System.out.println(countAlphabetFiles(files));
    }
}
