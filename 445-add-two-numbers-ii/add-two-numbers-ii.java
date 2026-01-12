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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        int sum=0;
        int carry=0;
        ListNode head=new ListNode();
        while(l1!=null||l2!=null){
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            head.val=sum%10;
            carry=sum/10;
            ListNode temp=new ListNode(carry);
            temp.next=head;
            head=temp;
            sum=carry;
        }
        if(carry==0) return head.next;
        return head;
    }

    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        ListNode next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}