class BinaryIndexedTree {
    int[] tree;
    int n;

    public BinaryIndexedTree(int n) {
        this.n = n;
        tree = new int[n + 2];
    }

    public void update(int index, int value) {
        while (index <= n) {
            tree[index] += value;
            index += index & -index;
        }
    }

    public int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= index & -index;
        }
        return sum;
    }
}

class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        BinaryIndexedTree bit = new BinaryIndexedTree(2 * n + 5);

        int prefix = n + 2;

        bit.update(prefix, 1);

        long answer = 0;

        for (int num : nums) {

            if (num == target)
                prefix++;
            else
                prefix--;

            answer += bit.query(prefix - 1);

            bit.update(prefix, 1);
        }

        return answer;
    }
}
