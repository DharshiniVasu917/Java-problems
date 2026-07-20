class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;

        k %= size;

        int[] arr = new int[size];

        // Convert 2D grid to 1D array
        int index = 0;
        for (int[] row : grid) {
            for (int num : row) {
                arr[index++] = num;
            }
        }

        // Shift the array
        int[] shifted = new int[size];
        for (int i = 0; i < size; i++) {
            shifted[(i + k) % size] = arr[i];
        }

        // Convert back to List<List<Integer>>
        List<List<Integer>> result = new ArrayList<>();
        index = 0;

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(shifted[index++]);
            }
            result.add(row);
        }

        return result;
    }
}
