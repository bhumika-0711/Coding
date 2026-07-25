class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] preSum=new int[n][m];
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=matrix[i][j]-'0';
            if(matrix[i][j]=='0'){
                sum=0;
            }
            preSum[i][j]=sum;
            }
        }
        int maxSum=0;
        for(int i=0;i<n;i++){
            maxSum=Math.max(maxSum,lrec(preSum[i]));
        }
        return maxSum;
    }
    public int lrec(int[] nums){
        int n=nums.length;
        int pse[]=pse(nums);
        int[] nse=nse(nums);
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]*(nse[i]-pse[i]-1));
        }
        return max;
    }
    public int[] nse(int nums[]){
        int n=nums.length;
        int[] nse=new int[n];
        Stack<Integer> st=new Stack<Integer>();
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
    public int[] pse(int nums[]){
        int n=nums.length;
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<Integer>();
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