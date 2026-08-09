class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int mr = m;
        int mc = n;

        for(int i = 0; i < ops.length; i++) {
            mr = Math.min(mr, ops[i][0]);
            mc = Math.min(mc, ops[i][1]);
        }
     return mr*mc;   
    }
}