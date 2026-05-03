public class Main {
    static int countUppercaseStart(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            char ch = files[i].charAt(0);

            if(ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "app.js", "Index.html", "style.css"};
        System.out.println(countUppercaseStart(files));
    }
}
