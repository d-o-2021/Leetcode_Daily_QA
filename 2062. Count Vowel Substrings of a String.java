class Solution {
    public boolean solve(String s)
    {
        Set<Character>set=new HashSet<>();
        for(char i:s.toCharArray())
        {
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
            set.add(i);
            else return false;
        }
        return set.size()==5;
    }
    public int countVowelSubstrings(String word) {
        Set<String> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<word.length()-4;i++)
        {
            for(int j=i+4;j<word.length();j++)
            {
                String temp="";
                for(int k=i;k<=j;k++)
                {
                    temp+=word.charAt(k);
                }
                if(set.contains(temp))
                {
                    ans++;
                }
                else if(solve(temp))
                {
                    set.add(temp);
                    ans++;
                }
            }
        }
        // System.out.println(set);
        return ans;
    }
}
