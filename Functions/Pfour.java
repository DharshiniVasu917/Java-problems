public class Main {
    static boolean allLowercase(String[] files) {
        for(int i = 0; i < files.length; i++) {
            char ch = files[i].charAt(0);

            if(!(ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] files = {"main.java", "index.html", "style.css"};

        if(allLowercase(files))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
