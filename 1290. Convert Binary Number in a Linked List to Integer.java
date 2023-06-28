/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int bno(String no)
    {
        int ans=0;
        int pow=0;
        for(int i=no.length()-1;i>=0;i--)
        {
            ans+=Math.pow(2,pow++)*(no.charAt(i)-'0');
        }
        return ans;
    }
    public int getDecimalValue(ListNode head) {
        String bno="";
        ListNode temp=head;
        while(temp!=null)
        {
            bno+=temp.val;
            temp=temp.next;
        }
        return bno(bno);
    }
}
