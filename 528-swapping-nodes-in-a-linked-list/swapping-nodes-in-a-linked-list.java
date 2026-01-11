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
    public ListNode swapNodes(ListNode head, int k) {
        int len=0;
        ListNode temp1=head;
        while(temp1!=null){
            len++;
            temp1=temp1.next;
        }
        int n1=k;
        int n2=len-k+1;
        ListNode temp2=head;
        ListNode temp3=head;
        int c1=1;
        int c2=1;
        while(c1!=n1){
            c1++;
            temp2=temp2.next;
        }
        while(c2!=n2){
            c2++;
            temp3=temp3.next;
        }
        int t=temp2.val;
        temp2.val=temp3.val;
        temp3.val=t;
        return head;
    }
}