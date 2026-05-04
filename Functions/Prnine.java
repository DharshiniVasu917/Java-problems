public class Main {
    static int countHidden(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            if(files[i].length() > 0 && files[i].charAt(0) == '.') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {".gitignore", "Main.java", ".env", "README.md"};
        System.out.println(countHidden(files));
    }
}
