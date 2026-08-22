class Solution {
    static int digsum(int a){
        if(a>=0 && a<=9) return a;
        return digsum(a/10)+(a%10);
    }
    static int digpro(int b){
        if(b>=0 && b<=9) return b;
        return digpro(b/10)*(b%10);
    }
    public boolean checkDivisibility(int n) {
        int sum=digsum(n);
        int pro=digpro(n);
        int fina= sum+pro;
        if(n%fina==0) return true;
        return false;
    }
}