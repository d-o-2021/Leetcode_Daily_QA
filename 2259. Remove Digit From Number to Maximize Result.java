class Solution {
    public String removeDigit(String number, char digit) {
            int max=0;
            List<String> arr=new ArrayList<>();
            for(int i=0;i<number.length();i++)
            {
                if(number.charAt(i)==digit)
                {
                    String temp=(number.substring(0,i)+number.substring(i+1));
                    arr.add(temp);
                }
            }
            Collections.sort(arr);
            return arr.get(arr.size()-1);
        }
}
