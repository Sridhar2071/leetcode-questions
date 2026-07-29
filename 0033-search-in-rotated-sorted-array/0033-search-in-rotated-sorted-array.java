class Solution {
    public int search(int[] nums, int target) {
        int a=nums.length;
      int start=0;
      int end=a-1;
      int ans=-1;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target) return mid;
        if(nums[mid]<=nums[end]){
            if(nums[mid]<target && nums[end]>=target){
                ans=mid+1;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        else {
            if(nums[start]<=target && nums[mid]>target){
                ans=mid-1;
                end=mid-1;

            }else{
                start=mid+1;
            }
        }
      }
      return -1;
     }
}