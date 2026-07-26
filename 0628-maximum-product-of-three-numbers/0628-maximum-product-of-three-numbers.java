class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length;
        int p=nums[a-1]*nums[a-2]*nums[a-3];
        int p1=nums[0]*nums[1]*nums[a-1];
     return Math.max(p,p1);
}
}