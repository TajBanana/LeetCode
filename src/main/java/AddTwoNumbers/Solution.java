package AddTwoNumbers;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode resultIterator = dummyHead;
        boolean carry = false;

        while (l1 != null || l2 != null) {
            int l1Value = l1 != null ? l1.val : 0;
            int l2Value = l2 != null ? l2.val : 0;
            int currentSum = l1Value + l2Value + (carry ? 1 : 0);

            carry = currentSum > 9;
            int lastDigit = currentSum % 10;

            resultIterator.next = new ListNode(lastDigit);
            resultIterator = resultIterator.next;

            if (l1 != null) {l1 = l1.next;}
            if (l2 != null) {l2 = l2.next;}
        }

        if (carry) {
            resultIterator.next = new ListNode(1);
        }

        return dummyHead.next;
    }
}
