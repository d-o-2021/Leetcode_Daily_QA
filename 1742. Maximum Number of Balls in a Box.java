class Solution {
    public int sum(int i)
    {
        int s=0;
        while(i!=0)
        {
            s+=i%10;
            i/=10;
        }
        return s;
    }
    public int countBalls(int lowLimit, int highLimit) {
        int arr[]=new int[45];
        for(int i=lowLimit;i<=highLimit;i++)
        {
            arr[sum(i)-1]++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])max=arr[i];
        }
        return max;
    }
}
