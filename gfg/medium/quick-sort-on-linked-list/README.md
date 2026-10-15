# Quick Sort on Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the  **head** of a singly linked list, sort the linked list in non-decreasing order using the  **Quick Sort**  algorithm and return the head of the sorted list.

 **Examples:** 

```
Input: 

Output: 2 -> 5 -> 8 -> 9
Explanation: After sorting the given linked list, the resultant list will be:

```

```
Input:

Output: 10 -> 20 -> 30 -> 40 -> 50 -> 60
Explanation: After sorting the given linked list, the resultant list will be:

```

 **Constraints:** 
1 ≤ size of linked list ≤ 105
-109 ≤ node->data ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T14:45:00.453Z  

```java
/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public static Node quickSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        quickSort(head, tail);
        return head;
    }
    static void quickSort(Node head, Node tail) {
        if (head == null || head == tail || head == tail.next) {
            return;
        }
        Node pivot = partition(head, tail);
        Node prev = head;
        if (prev != pivot) {
            while (prev.next != pivot) {
                prev = prev.next;
            }
            quickSort(head, prev);
        }
        if (pivot != tail) {
            quickSort(pivot.next, tail);
        }
    }
    static Node partition(Node head, Node tail) {
        int pivotValue = tail.data;
        Node i = head;
        Node j = head;
        while (j != tail) {
            if (j.data < pivotValue) {
                int x = i.data;
                i.data = j.data;
                j.data = x;
                i = i.next;
            }
            j = j.next;
        }
        int x = i.data;
        i.data = tail.data;
        tail.data = x;
        return i;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/quick-sort-on-linked-list/1)