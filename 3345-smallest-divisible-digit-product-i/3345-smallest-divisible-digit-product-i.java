class Solution {
    static int digit(int n){
        if(n>=0  && n<=9) return n;
       return digit(n/10)*(n%10);
    }
    public int smallestNumber(int n, int t) {
        int i=n;
        int min=Integer.MAX_VALUE;
        while(i<=100){
            if(digit(i)%t==0){
                min=Math.min(i,min);
            }
            i++;
        }
        return min;
    }
}