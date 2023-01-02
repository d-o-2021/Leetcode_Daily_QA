class Solution {
    public int sumBase(int n, int k) {
        int x=Integer.parseInt(""+n,10);
        String s=Integer.toString(x,k);
        int num=Integer.parseInt(s);
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
