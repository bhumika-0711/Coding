class Solution {
    public int maxDepth(String s) {
        int d=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')d++;
            if(s.charAt(i)==')')d--;
            max=Math.max(max,d);
        }
        return max;
    }
}