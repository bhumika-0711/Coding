class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char curr=num.charAt(i);
            while(!st.isEmpty() && (st.peek()>curr && k>0)){
                st.pop();
                k--;
            }
            st.push(curr);
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());

        }
        str.reverse();
        int i=0;
        while(i<str.length() && str.charAt(i)=='0'){
            i++;
        }
        String res=str.substring(i);
        if (res.length()==0)return "0";
        return res;
    }
}