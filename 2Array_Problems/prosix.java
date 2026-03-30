class ProSix {
    public static void main(String[] args) {

        int[][] arr = {
            {3, 5, 7},
            {1, 9, 2},
            {6, 4, 8}
        };

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Largest element = " + max);
    }
}
