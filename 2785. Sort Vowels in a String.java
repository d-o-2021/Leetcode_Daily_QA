class Solution {
    public String sortVowels(String s) {
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        char charr[]=new char[count];
        int i=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                charr[i++]=ch;
            }
        }
        Arrays.sort(charr);
        String ans="";
        i=0;
        for(char ch: s.toCharArray()){
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
                ans+=ch;
            }else{
                ans+=charr[i++];
            }
        }
        return ans;
    }
}
