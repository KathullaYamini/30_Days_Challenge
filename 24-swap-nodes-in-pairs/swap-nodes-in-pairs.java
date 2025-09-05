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
    public ListNode swapPairs(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        if(head==null || head.next==null) return head;
        ListNode newHead=head.next;
        while(curr!=null && curr.next!=null){
            ListNode f=curr;
            ListNode s=curr.next;
            ListNode n=curr.next.next;
            s.next=f;
            f.next=n;
            if(prev!=null){
                prev.next=s;
            }
            prev=f;
            curr=n;
        }
        return newHead;
    }
}