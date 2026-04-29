public class Main {
    static int countFiles(String[] files) {
        return files.length;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "README.md", "index.html", "style.css"};
        System.out.println(countFiles(files));
    }
}
