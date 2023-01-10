class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[]=new int[s.length()];
        for(int i=0;i<ans.length;i++)
        {
            if(s.charAt(i)==c)ans[i]=0;
            else 
            {
                String left=s.substring(0,i);
                String right="";
                if(i<ans.length-1)
                    right=s.substring(i+1,s.length());
                int lx=left.lastIndexOf(c);
                int rx=right.indexOf(c);
                if(lx==-1)
                {
                    lx=Integer.MAX_VALUE;
                }
                else lx=i-lx;//last index will be clossest to current alphabet therefore substraction current index from last index from left substring
                if(rx==-1)
                {
                    rx=Integer.MAX_VALUE;
                }
                else rx+=1;//right substring starts with one charchter ahead of current char thterfore found charchter is one less as compared to current char thter we were adding one to it
                ans[i]=Math.min(lx,rx);
            }
        }
        return ans;
    }
}
