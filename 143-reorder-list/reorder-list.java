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
    public void reorderList(ListNode head) {
     if(head==null ) {
        return;
     }   
     ListNode left=head;
     ListNode right=head;
     while(right!=null && right.next!=null) {
        left=left.next;
        right=right.next.next;
     }

     ListNode prev=null;
     ListNode curr=left.next;;
     left.next=null;

     while(curr!=null) {
        ListNode TempNext=curr.next;
        curr.next=prev;
        prev=curr;
        curr=TempNext;
     }

     ListNode first=head;
     ListNode second=prev;
     while(second!=null) {
        ListNode t1=first.next;
        ListNode t2=second.next;
        first.next=second;
        second.next=t1;
        first=t1;
        second=t2;
     }
    }

}