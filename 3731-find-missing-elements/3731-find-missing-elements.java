class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int max=-999,min=9999;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            set.add(nums[i]);
        }
        int n=min;
        while(n<=max){
            if(!set.contains(n))
            res.add(n);
            n++;
        }
        return res;
    }
}