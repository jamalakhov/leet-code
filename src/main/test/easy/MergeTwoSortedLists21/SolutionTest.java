package easy.MergeTwoSortedLists21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    // You are given the heads of two sorted linked lists list1 and list2.
    // Merge the two lists in a one sorted list. The list should be made
    // by splicing together the nodes of the first two lists.
    // Return the head of the merged linked list.

    // Example:
    // Input: list1 = [1,2,4], list2 = [1,3,4]
    // Output: [1,1,2,3,4,4]

    @Test
    void testMergeTwoLists() {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        String expected = "1 1 2 3 4 4";
        StringBuilder actual = new StringBuilder();

        ListNode node = solution.mergeTwoLists(list1, list2);
        while (node != null) {
            actual.append(node.val).append(" ");
            node = node.next;
        }

        assertEquals(expected, actual.toString().trim());
    }
}