package Problem2;

public class ListNode {
    public int val;
    public ListNode next;

    private ListNode head = null;
    public ListNode() {
        next = null;
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public void reverse(){

        while(!(head == null || head.next == null)) {
            break;
        }
        reverse();
        head.next.next = head;

        head.next = null;

    }



}