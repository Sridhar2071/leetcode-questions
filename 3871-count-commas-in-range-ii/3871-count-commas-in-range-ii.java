class Solution {
    public long countCommas(long n) {
        long coma=0;
        long power=1000;
        while(power<=n){
            coma+=n-power+1;
            power=power*1000;
           
        }
        return coma;
    }
}