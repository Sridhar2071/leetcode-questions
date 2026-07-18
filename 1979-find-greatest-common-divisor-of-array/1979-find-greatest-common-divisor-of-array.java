class Solution {
    static int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans=gcd(nums[0],nums[nums.length-1]);
        return ans;
    }
}