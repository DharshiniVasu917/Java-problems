public class Main {
    static int countVowelEnd(String[] files) {
        int count = 0;

        for(int i = 0; i < files.length; i++) {
            char ch = files[i].charAt(files[i].length() - 1);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] files = {"data", "code", "Main.java", "hello"};
        System.out.println(countVowelEnd(files));
    }
}
