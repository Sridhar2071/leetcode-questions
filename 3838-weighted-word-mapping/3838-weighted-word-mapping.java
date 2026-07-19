class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int k=0;
        String s="";
        for(int i=0;i<words.length;i++){
             int sum=0;
             int mod=0;
            for(int j=0;j<words[i].length();j++){
                 char ch =words[i].charAt(j);
                 int pos=ch-'a';
                sum+=weights[pos];
            }
            mod=sum%26;
            s+=(char)('z'- mod);
        }
    return s;
    }
}