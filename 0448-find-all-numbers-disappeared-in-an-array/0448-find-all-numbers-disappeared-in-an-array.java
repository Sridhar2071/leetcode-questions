class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     List<Integer> list=new ArrayList<>();
      Arrays.sort(nums);
      int i=0;
      int j=1;
     while(j <= nums.length) {
         if(i < nums.length && nums[i] < j){
                i++;
            }else if(i < nums.length && nums[i] == j){
                i++;
                j++;
            }else{
                list.add(j);
                j++;
            }
      }
      return list;//[1,2,3,4,7,8]
                //[1,2,3,4,5,6,7,8]
    }
}