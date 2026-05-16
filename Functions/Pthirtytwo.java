public class Main {
    static int digitCount(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch >= '0' && ch <= '9') {
                count++;
            }
        }

        return count;
    }

    static String minDigitFile(String[] files) {
        String minFile = files[0];
        int min = digitCount(files[0]);

        for(int i = 1; i < files.length; i++) {
            int d = digitCount(files[i]);

            if(d < min) {
                min = d;
                minFile = files[i];
            }
        }

        return minFile;
    }

    public static void main(String[] args) {
        String[] files = {"file123", "abc1", "test"};
        System.out.println(minDigitFile(files));
    }
}
