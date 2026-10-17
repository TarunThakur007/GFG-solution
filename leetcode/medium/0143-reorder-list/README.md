# Reorder List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the head of a singly linked-list. The list can be represented as:

```
L0 → L1 → … → Ln - 1 → Ln

```

 *Reorder the list to be on the following form:* 

```
L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

```

You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

 **Example 1:** 

```
Input: head = [1,2,3,4]
Output: [1,4,2,3]

```

 **Example 2:** 

```
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [1, 5 * 104].
- 1 <= Node.val <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.79%)  
**Memory:** 48.7 MB (beats 97.09%)  
**Submitted:** 2026-10-17T09:47:59.235Z  

```java
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
    public void reorderList(ListNode head) {
        if(head == null && head.next!=null) return ;    
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (second != null) {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }
        ListNode first = head, tail = prev;
        while (tail != null) {
            ListNode f1 = first.next, t1 = tail.next;
            first.next = tail;
            tail.next = f1;
            first = f1;
            tail = t1;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reorder-list/)