class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int t = 0;

        while (t < image.length) {

            int p = 0;
            int j = image[0].length - 1;

            while (p < j) {
                int temp = image[t][p];
                image[t][p] = image[t][j];
                image[t][j] = temp;
                p++;
                j--;
            }

            t++;
        }
        for (int i = 0; i < image.length; i++) {
            for (int k = 0; k < image[i].length; k++) {
                image[i][k] = 1 - image[i][k];
            }
        }

        return image;
    }
}