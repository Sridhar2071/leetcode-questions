class Solution {
    public int missingMultiple(int[] nums, int k) {
       HashSet<Integer> set = new HashSet<>();
       for(int i: nums){
        set.add(i);
       }
       int multi=k;
       while(set.contains(multi)){
        multi+=k;
       }
       return multi;
    }
}