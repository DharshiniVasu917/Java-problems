public class Main {
    static boolean isEmpty(String[] files) {
        return files.length == 0;
    }

    public static void main(String[] args) {
        String[] files = {};

        if(isEmpty(files))
            System.out.println("Repository is Empty");
        else
            System.out.println("Repository has Files");
    }
}
