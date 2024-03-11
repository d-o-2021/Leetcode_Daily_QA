class Solution {
    public String customSortString(String order, String s) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        String ans="";
        for(char ch:order.toCharArray()){
            int count=arr[ch-'a'];
            while(count!=0){
                ans+=ch;
                count--;
                arr[ch-'a']=count;
            }
        }
        for(int i=0;i<26;i++){
            int count=arr[i];
            while(count!=0){
                ans+=(char)(i+'a');
                count--;
            }
        }
        return ans;
    }
}
