class Solution {
    public boolean isValid(String temp)
    {
        int countr=0;
        int countl=0;
        for(int i=0;i<temp.length();i++)
        {
            if(temp.charAt(i)=='R')
            {
                countr++;
            }
            else
            {
                countl++;
            }
        }
        return countr==countl;
    }
    public int balancedStringSplit(String s) {
        int count=0;
        String temp="";
        int st=0;
        int ed=2;
        while(ed<s.length())
        {
            temp=s.substring(st,ed);
            if(isValid(temp))
            {
                count++;
                st=ed;
                ed=st+2;
            }
            else
            {
                ed++;
            }
        }
        return count+1;
    }
}
