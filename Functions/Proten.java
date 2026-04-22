public class Main {
    static int secondLargest(int[] arr) {
        int first = arr[0];
        int second = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            } else if(arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8};
        System.out.println(secondLargest(arr));
    }
}
