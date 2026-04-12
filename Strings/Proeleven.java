public class Main {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";

        if(str1.length() != str2.length()) {
            System.out.println("Not Rotation");
            return;
        }

        String temp = str1 + str1;

        if(temp.contains(str2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}
