class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        ArrayList<Integer> list =new ArrayList<>();
        int k=0;
        int [][] mat2 = new int[r][c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                list.add(mat[i][j]);
            }
        }
        if (mat.length * mat[0].length != r * c) {
                 return mat;
            }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat2[i][j]=list.get(k++);
            }
        }
        return mat2;
    }
}