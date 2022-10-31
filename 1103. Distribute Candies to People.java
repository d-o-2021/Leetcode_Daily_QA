class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int ans[]=new int[num_people];
        int index=0;
        int count=1;
        while(candies!=0)//7!=0
        {
            if(candies-count>=0)//1-4=X
            {
                ans[index%ans.length]+=count;//ans[2]=3
                index++;//3
            }
            else
            {
                ans[index%ans.length]+=candies;//ans[3]=1
                break;
            }
            candies-=count;//1
            count++;//4
        }
        return ans;
    }
}
