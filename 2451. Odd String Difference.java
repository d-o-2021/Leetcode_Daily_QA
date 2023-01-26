class Solution {
    public String oddString(String[] words) {
        String sumf="";
        String suml="";
        for(int i=0;i<words[0].length()-1;i++)
        {
            sumf+=((words[0].charAt(i+1)-'a')-(words[0].charAt(i)-'a'));
            sumf+=',';
        }
        for(int i=0;i<words[0].length()-1;i++)
        {
            suml+=((words[words.length-1].charAt(i+1)-'a')-(words[words.length-1].charAt(i)-'a'));
            suml+=',';
        }
        if(sumf.equals(suml))
        {
            for(int i=1;i<words.length-1;i++)
            {
                String temp="";
                for(int j=0;j<words[i].length()-1;j++)
                {
                    temp+=((words[i].charAt(j+1)-'a')-(words[i].charAt(j)-'a'));
                    temp+=',';
                }
                if(!(temp.equals(sumf)))return words[i];
            }
        }
        else
        {
            String temp="";
            for(int j=0;j<words[0].length()-1;j++)
            {
                temp+=((words[1].charAt(j+1)-'a')-(words[1].charAt(j)-'a'));
                temp+=',';
            }
            if(temp.equals(sumf))return words[words.length-1];
            else return words[0];
        }
        return "";        
    }
}
