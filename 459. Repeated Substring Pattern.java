class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // abab
        // 0123
        int n=s.length();
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                StringBuilder repeat=new StringBuilder(); 
                for(int j=0;j<n/i;j++)
                {
                    repeat.append(s.substring(0,i));
                }  
                if(repeat.toString().equals(s))return true;
            }
        }
        return false;
    }
}
