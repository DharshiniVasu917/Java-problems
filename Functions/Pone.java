public class Main {
    static String smallestFile(String[] files) {
        String min = files[0];

        for(int i = 1; i < files.length; i++) {
            if(files[i].length() < min.length()) {
                min = files[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "A.java", "Application.java"};
        System.out.println(smallestFile(files));
    }
}
