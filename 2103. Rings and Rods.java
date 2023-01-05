class Solution {
    public int countPoints(String rings) {
        String arr[]=new String[10];//rod array :  10 rods
        for(int i=1;i<rings.length();i+=2)
        {
            if(arr[(rings.charAt(i)-'0')]!=null)//if rod contains any of the ring already
            {
                if(arr[(rings.charAt(i)-'0')].indexOf((""+rings.charAt(i-1)))!=-1)//if rod already have that same color ring than continue don't add again
                {
                    continue;
                }
                else//if ring is of diff color than add ring color to that rod 
                {
                    arr[(rings.charAt(i)-'0')]+=rings.charAt(i-1);
                }
            }
            else//rod is empty
            {
                arr[(rings.charAt(i)-'0')]=""+rings.charAt(i-1);//adding ring to rod index
            }
        }
        int ans=0;
        for(int i=0;i<10;i++)
        {
            if(arr[i]!=null&&arr[i].length()==3)ans++;//count those rods with all three rings by length of string == 3 
        }
        return ans;
    }
}
