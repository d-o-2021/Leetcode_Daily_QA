/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//  4 1 9 9
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        ListNode furr = node.next;
        while(furr!=null){
            curr.val = furr.val;
            if(furr.next==null){
                curr.next=null;
                return;
            }
            curr = furr;
            furr = furr.next;
        }
    }
}
