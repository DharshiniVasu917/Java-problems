import java.util.*;

class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size(), MOD = 1000000007;
        int[][] score = new int[n + 1][n + 1];
        int[][] ways = new int[n + 1][n + 1];

        ways[n - 1][n - 1] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (board.get(i).charAt(j) == 'X' || (i == n - 1 && j == n - 1))
                    continue;

                int max = Math.max(score[i + 1][j], Math.max(score[i][j + 1], score[i + 1][j + 1]));
                int cnt = 0;

                if (ways[i + 1][j] > 0 && score[i + 1][j] == max)
                    cnt = (cnt + ways[i + 1][j]) % MOD;
                if (ways[i][j + 1] > 0 && score[i][j + 1] == max)
                    cnt = (cnt + ways[i][j + 1]) % MOD;
                if (ways[i + 1][j + 1] > 0 && score[i + 1][j + 1] == max)
                    cnt = (cnt + ways[i + 1][j + 1]) % MOD;

                if (cnt == 0)
                    continue;

                ways[i][j] = cnt;

                char c = board.get(i).charAt(j);
                score[i][j] = max + (Character.isDigit(c) ? c - '0' : 0);
            }
        }

        return ways[0][0] == 0 ? new int[]{0, 0} : new int[]{score[0][0], ways[0][0]};
    }
}
