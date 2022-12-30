class Solution {
    public boolean similar(int[] attd2,int attd[])
    {
        for(int i=0;i<26;i++)
        {
            if((attd2[i]==0&&attd[i]!=0)||(attd2[i]!=0&&attd[i]==0))
            if(Math.min(attd2[i],attd[i])==0)return false;
        }
        return true;
    }
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++)
        {
            int attd[]=new int[26];
            for(int k=0;k<words[i].length();k++)
            {
                attd[words[i].charAt(k)-'a']++;
            }
            for(int j=i+1;j<words.length;j++)
            {
                int attd2[]=new int[26];
                for(int l=0;l<words[j].length();l++)
                {
                    attd2[words[j].charAt(l)-'a']++;
                }
                if(similar(attd2,attd))
                {
                    count++;
                    System.out.println(words[i]+" "+words[j]);
                }
            }
        }
        return count;
    }
}
