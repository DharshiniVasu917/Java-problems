public class Main {
    static String longestExtension(String[] files) {
        String result = "";
        int max = 0;

        for(int i = 0; i < files.length; i++) {
            int lastDot = -1;

            for(int j = 0; j < files[i].length(); j++) {
                if(files[i].charAt(j) == '.') {
                    lastDot = j;
                }
            }

            int extLength = files[i].length() - lastDot - 1;

            if(extLength > max) {
                max = extLength;
                result = files[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] files = {"index.html", "Main.java", "archive.tar.gz"};
        System.out.println(longestExtension(files));
    }
}
