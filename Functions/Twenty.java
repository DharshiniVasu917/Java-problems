public class Main {
    static String commonPrefix(String s1, String s2) {
        String result = "";

        int len;

        if(s1.length() < s2.length())
            len = s1.length();
        else
            len = s2.length();

        for(int i = 0; i < len; i++) {
            if(s1.charAt(i) == s2.charAt(i))
                result += s1.charAt(i);
            else
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "MainFile.java";
        String s2 = "MainCode.java";

        System.out.println(commonPrefix(s1, s2));
    }
}
