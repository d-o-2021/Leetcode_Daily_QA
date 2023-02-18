//I know it's difficult to understand!!😢😢😢but....😅😅
import java.util.*;
class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int att[]=new int[26];
        for(char ch:word.toCharArray())
        {
            att[ch-'a']++;
        }
        int count=0;
        for(int i:att)
        {
            if(i!=0)
            {
                count++;
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
//         System.out.println(map);
        if(map.size()>2)return false;
        else if(map.size()==1)
        {
            if(map.containsKey(1))return true;
            else if(count==1)return true;
            else return false;
        }
        else 
        {
            if(map.containsKey(1))
            {
                if(map.get(1)==1)return true;
                else if(map.containsKey(2))
                {
                    if(map.get(2)==1)return true;
                    else return false;
                }
                else return false;
            }
            else
            {
            int keya=0;//2
            int occa=0;//1
            int keyb=0;
            int occb=0;
            for(Map.Entry<Integer,Integer> e:map.entrySet())
            {
                keya=e.getKey();
                occa=e.getValue();
                break;
            }
            if(map.containsKey((keya-1)))
            {
                keyb=keya-1;
                occb=map.get(keyb);
            }
            else if(map.containsKey((keya+1)))
            {
                keyb=keya+1;
                occb=map.get(keyb);
            }
            if(occa==1&&occb==1)
            {
//                 System.out.println("pekwaan");
                if(keya==0||keyb==0)return false;
                else return true;
            }
            else if(occa==1)
            {
                if(keyb!=0&&keya>keyb)return true;
                else return false;
            }
            else if(occb==1)
            {
                if(keya!=0&&keyb>keya)return true;
                else return false;
            }
            else return false;
            }
        }
    }
}
