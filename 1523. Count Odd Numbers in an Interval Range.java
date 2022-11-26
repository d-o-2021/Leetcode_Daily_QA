class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int num=high-low-1;
        if(num==0)return 1;//case in which two alternate number comes ;
        else if(num<0)//num only become negative when same number where given!!
        {
            return low%2;
        }
        if(num%2==0)//if elements between range is even therefore its simple that half of them were eodd
        {
            if(low%2!=0){count+=1;}
            if(high%2!=0){count+=1;}
            count+=num/2;
            return count;
        }
        else//if elements b/w them were not even in number
        {   
            if(low%2==0)//since no. b/w rannge is odd in number therefore if starting is even than ending must be even also
            {
                count+=num/2+1;
                return count;
            }
            else//ending and starting both were odd
            {
                count+=num/2+2;
                return count;
            }
        }
    }
}
