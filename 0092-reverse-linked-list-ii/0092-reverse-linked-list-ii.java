
class Solution {
     public ListNode reverse(ListNode p)
    {
        ListNode q=null,r=null; 
        while(p!=null)
        {
            r = q; 
            q = p; 
            p = p.next; 
            q.next = r;
        }
        return q;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        for (int i = 0; i < left - 1; i++) {
            temp = temp.next;
        }

        ListNode lnode = temp.next;
        ListNode rnode = lnode;
        for (int i = left; i < right; i++) {
            rnode = rnode.next;
        }

        ListNode nxt = rnode.next;
        rnode.next = null;

        ListNode newHead = reverse(lnode);

        temp.next = newHead;
        lnode.next = nxt;

        return dummy.next;
    }
}