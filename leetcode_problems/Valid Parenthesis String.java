import java.util.*;
class Solution {
    public boolean checkValidString(String s) {
        int opened=0,closed=0;
        char[] brackets=s.toCharArray();
        for(char each:brackets){
            if(each=='('){
                opened++;
                closed++;

            }else if(each ==')'){
                if(opened>0) opened--;
                closed--;
            }
            else{
                if(opened>0) opened--;
                closed++;
            }
            if(closed<0)return false;
        }
        return opened==0;
        
    }
}
