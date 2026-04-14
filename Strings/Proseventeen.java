public class Main {
    public static void main(String[] args) {
        String str = "((()))";
        int count = 0;
        boolean valid = true;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(') {
                count++;
            } else if(ch == ')') {
                count--;
            }

            if(count < 0) {
                valid = false;
                break;
            }
        }

        if(count != 0) {
            valid = false;
        }

        if(valid)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
