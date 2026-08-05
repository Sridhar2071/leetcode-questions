class Solution {
    public int calPoints(String[] operations) {
       
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("+")){
                int sum=st.pop();
                int s=sum+st.peek();
                st.push(sum);
                st.push(s);
            }else if(ch.equals("D")){
                int sum=st.peek();
                st.push(2*sum);
            }else if (ch.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        int l=0;
        while(st.size()>0){
            l+=st.pop();
        }
        return l;
    }
}