class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]= new int[nums.length];
        int k=0;
    //   for(int i=0;i<nums.length;i++){
    //     if(i%2==0){
    //         arr[i]=nums[k++];
    //     }else if (i%2!=0 && n<nums.length){
    //         arr[i]=nums[n++];
    //     }
    //   }  
    int a=0;
    int b=n;
    int i=0;
    while(n!=0){
        arr[i]=nums[a++];
        arr[i+1]=nums[b++];
        n--;
        i=i+2;
    }
      return arr;
    }
}