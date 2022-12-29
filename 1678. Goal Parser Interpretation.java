class Solution {
    public String interpret(String command) {
        String ans="";
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')ans+='G';
            else if(command.charAt(i)=='(')
            {
                int temp=i;
                while(command.charAt(i)!=')')
                {
                    i++;
                }
                if((i-temp)>1)
                {
                    ans+="al";
                }
                else
                {
                    ans+='o';
                }
            }
        }
        return ans;    
    }
}
