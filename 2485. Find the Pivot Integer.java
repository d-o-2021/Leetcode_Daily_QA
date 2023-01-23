class Solution {
    public int sumleft(int mid,int i)
    {
        int sum=0;
        while(i!=mid)
        {
            sum+=i;
            i++;
        }
        sum+=i;
        return sum;
    }
    public int sumright(int mid,int n)
    {
        int sum=0;
        while(mid!=n)
        {
            sum+=mid;
            mid++;
        }
        sum+=mid;
        return sum;
    }
    public int pivotInteger(int n) {
        int st=1;
        int ed=n;
        int mid=st+(ed-st)/2;
        while(st<=ed)
        {
            if(sumleft(mid,1)==sumright(mid,n))
            {
                return mid;
            }
            else if(sumleft(mid,1)<sumright(mid,n))
            {
                st=mid+1;
            }
            else ed=mid-1;
            mid=st+(ed-st)/2;
        }
        return -1;
    }
}
