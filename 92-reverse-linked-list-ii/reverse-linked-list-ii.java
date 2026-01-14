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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||left==right) return head;
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        ListNode curr=dummy;
        ListNode after=dummy;
        dummy.next=head;
        int count=0;
        ListNode temp=dummy;
        while(temp!=null){
            count++;
            if(count==left) prev=temp;
            if(count==left+1) curr=temp;
            if(count==right+1) after=temp;
            temp=temp.next; 
        }
        ListNode adi=after.next;
        ListNode newNode=reverse(curr,after);
        prev.next=newNode;
        curr.next=adi;
        return dummy.next;
        
    }
    public ListNode reverse(ListNode curr,ListNode after){
        ListNode next=null;
        ListNode prev=null;
        ListNode stop=after.next;
        while(curr!=stop){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}