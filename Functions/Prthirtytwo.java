public class Main {
    static int totalLines(int[] lines) {
        int sum = 0;

        for(int i = 0; i < lines.length; i++) {
            sum += lines[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] lines = {120, 80, 200, 50};
        System.out.println(totalLines(lines));
    }
}
