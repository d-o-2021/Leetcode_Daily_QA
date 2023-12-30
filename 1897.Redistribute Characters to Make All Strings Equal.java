class Solution {
    public boolean makeEqual(String[] words) {
        int arr[]=new int[26];
        for(String s:words)
        {
            for(int i=0 ; i<s.length();i++ ){
                arr[s.charAt(i)-'a']++;
            }
        }
        int len=words.length;
        boolean flag=true;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                if(arr[i]%len!=0){
                    flag=false;
                }
            }
        }
        return flag;
    }
}
