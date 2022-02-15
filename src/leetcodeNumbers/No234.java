package leetcodeNumbers;

public class No234 {
         public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = new ListNode();
        ListNode slow = new ListNode();
        fast = head;
        slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null){
            slow = slow.next;
        }
        slow = reverse(slow);
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode p = null;
        while (head != null){
            ListNode q = head.next;
            head.next = p;
            p = head;
            head = q;
        }
        return p;
    }
}
