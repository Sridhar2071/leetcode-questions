class Solution {
    public int countCommas(int n) {
     String s = String.valueOf(n);
     int l = s.length();
     if(n>=1000 && n<=100000){
        return (n-1000)+1;
     }
     return 0;
         }
}