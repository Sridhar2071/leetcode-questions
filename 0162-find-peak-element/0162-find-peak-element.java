class Solution {
    public int findPeakElement(int[] nums) {
       //binary search concept
       int start=0;
       int end=nums.length-1;
    //    if(nums.length<=1) return 0;
    //     if(nums.length==2) {
    //         return (nums[0]>nums[1]?0:1);
    //     }
       while(start<end){
        int mid=start+(end-start)/2;
        if(nums[mid]<nums[mid+1]){
            start=mid+1;
        }else{
            end=mid;
        }
       }
       return start; 
    }
}