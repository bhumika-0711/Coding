class Solution {
    static final int MOD = 1000000007;
    public int sumSubarrayMins(int[] arr) {
        long res=0;
        int n=arr.length;
        int[] nse=nse(arr);
        int[] pse=pse(arr);
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            res=(res+(long)left*right*arr[i])%MOD;
        }
        return (int)res;
    }
    private int[] nse(int arr[]){
        int n=arr.length;
        int[] nums=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            st.pop();
        if(st.isEmpty())
        nums[i]=n;
        else
        nums[i]=st.peek();
        st.push(i);
        }
        return nums;
    }
    private int[] pse(int arr[]){
        int n=arr.length;
        int[] nums=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            st.pop();
        
        if(st.isEmpty())
        nums[i]=-1;
        else
        nums[i]=st.peek();
        st.push(i);
        }
        return nums;
    }
}