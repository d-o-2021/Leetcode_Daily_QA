class pair
{
    char ch;
    int frq;
    pair(char ch,int frq)
    {
        this.ch=ch;
        this.frq=frq;
    }
}
class Solution {
    public String reorganizeString(String s) {
        int map[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            map[s.charAt(i)-'a']++;
        }
        PriorityQueue<pair> q=new PriorityQueue<>((a,b)->(b.frq-a.frq));
        for(int i=0;i<26;i++)
        {
            if(map[i]>0)
            {
                q.add(new pair((char)('a'+i),map[i]));
            }
        }
        StringBuilder ans=new StringBuilder();
        pair poped=q.remove();
        ans.append(poped.ch);
        poped.frq--;
        while(q.size()>0)
        {
            pair temp=q.remove();
            ans.append(temp.ch);
            temp.frq--;
            if(poped.frq>0)
            {
                q.add(poped);
            }
            poped=temp;
        }
        if(poped.frq>0)return "";
        return ans.toString();
    }
}
