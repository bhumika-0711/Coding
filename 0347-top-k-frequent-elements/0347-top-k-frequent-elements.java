class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();
        }
        for(int key:map.keySet()){
            int freq=map.get(key);  //extractinng value
            bucket[freq].add(key);
        }
        int[] res=new int[k];
        int p=0;
        for(int i=bucket.length-1;i>=0;i--){
            for(int num:bucket[i])
            res[p++]=num;
            if(p==k)break;
        }
        return res;
    }
}