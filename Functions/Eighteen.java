public class Main {
    static boolean moreUpper(String s) {
        int upper = 0, lower = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
                upper++;

            else if(ch >= 'a' && ch <= 'z')
                lower++;
        }

        return upper > lower;
    }

    static int countFiles(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            if(moreUpper(files[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"JAVA", "Main", "HTML"};
        System.out.println(countFiles(files));
    }
}
