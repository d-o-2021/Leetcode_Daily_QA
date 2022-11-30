class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))return true;
        int i=0;
        int j=s2.length()-1;
        while(s1.charAt(i)==s2.charAt(i))
        {
            i++;
        }
        while(s1.charAt(j)==s2.charAt(j))
        {
            j--;
        }
        if((s1.charAt(i)==s2.charAt(j))&&(s1.charAt(j)==s2.charAt(i)))
        {
            char arr[]=s1.toCharArray();
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            String st=new String(arr);
            if(st.equals(s2))return true;
        }
        return false;
    }
}
