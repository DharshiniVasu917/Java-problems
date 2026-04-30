public class Main {
    static int largestFile(int[] sizes) {
        int max = sizes[0];

        for(int i = 1; i < sizes.length; i++) {
            if(sizes[i] > max) {
                max = sizes[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] sizes = {400, 120
