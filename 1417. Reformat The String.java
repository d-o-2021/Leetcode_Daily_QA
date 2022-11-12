class Solution {
    public String reformat(String s) {
        String alph="";
        String num="";
        for(char ch:s.toCharArray())
        {
            if(ch>='a'&&ch<='z')
            {
                alph+=ch;
            }
            else
            {
                num+=ch;
            }
        }
        String ans="";
        //case 1 : if length equal
        //if length of both alphabet string and numeric string were equal then there must exists a permutation 
        if(alph.length()==num.length())
        {
            int i=0;int j=0;
            while(i<alph.length())
            {
                ans+=alph.charAt(i++);
                ans+=num.charAt(j++);
            }
            return ans;
        }
        //case 2 :  if there length diffrence is equal to 1 then also we can generate a permutaion
        //I : if length of alphabet string is more than we must include 1st char of alphabet
        else if(alph.length()-1==num.length())
        {
            int i=0;int j=0;
            while(j<num.length())
            {
                ans+=alph.charAt(i++);
                ans+=num.charAt(j++);
            }
            ans+=alph.charAt(j);
            return ans;
        }
        //II : if length of number string is more than we must include 1st char of number
        else if(alph.length()+1==num.length())
        {
            int i=0;int j=0;
            while(i<alph.length())
            {
                ans+=num.charAt(j++);
                ans+=alph.charAt(i++);
            }
            ans+=num.charAt(j);
            return ans;
        }
        return ans;
    }
}
