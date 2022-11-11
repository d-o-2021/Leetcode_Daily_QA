class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String>map=new HashMap<>();
        for(List<String> arr:paths)
        {
            map.put(arr.get(0),arr.get(1));
        }
        String ans="";
        for(Map.Entry<String,String> entry:map.entrySet())
        {
            String start=entry.getKey();
            while(map.containsKey(start))
            {
                start=map.get(start);
            }
            ans=start;
        }
        return ans;
    }
}
