import java.util.*;
class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=0;
        int length= arr.length/4;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                count=1;
            }
            
        
        if(count>length){
            return arr[i];
        }
        }
        return arr[0];
    }
}
