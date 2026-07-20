class Solution {
    public long subArrayRanges(int[] nums) {
        return max(nums)-min(nums);
    }

    public long max(int nums[]){
        int[] nge=nge(nums);
        int[] pge=pge(nums);
        long reqmax=0;
        for( int i=0;i<nums.length;i++){
            long left=i-pge[i];
            long right=nge[i]-i;
            reqmax+=left*right*nums[i];
        }
        return reqmax;
    }

    public long min(int nums[]){
        int[] nse=nse(nums);
        int[] pse=pse(nums);
        long reqmin=0;
        for( int i=0;i<nums.length;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            reqmin+=left*right*nums[i];
        }
        return reqmin;
    }

    public int[] nge(int nums[]){
        int n=nums.length;
        int nge[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){  //working with index not number.
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=n;
            }else{
                nge[i]=st.peek();
            }
            st.push(i);
        }
        return nge;
    }

    public int[] pge(int nums[]){
        int n=nums.length;
        int pge[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pge[i]=-1;
            }else{
                pge[i]=st.peek();
            }
            st.push(i);
        }
        return pge;
    }

    public int[] nse(int nums[]){
        int n=nums.length;
        int nse[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        return nse;
    }

    public int[] pse(int nums[]){
        int n=nums.length;
        int pse[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        return pse;
    }
}


// You are still storing values in Stack ❌
// st.push(nums[i])    st.push(i);