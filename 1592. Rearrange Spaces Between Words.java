class Solution {
    public String reorderSpaces(String text) {
        String temp=text.trim();
        //contains all words by removing all groups/single spaces
        String arr[]=temp.split("\\s+");
        int i=0;
        int count=0;//count for spaces in actual text
        while(i<text.length())
        {
            if(text.charAt(i)==' ')
            {
                count++;
            }
            i++;
        }
        String ans="";
        //equal spaces to be alloted
        int spaces=0;
        if(arr.length>1)//for / by zero case 
        spaces=count/(arr.length-1);
        else spaces=count;
        int originalsp=spaces;
        for(String a:arr)
        {
            ans+=a;
            while(count!=0)
            {
                //total count of spaces must be greater than allocating spaces
                while(count>=spaces&&spaces!=0)
                {
                        ans+=' ';
                        spaces--;
                }
                spaces=originalsp;
                if(count<spaces)//if total count spaces is less than allocating spaces e.g: i/p : 
                // "   hello"  o/p: "hello   "
                {
                    while(count!=0)
                    {
                        ans+=' ';
                        count--;
                    }
                }
                count-=spaces;
                break;
            }
        }
        while(count>0)//if total count spaces remained than add at the end of answer!
        {
            ans+=' ';
            count--; 
        }
        return ans;
    }
}
