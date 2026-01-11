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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> map=new HashMap<>();
        int sum=0;
        ListNode start=head;
        ListNode temp=null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        map.put(sum,dummy);
        while(start!=null){
            sum+=start.val;
            if(map.containsKey(sum)){
                temp=map.get(sum);
                ListNode curr=temp.next;
                int s=sum;
                while(curr!=start){
                    s+=curr.val;
                    map.remove(s);
                    curr=curr.next;
                }
                temp.next=start.next;
            }
            else{
                map.put(sum,start);
            }
            start=start.next;
        }
        return dummy.next;
    }
}