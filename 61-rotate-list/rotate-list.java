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
       if(head==null||k==0||head.next==null) return head;

       int len=1;
       ListNode tail=head;
       while(tail.next!=null){
            len++;
            tail=tail.next;
       }

       k=k%len;
       if(k==0) return head;
        tail.next=head;
        ListNode newTail=head;
       for(int i=1;i<len-k;i++){
            newTail=newTail.next;
       }
       ListNode newHead=newTail.next;
       newTail.next=null;
       return newHead;
    }
}