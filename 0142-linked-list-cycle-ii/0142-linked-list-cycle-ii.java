
public class Solution {
    public ListNode detectCycle(ListNode head) {
          ListNode fast = head,slow=head; 
        while(fast!=null && fast.next!=null)
        {
             fast = fast.next.next; 
             slow = slow.next; 
             if(fast==slow)
             {
               slow=head;
               while(true){
                if(fast==slow)
                 return fast;

                slow=slow.next;
                fast=fast.next;
               }
             }
        } 
        return null;
    }
}