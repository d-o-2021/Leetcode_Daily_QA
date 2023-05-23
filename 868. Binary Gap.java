import java.math.*;
class Solution {
    public BigInteger binary(BigInteger n)
    {
        if(n.equals(BigInteger.ZERO))return BigInteger.ZERO;
        else 
        return n.mod(BigInteger.TWO).add(BigInteger.TEN.multiply(binary(n.divide(BigInteger.TWO))));
    }
    public int binaryGap(int n) {
        BigInteger b=new BigInteger(""+n);
        String ans=""+binary(b);
        System.out.println(ans);
        int max_diff=0;  
        for(int i=0;i<ans.length()-1;i++)
        {
            if(ans.charAt(i)!='0')
            {
                int j=i+1;
                boolean flag=false;
                while(j<ans.length()&&ans.charAt(j)!='1')
                {
                    j++;
                    flag=true;
                }
                if(j<ans.length()&&((j-i)>max_diff))
                {
                    max_diff=j-i;
                    i=j-1;
                }
            }
        }
        return max_diff;
    }
}
