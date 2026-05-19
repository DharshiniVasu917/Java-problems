public class Main {
    static boolean equalLettersDigits(String s) {
        int letters = 0, digits = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if((ch >= 'a' && ch <= 'z') ||
               (ch >= 'A' && ch <= 'Z')) {
                letters++;
            } else if(ch >= '0' && ch <= '9') {
                digits++;
            }
        }

        return letters == digits;
    }

    static int countEqualFiles(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            if(equalLettersDigits(files[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"ab12", "test123", "xy45"};
        System.out.println(countEqualFiles(files));
    }
}
