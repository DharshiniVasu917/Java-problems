class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;

        int[] answer = new int[nums.length];
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];
            answer[i] = Math.abs(left - right);
            left += nums[i];
        }

        return answer;
    }
}
