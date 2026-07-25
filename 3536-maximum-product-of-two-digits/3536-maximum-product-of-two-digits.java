class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while (n != 0) {
            list.add(n % 10);
            n /= 10;
        }

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                ans = Math.max(ans, list.get(i) * list.get(j));
            }
        }

        return ans;
    }
}