public class Main {
    public static void main(String[] args) {
        String str = "abc123@!";
        int alphabets = 0, digits = 0, special = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphabets++;
            } else if(ch >= '0' && ch <= '9') {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Alphabets = " + alphabets);
        System.out.println("Digits = " + digits);
        System.out.println("Special = " + special);
    }
}
