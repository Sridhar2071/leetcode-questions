class Solution {
    public int minAddToMakeValid(String s) {
        // int count=0;
        // int c=0;
        // if(s.length()==0) return 0;
        // for(int i=0;i<s.length();i++){
        //     char ch= s.charAt(i);
        //     if(ch=='('){
        //         count++;
        //     }else if (ch==')'){
        //         c++;
        //     }
        // }
        // return Math.abs(count-c);
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    st.push(ch);
                }
                else if(st.peek()=='(' && ch==')'){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}