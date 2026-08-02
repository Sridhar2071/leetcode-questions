class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] box = new int[46];
        int ans = 0;

        for(int i = lowLimit; i <= highLimit; i++) {
            int sum = digitSum(i);
            box[sum]++;
            ans = Math.max(ans, box[sum]);
        }

        return ans;
    }

    private int digitSum(int n) {
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}