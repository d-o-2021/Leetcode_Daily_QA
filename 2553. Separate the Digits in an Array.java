class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i:nums)
        {
            String temp=""+i;
            for(int j=0;j<temp.length();j++)
            {
                ar.add((temp.charAt(j)-'0'));
            }
        }
        int ans[]=new int[ar.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=(int)ar.get(i);
        }
        return ans;
    }
}
