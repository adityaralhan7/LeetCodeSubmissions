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
        if(head==null) return head;
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int front=len-n+1;
        if(front==1) return head.next;
        int count=0;
        ListNode prev=head;
        ListNode curr=head;
        while(count<front-1){
            prev=curr;
            curr=curr.next;
            count++;
        }
        if(curr.next==null) prev.next=null;
        else prev.next=curr.next;
        return head;
    }
}