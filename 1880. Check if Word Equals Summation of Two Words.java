class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String temp="";
        for(char ch:firstWord.toCharArray())
        {
            temp+=(ch-'a');
        }
        int fst=Integer.parseInt(temp);
        temp="";
        for(char ch:secondWord.toCharArray())
        {
            temp+=(ch-'a');
        }
        int sec=Integer.parseInt(temp);
        temp="";
        for(char ch:targetWord.toCharArray())
        {
            temp+=(ch-'a');
        }
        int tar=Integer.parseInt(temp);
        if((fst+sec)==tar)return true;
        return false;
    }
}
