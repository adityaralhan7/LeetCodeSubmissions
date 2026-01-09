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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        ListNode temp1=head;
        ListNode org=head;
        if(head.next==null) return null;
        if(head==null) return null;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int count=0;
        if(len%2==0){
            while(count!=(len/2)-1){
                temp1=temp1.next;
                count++;
            }
            temp1.next=temp1.next.next;
            return org;

        }
        else{
            count=0;
            while(count!=(len-1)/2-1){
                temp1=temp1.next;
                count++;
            }
            temp1.next=temp1.next.next;
        }
        return org;
    }
}