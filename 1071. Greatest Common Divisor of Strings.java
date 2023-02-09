import java.util.regex.*;
class Solution {
    public boolean check(String s1,String s2,String temp)
    {
        String add=temp;
        int len=temp.length();
        int i=s1.length()/len;
        while(i!=1)
        {
            temp+=add;
            i--;
        }
        if(!temp.equals(s1))return false;
        temp=add;
        len=temp.length();
        i=s2.length()/len;
        while(i!=1)
        {
            temp+=add;
            i--;
        }
        if(!temp.equals(s2))return false;
        return true;
    }
    public boolean gcd(String s1,String s2,int i)
    {
        int len1=s1.length();int len2=s2.length();
        if(len1%i>0||len2%i>0)return false;
        else 
        {
            String temp=s1.substring(0,i);
            if(check(s1,s2,temp))
            {
                return true;
            }
        }
        return false;
    }
    public String gcdOfStrings(String str1, String str2) {
        for(int i=Math.min(str1.length(),str2.length());i>=1;i--)
        {
            if(gcd(str1,str2,i))return str1.substring(0,i);
        }
        return "";
    }
}
