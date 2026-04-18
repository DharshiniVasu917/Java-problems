public class Main {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";

        if(s1.length() != s2.length()) {
            System.out.println("False");
            return;
        }

        char[] map1 = new char[256];
        char[] map2 = new char[256];

        boolean isIso = true;

        for(int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(map1[c1] == 0 && map2[c2] == 0) {
                map1[c1] = c2;
                map2[c2] = c1;
            } else {
                if(map1[c1] != c2 || map2[c2] != c1) {
                    isIso = false;
                    break;
                }
            }
        }

        if(isIso)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
