class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> ar1= new ArrayList<>();
        ArrayList<Integer> ar2= new ArrayList<>();
        // for(int i=0;i<nums.length-1;i=i+2){
        //     ar1.add(nums[i]);
        // }
        //  for(int t=1;t<nums.length-1;t=t+2){
        //     ar2.add(nums[t]);
        // }
ar1.add(nums[0]);
ar2.add(nums[1]);

for(int i = 2; i < nums.length; i++) {
    if(ar1.get(ar1.size()-1) > ar2.get(ar2.size()-1)) {
        ar1.add(nums[i]);
    } else {
        ar2.add(nums[i]);
    }
}
        int arr[] = new int[nums.length];
        int k=0;
        for(int i :ar1){
            arr[k++]=i;
        }
        for(int j : ar2){
            arr[k++]=j;
        }
        return arr;
    }
}