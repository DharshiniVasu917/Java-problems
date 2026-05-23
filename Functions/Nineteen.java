public class Main {
    static int wordCount(String s) {
        int count = 1;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"my file java", "test code", "hello"};

        for(int i = 0; i < files.length; i++) {
            System.out.println(wordCount(files[i]));
        }
    }
}
