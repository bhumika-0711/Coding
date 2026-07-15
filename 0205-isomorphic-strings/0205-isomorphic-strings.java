class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char orignal=s.charAt(i);
            char replacement=t.charAt(i);
            if(!map.containsKey(orignal)){
                if(!map.containsValue(replacement)){
                    map.put(orignal,replacement);
                }else{
                    return false;
                }
            }else{
                char mapchar=map.get(orignal);
                if(mapchar!=replacement)
                return false;
            }
        }
        return true;
    }
}