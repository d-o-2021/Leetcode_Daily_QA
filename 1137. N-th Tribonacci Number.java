class Solution {
    public int tribonacci(int n) {
        int a=0,b=1,c=1;
        int sum=0;
        if(n==0)return 0;
        else if(n==1||n==2)return 1;
        while(n>=3){
            sum = a+b+c;
            a=b;
            b=c;
            c=sum;
            n--;
        }
        return sum;
    }
}
