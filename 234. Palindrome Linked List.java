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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> array=new ArrayList<>();
        while(head!=null){
            array.add(head.val);
            head=head.next;
        }
        int i=0,j=array.size()-1;
        while(i<j){
            if(array.get(i++)!=array.get(j--))return false;
        }
        return true;
    }
}
