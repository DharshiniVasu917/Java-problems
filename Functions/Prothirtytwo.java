public class Main {
    static boolean hasReadme(String[] files) {
        for(int i = 0; i < files.length; i++) {
            if(files[i].equals("README.md"))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "README.md", "App.java"};

        if(hasReadme(files))
            System.out.println("README Found");
        else
            System.out.println("README Not Found");
    }
}
