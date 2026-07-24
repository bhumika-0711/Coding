class Solution {
    public int largestRectangleArea(int[] nums) {
        int[] pse=pse(nums);
        int[] nse=nse(nums);
        int maxarea=0;
        for(int i=0;i<nums.length;i++){
            maxarea=Math.max(maxarea,nums[i]*(nse[i]-pse[i]-1));
        }
        return maxarea;
    }
    private int[] nse(int[] nums){
        int n=nums.length;
        int nse[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i])
            st.pop();
            if(st.isEmpty())
            nse[i]=n;
            else
            nse[i]=st.peek();
            st.push(i); 
        }
        return nse;
    }
    private int[] pse(int[] nums){
        int n=nums.length;
        int pse[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i])
            st.pop();
            if(st.isEmpty())
            pse[i]=-1;
            else
            pse[i]=st.peek();
            st.push(i);
        }
        return pse;
    }
}
