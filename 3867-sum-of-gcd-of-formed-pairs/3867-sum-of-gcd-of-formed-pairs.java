class Solution {
    public  int gcd(int nums,int mx){
        if(mx==0){
            return nums;
        }
            return gcd(mx,nums%mx);
        }
    public long gcdSum(int[] nums) {
        int mx=0;
        int prefixGcd [] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
           mx=Math.max(mx,nums[i]);
            prefixGcd[i]=gcd(nums[i],mx);
        }
          Arrays.sort(prefixGcd);

        long sum = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }
        return sum;

    }
}