public class Main {
    static int max(int a, int b) {
        if(a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int a = 5, b = 8;
        System.out.println(max(a, b));
    }
}
