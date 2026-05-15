public class Main {
    static boolean hasDuplicate(String s) {

        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    return true;
                }
            }
        }

        return false;
    }

    static String firstDuplicateFile(String[] files) {

        for(int i = 0; i < files.length; i++) {
            if(hasDuplicate(files[i])) {
                return files[i];
            }
        }

        return "None";
    }

    public static void main(String[] args) {
        String[] files = {"abc", "file", "xyz"};
        System.out.println(firstDuplicateFile(files));
    }
}
