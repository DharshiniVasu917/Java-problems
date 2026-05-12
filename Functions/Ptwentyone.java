public class Main {
    static int countFiles(String[] files, String word) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            if(files[i].contains(word)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "MainTest.java", "App.java"};
        System.out.println(countFiles(files, "Main"));
    }
}
