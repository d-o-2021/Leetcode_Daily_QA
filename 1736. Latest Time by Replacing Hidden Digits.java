class Solution {
    public String maximumTime(String time) {
    char arr[]=time.toCharArray();
    for(int i=0;i<time.length();i++)
    {
        if(arr[i]=='?')
        {
            if(i==0)
            {
                if(arr[1]=='?')
                arr[i]='2';
                else
                {
                    if(arr[1]>'3')arr[i]='1';
                    else arr[i]='2';
                }
            }
            else if(i==1)
            {
                if(arr[i-1]=='0'||arr[i-1]=='1')
                {
                    arr[i]='9';
                }
                else
                arr[i]='3';
            }
            else if(i==3)
            {
                arr[i]='5';
            }
            else if(i==4)
            {
                arr[i]='9';
            }
        }
    }
    return new String(arr);
    }
}
