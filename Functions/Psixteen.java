public class Main {
    static int countDigits(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            for(int j = 0; j < files[i].length(); j++) {
                char ch = files[i].charAt(j);

                if(ch >= '0' && ch <= '9') {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"file1.java", "test2.html", "abc3.css"};
        System.out.println(countDigits(files));
    }
}
