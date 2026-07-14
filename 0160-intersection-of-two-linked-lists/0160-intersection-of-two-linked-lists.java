/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode ha, ListNode hb) {
        ListNode a=ha;
        ListNode b=hb;
        while(a!=b){
            a=a==null?hb:a.next;
            b=b==null?ha:b.next;
        }
        return a;
    }
}