public class Main {
    static int vowelCount(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                count++;
            }
        }

        return count;
    }

    static String maxVowelFile(String[] files) {
        String maxFile = files[0];
        int max = vowelCount(files[0]);

        for(int i = 1; i < files.length; i++) {
            int v = vowelCount(files[i]);

            if(v > max) {
                max = v;
                maxFile = files[i];
            }
        }

        return maxFile;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "Application.java", "index.html"};
        System.out.println(maxVowelFile(files));
    }
}
