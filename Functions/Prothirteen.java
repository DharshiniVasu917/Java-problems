public class Main {
    static int largest(int[] arr) {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 40, 15};
        System.out.println(largest(arr));
    }
    }
