class Solution {
    public String fractionToDecimal(int n, int d) {
        StringBuilder res=new StringBuilder();
        if(n==0)return "0";

        if((n<0) != (d<0)){
            res.append("-");
        }
        long num=Math.abs((long)n);
        long den=Math.abs((long)d);
        //Integer part calculate
        // res.append(Integer.toString(n/d));
        res.append(num/den);

        // calculating remender 
        long rem=num%den;
            if(rem==0)return res.toString();

        res.append(".");
        Map<Long,Integer> map=new HashMap<>();

        while(rem!=0){
            if(map.containsKey(rem)){
                int index=map.get(rem);
                res.insert(index,"(");
                res.append(")");
                break;
            }

            map.put(rem,res.length());
            rem=rem*10;
            res.append(rem/den);
            rem=rem%den;

        }
        return res.toString();
    }
}