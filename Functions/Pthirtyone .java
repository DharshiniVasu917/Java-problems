public class Main {
    static String replaceSpaces(String s) {
        String result = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
                result += "_";
            else
                result += s.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] files = {"my file.java", "test file.txt"};

        for(int i = 0; i < files.length; i++) {
            System.out.println(replaceSpaces(files[i]));
        }
    }
}
