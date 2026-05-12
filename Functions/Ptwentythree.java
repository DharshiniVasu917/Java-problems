public class Main {
    static boolean isAlphabetical(String[] files) {

        for(int i = 0; i < files.length - 1; i++) {
            if(files[i].compareTo(files[i + 1]) > 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] files = {"App.java", "Main.java", "Test.java"};

        if(isAlphabetical(files))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
