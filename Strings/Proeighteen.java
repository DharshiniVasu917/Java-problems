public class Main {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String result = "";

        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            for(int j = 0; j < str2.length(); j++) {
                if(ch == str2.charAt(j)) {

                    boolean found = false;
                    for(int k = 0; k < result.length(); k++) {
                        if(result.charAt(k) == ch) {
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        result = result + ch + " ";
                    }
                }
            }
        }

        System.out.println(result);
    }
}
