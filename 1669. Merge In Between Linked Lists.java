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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp1end = list1;
        ListNode temp2 = list2;
        while(a!=1){
            temp1= temp1.next;
            a--;
            b--;
        }
        temp1end = temp1;
        while(b!=0){
            temp1end = temp1end.next;
            b--;
        }
        temp1end = temp1end.next;
        temp1.next = list2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next = temp1end;
        return list1;
    }
}
