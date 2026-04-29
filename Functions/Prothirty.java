public class Main {
    static int countJavaFiles(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            if(files[i].endsWith(".java"))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "Test.java", "README.md", "style.css"};
        System.out.println(countJavaFiles(files));
    }
}
