package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    //helper method
    public static int length(ListNode head){
        int count = 0;
        ListNode n = head;
        while (n != null){
            count++;
            n = n.next;
        }
        return count;
    }

    public static ListNode findMidAndBreak(ListNode head) {
        // homework
        ListNode c ;
        ListNode mid;

        int length = length(head);
        if (length < 2){
            mid = null;
            c = head;
            return mid;
        }
        ListNode second = head;

        int secondCount = (length - 1) / 2;
        for (int i = 0; i < secondCount; i++){
            second = second.next;
        }
        c = head;
        mid = second.next;
        second.next = null;
        return mid;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        return null;
    }
}
