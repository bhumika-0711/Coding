class Solution {
    public int majorityElement(int[] nums) {
        // int cnt=0;
        // int ele=0;
        // for(int i=0;i<nums.length;i++){
        //     // boyee mootre voting
        //     if(cnt==0){
        //         cnt=1;
        //         ele=nums[i];
        //     }else if(nums[i]==ele){
        //         cnt++;
        //     }else{
        //         cnt--;
        //     }
        // }
        // return ele;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        map.put(n,map.getOrDefault(n,0)+1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        if(entry.getValue()>nums.length/2)return entry.getKey();
        return 0;
    }
}