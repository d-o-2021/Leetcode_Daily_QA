class Solution {
    public String restoreString(String s, int[] indices) {
        TreeMap<Integer,Character>map=new TreeMap<>();
        for(int i=0;i<indices.length;i++)
        {
            map.put(indices[i],s.charAt(i));
        }
        int size=map.size();
        String ans="";
        int i=0;
        while(size!=0)
        {

            ans+=map.remove(i++);
            size--;
        }
        return ans;
    }
}
