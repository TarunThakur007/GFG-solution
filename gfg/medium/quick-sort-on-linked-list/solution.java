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