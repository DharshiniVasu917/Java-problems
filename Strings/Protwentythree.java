public class Main {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String max = "";

        for(int i = 0; i < str.length(); i++) {
            String temp = "";

            for(int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                boolean found = false;

                for(int k = 0; k < temp.length(); k++) {
                    if(temp.charAt(k) == ch) {
                        found = true;
                        break;
                    }
                }

                if(found) break;

                temp = temp + ch;

                if(temp.length() > max.length()) {
                    max = temp;
                }
            }
        }

        System.out.println(max);
    }
}
