class Solution {
    public int[] countBits(int n) {
    int arr[]= new int[n+1];
     int i=0;
     while(i<=n){
        int count=0;
        int k=i;
        while(k!=0){
            if(k%2 == 1){
                count++;
            }
            k=k/2;
        }
        arr[i]=count;
        i++;
     }
     return arr;
    }
}