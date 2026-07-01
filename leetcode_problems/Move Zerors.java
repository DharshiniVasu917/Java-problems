import java.util.Arrays;
class Solution {
    public void moveZeroes(int[] nums) {
        int correct=0,index=0,size=nums.length;
        while(index<size){
            if(nums[index]!=0){
                nums[correct]=nums[index];
                correct++;

            }
            index++;

        }
        Arrays.fill(nums,correct,size,0);


        
    }
}
