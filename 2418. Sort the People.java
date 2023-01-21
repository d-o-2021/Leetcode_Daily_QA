//insertion sort
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=1;i<heights.length;i++)
        {
            int value=heights[i];
            String name=names[i];
            int j;
            for(j=i;j>0;j--)
            {
                if(heights[j-1]<value)
                {
                    heights[j]=heights[j-1];
                    names[j]=names[j-1];
                }
                else
                {
                    break;
                }
            }
            heights[j]=value;
            names[j]=name;
        }
        return names;
    }
}
