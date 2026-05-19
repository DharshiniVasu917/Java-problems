public class Main {
    static String removeDigits(String s) {
        String result = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!(ch >= '0' && ch <= '9')) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] files = {"file1.java", "test123.txt"};

        for(int i = 0; i < files.length; i++) {
            System.out.println(removeDigits(files[i]));
        }
    }
}
