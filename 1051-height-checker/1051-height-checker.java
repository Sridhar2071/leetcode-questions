class Solution {
    public int heightChecker(int[] heights) {
        int ar[]= new int[heights.length];
        for(int i=0;i<heights.length;i++){
            ar[i]=heights[i];
        }
        int count=0;
        Arrays.sort(heights);
        int i=0;
        while(i<heights.length){
            if(ar[i]!=heights[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}