public class Main {
    static int totalChars(String[] files) {
        int sum = 0;

        for(int i = 0; i < files.length; i++) {
            sum += files[i].length();
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "App.java", "index.html"};
        System.out.println(totalChars(files));
    }
}
