class Solution {
    public boolean checkYear(int year)
    {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }
    public int dayOfYear(String date) {
        int day=Integer.parseInt(date.substring(8,10));
        int mon=Integer.parseInt(date.substring(5,7));
        int yr=Integer.parseInt(date.substring(0,4));
        int ans=0;
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        ans+=day;
        for(int i=0;i<mon-1;i++)
        {
        if(checkYear(yr)&&i==1)ans+=(arr[i]+1);
        else ans+=arr[i];
        }
        return ans;
    }
}
