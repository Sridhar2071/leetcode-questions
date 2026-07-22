class Solution {
    public String longestCommonPrefix(String[] strs) {
      String res = "";

for (int j = 0; j < strs[0].length(); j++) {     
    for (int i = 0; i < strs.length - 1; i++) { 
        if (j >= strs[i + 1].length() || 
            strs[i].charAt(j) != strs[i + 1].charAt(j)) {
            return res;
        }
    }
    res += strs[0].charAt(j); 
}

return res;

    }
}