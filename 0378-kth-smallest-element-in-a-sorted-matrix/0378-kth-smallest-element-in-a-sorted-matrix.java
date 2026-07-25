class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // ArrayList<Integer> list = new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[]= new int[m*n];
        int p=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
               arr[p++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        if(arr.length==1) return arr[0];
        return arr[k-1];
        
    }
}