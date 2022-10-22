class Solution {
    public String digitSum(String s, int k) {
        String ans=s;
        while(k<s.length()){
            ans="";
            int st=0;
        while(st<s.length())
        {
            String sub="";
            if(k+st>=s.length())
            sub=s.substring(st,s.length());
            else
            sub=s.substring(st,st+k);    
            int sum=0;
            for(int i=0;i<sub.length();i++)
            {
                sum+=Integer.parseInt(""+sub.charAt(i));
            }
            ans+=sum;
            st+=k;
        }
        s=ans;
    }
        return ans;
    }
}
