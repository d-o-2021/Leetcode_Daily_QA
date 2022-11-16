//AFTER LOTS OF ATTEMPTS
//logic is we were generating unique alphabet from both left and right alphabets 
class Solution {
    public String modifyString(String s) {
        char arr[]=s.toCharArray();
        // ubv?w
        for(int i=0;i<arr.length;i++)
        {
          //processing only when '?' occures in the string
            if(arr[i]=='?')
            {
              //this check insures thati is not present at either at first or last index
                if(i>0&&i<arr.length-1)
                {
                  //this check ensures that next to the current index is '?' or other alphabet so as to generate unique charachter(alphabet) accordinglly
                    if(arr[i+1]!='?')
                    {
                        int ran=((arr[i-1]-'a')+(arr[i+1]-'a'))%26;//simple encoding ensures it ranges between 0 to 25
                        if(ran==(arr[i-1]-'a')||ran==(arr[i+1]-'a'))// if encoding results in same alphabet as present below or above to current '?'
                        {
                            ran+=1;//encoding
                            if(ran==26)//if it overflows from 0 25 ranges again encode
                            {
                                ran-=2;//subtracting so that it will again lie in the range 
                            }
                        }
                        arr[i]=(char)(ran+'a');//setting alphabet 
                    }
                    else //i.e we faced another '?' at next index 
                    {
                        arr[i]=(char)(((arr[i-1]-'a')+1)%25+'a');//just use the previous alphabet to generate new alphabet
                    }
                }
                else//if we ancounters '?' index at either 0 or arr.length-1 
                {
                    if(i==0)
                    {
                        if(i<arr.length-1&&arr[1]!='?')//if next to curretn is not '?' than we can generate new aplhabet using next aplhabet 
                        arr[i]=(char)(((arr[i+1]-'a')+1)%25+'a');//encoding
                        else//if at next another '?' is present than we put any aplhabet
                        {
                            arr[i]='a';//randomly putting anything
                        }
                    }
                    else if(i==arr.length-1)//similarly if current index is at last index than we generate unique alphabet using prevoius index alphabet
                    {
                        if(i>0&&arr[i-1]!='?')
                        arr[i]=(char)(((arr[i-1]-'a')+1)%25+'a');
                        else
                        {
                            arr[i]='a';
                        }
                    }
                }
                
            }
        }
        return new String(arr);
    }
}
