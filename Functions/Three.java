public class Main {
    static int specialCount(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!((ch >= 'a' && ch <= 'z') ||
                 (ch >= 'A' && ch <= 'Z') ||
                 (ch >= '0' && ch <= '9'))) {
                count++;
            }
        }

        return count;
    }

    static String maxSpecialFile(String[] files) {
        String maxFile = files[0];
        int max = specialCount(files[0]);

        for(int i = 1; i < files.length; i++) {
            int s = specialCount(files[i]);

            if(s > max) {
                max = s;
                maxFile = files[i];
            }
        }

        return maxFile;
    }

    public static void main(String[] args) {
        String[] files = {"file@1.java", "test#file!.txt", "Main.java"};
        System.out.println(maxSpecialFile(files));
    }
}
