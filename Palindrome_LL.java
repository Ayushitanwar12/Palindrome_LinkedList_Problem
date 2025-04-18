import java.util.ArrayDeque;
import java.util.Deque;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Palindrome_LL {
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();

        ListNode curr = head;
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            if (stack.pop() != curr.val) {
                return false;
            }
            curr = curr.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Create sample linked list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Palindrome_LL solution = new Palindrome_LL();
        boolean result = solution.isPalindrome(head);

        System.out.println("Is the linked list a palindrome? " + result);
    }
}

