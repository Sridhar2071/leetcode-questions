import java.util.*;
import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder s = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            s.append(num[i]);
        }

        BigInteger n = new BigInteger(s.toString());
        BigInteger ans = n.add(BigInteger.valueOf(k));

        String sc = String.valueOf(ans);

        for (int i = 0; i < sc.length(); i++) {
            list.add(sc.charAt(i) - '0');
        }

        return list;
    }
}