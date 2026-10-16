# Sort Llinked List of 0s, 1s and 2s

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a linked list where nodes can contain values  **0s**,  **1s,**  and  **2s** only. Your task is to rearrange the list so that all  **0s**  appear at the beginning, followed by all  **1s**, and all  **2s**  are placed at the end.

 **Examples:** 

```
Input: head = 1 → 2 → 2 → 1 → 2 → 0 → 2 → 2
   
Output: 0 → 1 → 1 → 2 → 2 → 2 → 2 → 2
Explanation: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between. The final list will be:
   
```

```
Input: head = 2 → 2 → 0 → 1
   
Output: 0 → 1 → 2 → 2
Explanation: After arranging all the 0s, 1s and 2s in the given format, the output will be:
   
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T14:11:45.954Z  

```java
/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

// class Solution {
//     public Node segregate(Node head) {
//         // code here
//         Node temp = head;
//         Node current = head;
//         Node pre = temp.next;
//         while(temp!=null && temp.next!=null){
//             temp = temp.next;
//             if(temp.data==0){
//                 int s = current.data;
//                 current.data = temp.data;
//                 temp.data = s;
//                 current = current.next;
//             }else if(temp.data==1){
//                 int x = pre.data;
//                 pre.data = temp.data;
//                 temp.data = x;
//                 pre = pre.next;
//                 temp = temp.next;
//             }else{
//                 temp = temp.next;
//             }
//         }
//         return head;
//     }
// }
class Solution {
    public Node segregate(Node head) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        Node curr = head;
        while (curr != null) {
            if (curr.data == 0) cnt0++;
            else if (curr.data == 1) cnt1++;
            else cnt2++;
            curr = curr.next;
        }
        curr = head;
        int idx = 0;
        while (curr != null) {
            if (idx < cnt0) { curr.data = 0; }
            else if (idx < cnt0 + cnt1) { curr.data = 1; }
            else { curr.data = 2; }
            idx++;
            curr = curr.next;
        }
        return head;
    }
}   
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1)