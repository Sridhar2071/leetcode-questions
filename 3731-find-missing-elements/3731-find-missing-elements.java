class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
        int arr[]=new int[max-min+1];
          Arrays.sort(nums);
        int k=0;
        for(int i=min;i<=max;i++){
            arr[k]=i;
            k++;
        }
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]==nums[j]){
                i++;
                j++;
            }else{
                list.add(arr[i]);
                i++;
            }
        }
        
        return list;
    }
}