public class Main {
    static boolean onlyLowercase(String s) {

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!(ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }

        return true;
    }

    static int countLowercase(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            if(onlyLowercase(files[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"java", "Code", "html"};
        System.out.println(countLowercase(files));
    }
}
