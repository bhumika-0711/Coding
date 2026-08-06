class Solution {
    public int smallestNumber(int n, int t) {
        while(pro(n)%t!=0){
            n++;
        }
        return n;
    }
    public int pro(int num){
        int mul=1;
        while(num!=0){
                int ld=num%10;
                mul*=ld;
                num/=10;
            }
            return mul;
    }
}