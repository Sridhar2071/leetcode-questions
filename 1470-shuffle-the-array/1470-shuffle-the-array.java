class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]= new int[nums.length];
        int k=0;
      for(int i=0;i<nums.length;i++){
        if(i%2==0){
            arr[i]=nums[k++];
        }else if (i%2!=0 && n<nums.length){
            arr[i]=nums[n++];
        }
      }  
      return arr;
    }
}