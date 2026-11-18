# Palindrome Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a singly linked list, return `true` *if it is a  **palindrome**  or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: head = [1,2,2,1]
Output: true

```

 **Example 2:** 

```
Input: head = [1,2]
Output: false

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 9

 

 **Follow up:**  Could you do it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 12.83%)  
**Memory:** 91.9 MB (beats 99.20%)  
**Submitted:** 2026-11-18T11:57:54.224Z  

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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp=head;
        ListNode pre = head;
        while(temp!=null && temp.next!=null){
            st.push(pre.val);
            pre = pre.next;
            temp = temp.next.next;
        }
        if(temp!=null) pre = pre.next;
        while(pre!=null){
            if(st.pop()!=pre.val){
                return false;
            }
            pre = pre.next;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-linked-list/)