class Solution {
    public boolean checkZeroOnes(String s) {
        int maxi1=0;
            int maxi0=0;
        if(s.length()==1)
        {
            if(s.charAt(0)=='0')return false;
            else return true;
        }
        for(int i=0;i<s.length()-1;i++)
        {
            int max1=1;
            int max0=1;
            while(i<s.length()-1&&s.charAt(i)=='1'&&s.charAt(i+1)=='1')
            {
                max1++;
                i++;
            }
            while(i<s.length()-1&&s.charAt(i)=='0'&&s.charAt(i+1)=='0')
            {
                max0++;
                i++;
            }
            if(max1>maxi1)maxi1=max1;
            if(max0>maxi0)maxi0=max0;
        }
        if(maxi1>maxi0)return true;
        return false;
    }
}


