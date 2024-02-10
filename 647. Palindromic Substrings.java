class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j =i+1;j<s.length();j++){
                int ti=i,tj=j;
                    while(ti<tj){
                        if(s.charAt(ti)==s.charAt(tj)){
                            ti++;
                            tj--;
                        }
                        else{
                            break;
                        }
                    }
                if(ti>=tj)count++;
            }
        }
        return count+s.length();
    }
}
