public class Main {
    static int countNoExtension(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            boolean hasDot = false;

            for(int j = 0; j < files[i].length(); j++) {
                if(files[i].charAt(j) == '.') {
                    hasDot = true;
                    break;
                }
            }

            if(!hasDot) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"README", "Main.java", "LICENSE"};
        System.out.println(countNoExtension(files));
    }
}
