class Solution {
    public boolean rotateString(String s, String goal) {
        //BRUTE FORCE 

    //     String res="";
    //     for(int i=0;i<s.length();i++){
    //         res=rot(s);
    //         if(res.equals(goal))return true;
    //         s=res;
    //     }
    //     return false;
    // }
    // private String rot(String str){
    //     String res="";
    //     for(int i=1;i<str.length();i++){
    //         res+=str.charAt(i);
    //     }
    //     res+=str.charAt(0);
    //     return res;

    // OPTIMAL APPROCH
    if(s.length()!=goal.length())return false;
    return (s+s).contains(goal);
    }
}