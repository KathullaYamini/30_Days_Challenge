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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode tail=null;
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            tail=temp;
            temp=temp.next;
        }
        tail.next=head;
        k=k%size;
        int i=0;
        while(i!=size-k){
            tail=tail.next;
            i++;
        }
        head=tail.next;
        tail.next=null;
        return head;
    }
}