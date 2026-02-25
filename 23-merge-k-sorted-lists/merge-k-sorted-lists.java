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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists==null) {
            return null;
        }
        List<Integer> values=new ArrayList<>();
        for(int i=0;i<lists.length;i++) {
            ListNode head=lists[i];
            while(head!=null) {
                values.add(head.val);
                head=head.next;
            }
        }
        if(values.size()==0) {
            return null;
        } 
        Collections.sort(values);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int i=0;i<values.size();i++) {
            int num=values.get(i);
            curr.next=new ListNode(num);
            curr=curr.next;
        }
        return dummy.next;
    }
}