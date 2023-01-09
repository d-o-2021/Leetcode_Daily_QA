class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            int stx=s.indexOf(t);
            int edx=s.lastIndexOf(t);
            if(stx!=edx)
            {
                if(!((distance[t-'a']+1)==(edx-stx)))return false;
            }
        }
        return true;
    }
}
