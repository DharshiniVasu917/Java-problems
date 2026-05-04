public class Main {
    static String longestName(String[] files) {
        String max = files[0];

        for(int i = 1; i < files.length; i++) {
            if(files[i].length() > max.length()) {
                max = files[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "Application.java", "index.html"};
        System.out.println(longestName(files));
    }
}
