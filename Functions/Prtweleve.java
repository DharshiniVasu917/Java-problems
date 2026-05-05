public class Main {
    static int countLongNames(String[] files, int len) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            if(files[i].length() > len) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "App.java", "index.html", "a.txt"};
        System.out.println(countLongNames(files, 8));
    }
}
