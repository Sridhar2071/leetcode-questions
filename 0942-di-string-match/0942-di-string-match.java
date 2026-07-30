class Solution {
    public int[] diStringMatch(String s) {
        int max=s.length();
        int min=0;
        int arr[] = new int[max+1];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='I'){
                arr[i]=min++;
            }else{
                arr[i]=max--;
            }
        }
        arr[s.length()]=max;
        return arr;

    }
}