class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=num;
        int num1=0;
        while(n!=0)
        {
            num1=num1*10+n%10;
            n/=10;
        }
        int num2=0;
        while(num1!=0)
        {
            num2=num2*10+num1%10;
            num1/=10;
        }
        return num==num2;
    }
}
