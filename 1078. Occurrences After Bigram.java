class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String arr[]=text.split(" ");
        List<String> list =new ArrayList<>();
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i].equals(first))
            {
                if(arr[i+1].equals(second))
                {
                    if(i<arr.length-2)
                    {
                        list.add(arr[i+2]);
                    }
                }
            }
        }
        String ans[]=new String[list.size()];
        list.toArray(ans);
        return ans;
    }
}
