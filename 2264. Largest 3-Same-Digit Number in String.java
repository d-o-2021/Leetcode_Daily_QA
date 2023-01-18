class Solution {
    public String largestGoodInteger(String num) {
        String max="0";
        for(int i=0;i<num.length()-2;i++)
        {
            if((num.charAt(i)==num.charAt(i+1))&&(num.charAt(i)==num.charAt(i+2)))
            {
                String temp=(num.substring(i,i+3));
                if(Integer.parseInt(max)<=Integer.parseInt(temp))max=temp;
            }
        }
        if(max.length()==1)return "";
        return max;
    }
}
