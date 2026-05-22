public class Main {
    static int asciiSum(String s) {
        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }

        return sum;
    }

    static String minAsciiFile(String[] files) {
        String minFile = files[0];
        int min = asciiSum(files[0]);

        for(int i = 1; i < files.length; i++) {
            int value = asciiSum(files[i]);

            if(value < min) {
                min = value;
                minFile = files[i];
            }
        }

        return minFile;
    }

    public static void main(String[] args) {
        String[] files = {"abc", "AAA", "xyz"};
        System.out.println(minAsciiFile(files));
    }
}
