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
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null)return head;
        ArrayList<Integer> lower=new ArrayList<>();
        ArrayList<Integer> higher=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                lower.add(temp.val);
            }
            else higher.add(temp.val);
            temp=temp.next;
        }
        ListNode ans =null;
        if(lower.size()!=0&&higher.size()==0)
        {
            ans=new ListNode(lower.get(0));
            temp=ans;
            for(int i=1;i<lower.size();i++)
            {
                temp.next=new ListNode(lower.get(i));
                temp=temp.next;
            }
            return ans;
        }
        else if(lower.size()==0&&higher.size()!=0)
        {
            ans=new ListNode(higher.get(0));
            temp=ans;
            for(int i=1;i<higher.size();i++)
            {
                temp.next=new ListNode(higher.get(i));
                temp=temp.next;
            }
            return ans;
        }
        else 
        {
            ans=new ListNode(lower.get(0));
            temp=ans;
            for(int i=1;i<lower.size();i++)
            {
                temp.next=new ListNode(lower.get(i));
                temp=temp.next;
            }
            for(int i=0;i<higher.size();i++)
            {
                temp.next=new ListNode(higher.get(i));
                temp=temp.next;
            }
            return ans;
        }
    }
}
