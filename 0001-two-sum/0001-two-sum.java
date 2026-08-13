class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n = nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int req=t-nums[i];
            if(map.containsKey(req)){
                return new int[] {i,map.get(req)};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}