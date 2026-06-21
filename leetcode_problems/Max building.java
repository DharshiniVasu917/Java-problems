import java.util.*;

class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        int m = restrictions.length;
        int[][] arr = new int[m + 1][2];

        for (int i = 0; i < m; i++) {
            arr[i] = restrictions[i];
        }

        arr[m] = new int[]{1, 0};

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int len = arr.length;

        for (int i = 1; i < len; i++) {
            arr[i][1] = Math.min(arr[i][1],
                    arr[i - 1][1] + arr[i][0] - arr[i - 1][0]);
        }

        for (int i = len - 2; i >= 0; i--) {
            arr[i][1] = Math.min(arr[i][1],
                    arr[i + 1][1] + arr[i + 1][0] - arr[i][0]);
        }

        int ans = 0;

        for (int i = 1; i < len; i++) {
            int d = arr[i][0] - arr[i - 1][0];
            int h1 = arr[i - 1][1];
            int h2 = arr[i][1];

            ans = Math.max(ans, (h1 + h2 + d) / 2);
        }

        ans = Math.max(ans,
                arr[len - 1][1] + (n - arr[len - 1][0]));

        return ans;
    }
}
