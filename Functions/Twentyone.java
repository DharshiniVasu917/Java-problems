public class Main {
    static int countSame(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            String s = files[i];

            if(s.charAt(0) == s.charAt(s.length() - 1)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"level", "java", "radar", "code"};
        System.out.println(countSame(files));
    }
}
