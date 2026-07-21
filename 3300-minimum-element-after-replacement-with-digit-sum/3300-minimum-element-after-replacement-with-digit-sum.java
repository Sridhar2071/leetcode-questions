class Solution {
    static int sum(int num){
        if(num>=0 && num<=9) return num;
        return sum(num/10)+num%10;
    }
   
    public int minElement(int[] nums) {
      int arr [] = new int[nums.length];
     for(int i=0;i<nums.length;i++){
        arr[i] = sum(nums[i]);
     }
    Arrays.sort(arr);
        return arr[0];
    }
}