public class Main {
    static int countMD(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            String f = files[i];
            int n = f.length();

            if(n >= 3 &&
               f.charAt(n-3) == '.' &&
               f.charAt(n-2) == 'm' &&
               f.charAt(n-1) == 'd') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"README.md", "guide.md", "Main.java", "notes.txt"};
        System.out.println(countMD(files));
    }
}
