public class Main {
    static int countExt(String[] files, String ext) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            String f = files[i];
            int n = f.length();
            int m = ext.length();

            if(n >= m) {
                boolean match = true;
                for(int j = 0; j < m; j++) {
                    if(f.charAt(n - m + j) != ext.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if(match) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"Main.java", "App.java", "index.html", "style.css"};
        System.out.println(countExt(files, ".java"));
    }
    }
