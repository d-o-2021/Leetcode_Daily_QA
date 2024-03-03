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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode temp = head;
        while(n!=0){
            temp=temp.next;
            n--;
        }
        if(temp==null)return curr.next;
        while(temp!=null && temp.next!=null){
            curr=curr.next;
            temp=temp.next;
        }
        if(curr.next!=null){
        curr.next = curr.next.next;
        }
        return head;
    }
}
