import java.util.*;
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int arr[]=new int[operations.length];
        arr[0]=0;
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                x-=1;
            }else if(operations[i].equals("++X") || operations[i].equals("X++")){
                x+=1;
            }
        }
        return x;
    }
}