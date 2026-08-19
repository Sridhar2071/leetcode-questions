class Solution {
    public int mirrorDistance(int n) {
        int revn=0,t=n;
    while(n!=0){
        int rev=n%10;
        revn=revn*10+rev;
        n=n/10;
    }
    return Math.abs(revn-t);
    }
}