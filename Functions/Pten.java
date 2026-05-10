public class Main {
    static String reverse(String s) {
        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "index.html", "style.css"};

        for(int i = 0; i < files.length; i++) {
            System.out.println(reverse(files[i]));
        }
    }
}
