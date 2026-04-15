public class Main {
    public static void main(String[] args) {
        String str = "hello world java";
        String result = "";
        String word = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != ' ') {
                word = word + ch;
            } else {
                result = word + " " + result;
                word = "";
            }
        }

        result = word + " " + result;

        System.out.println(result.trim());
    }
          }
