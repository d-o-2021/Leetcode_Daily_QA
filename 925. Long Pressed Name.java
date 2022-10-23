class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed))return true;
        if(typed.length()<name.length())return false;
            int k=0;
        for(int i=0;i<name.length();i++)
        {
            // allean   allleeaann
            if(k>=typed.length())return false;  // for case like          
                                                // "pyplrz"
                                                // "ppyypllr"  in this k goes out of his length
            if(k<typed.length()&&name.charAt(i)!=typed.charAt(k))
            {
                return false;
            }
            else
            {
                if(i<name.length()-1&&name.charAt(i)!=name.charAt(i+1))
                while(k<typed.length()&&name.charAt(i)==typed.charAt(k))
                {
                    k++;
                }
                else
                {
                    if(k<typed.length()&&name.charAt(i)==typed.charAt(k))// if name string include two or more same consecutive alphabets
                    {
                        k++;
                    }
                }
            }
        }
      //this loop is used when name string matched with the types string but there is some more further alphabets in typed string that to be cheked also
//       example
//        "alex"
//        "aaleexa"
        while(k<typed.length())
        {
            if(typed.charAt(k)==typed.charAt(k-1))k++;
            else return false;
        }
        return true;
    }
}
