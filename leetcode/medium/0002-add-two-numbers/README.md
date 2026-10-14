# Add Two Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two  **non-empty**  linked lists representing two non-negative integers. The digits are stored in  **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

 **Example 1:** 

```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

```

 **Example 2:** 

```
Input: l1 = [0], l2 = [0]
Output: [0]

```

 **Example 3:** 

```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

```

 

 **Constraints:** 

- The number of nodes in each linked list is in the range [1, 100].
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 5.31%)  
**Memory:** 46.3 MB (beats 76.73%)  
**Submitted:** 2026-10-14T05:17:36.263Z  

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        int c = 0;
        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        while(t1!=null && t2!=null){
            int sum = t1.val+t2.val+c;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            c = sum/10;
            t1 = t1.next;
            t2 = t2.next;
        }
        while(t1!=null){
            int sum = t1.val+c;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            c = sum/10;
            t1 = t1.next;
        }
        while(t2!=null){
            int sum =t2.val+c;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            c = sum/10;
            t2 = t2.next;
        }
        if(c>0){
            temp.next = new ListNode(c%10);
        }
        return newNode.next;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-two-numbers/)