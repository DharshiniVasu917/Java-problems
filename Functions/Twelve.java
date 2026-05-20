public class Main {
    static int asciiSum(String s) {
        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }

        return sum;
    }

    static String maxAsciiFile(String[] files) {
        String maxFile = files[0];
        int max = asciiSum(files[0]);

        for(int i = 1; i < files.length; i++) {
            int value = asciiSum(files[i]);

            if(value > max) {
                max = value;
                maxFile = files[i];
            }
        }

        return maxFile;
    }

    public static void main(String[] args) {
        String[] files = {"abc", "xyz", "java"};
        System.out.println(maxAsciiFile(files));
    }
}
