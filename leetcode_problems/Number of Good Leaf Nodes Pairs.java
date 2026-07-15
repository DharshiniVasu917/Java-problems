class Solution {

    private int count = 0;

    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);
        return count;
    }

    private int[] dfs(TreeNode node, int distance) {

        int[] dist = new int[distance + 1];

        if (node == null)
            return dist;

        if (node.left == null && node.right == null) {
            dist[1] = 1;
            return dist;
        }

        int[] left = dfs(node.left, distance);
        int[] right = dfs(node.right, distance);

        for (int i = 1; i <= distance; i++) {
            for (int j = 1; j <= distance; j++) {
                if (i + j <= distance) {
                    count += left[i] * right[j];
                }
            }
        }

        for (int i = 2; i <= distance; i++) {
            dist[i] = left[i - 1] + right[i - 1];
        }

        return dist;
    }
}
