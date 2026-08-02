class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
       for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       List<Character>[] bucket=new ArrayList  [s.length()+1];
       for(int i=0;i<bucket.length;i++){
        bucket[i]=new ArrayList();
       }
       for(char key:map.keySet()){
        int freq=map.get(key);
        bucket[freq].add(key);
       }
       StringBuilder str=new StringBuilder();
       for(int i=bucket.length-1;i>=0;i--){
            for(char ch : bucket[i]){
                for(int j=0;j<map.get(ch);j++){
                    str.append(ch);
                }
            }
        }
       return new String(str);
    }
}