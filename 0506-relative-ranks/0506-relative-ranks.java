class Solution {
    public String[] findRelativeRanks(int[] score) {
        int [] arr=new int[score.length];
        for(int i=0;i<score.length;i++){
            arr[i]=score[i];
        }
         int [] r=new int[score.length];
        Arrays.sort(score);
        for(int i=0;i<score.length;i++){
            for(int j=0;j<score.length;j++){
                if(arr[i]==score[j]){
                    r[i]=j;
                }
            }
        }String[] arr1 = new String[score.length];
       for(int i=0;i<r.length;i++){
        if(r[i]==r.length-1){
            arr1[i]="Gold Medal";
        }else if (r[i]==r.length-2){
            arr1[i]="Silver Medal";
        }else if(r[i]==r.length-3){
            arr1[i]="Bronze Medal";
        }else{
            String s="";
            s+=r.length-r[i];
            arr1[i]=s;
        }
       }
       return arr1;
    }
}