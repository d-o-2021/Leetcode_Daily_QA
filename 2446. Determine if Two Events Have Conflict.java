class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int minst1=(Integer.parseInt(event1[0].substring(0,2))*60)+Integer.parseInt(event1[0].substring(3));
        int mined1=(Integer.parseInt(event1[1].substring(0,2))*60)+Integer.parseInt(event1[1].substring(3));
        int minst2=(Integer.parseInt(event2[0].substring(0,2))*60)+Integer.parseInt(event2[0].substring(3));
        int mined2=(Integer.parseInt(event2[1].substring(0,2))*60)+Integer.parseInt(event2[1].substring(3));
        if(minst2>=minst1&&minst2<=mined1)return true;
        else if(minst1>=minst2&&minst1<=mined2)return true;
        return false;
    }
}
