package Singly_Linked_List;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();

        obj.createSinglyLinkedList(5);
        // System.out.println(obj.head.value);
        obj.insertInLinkedList(6,1);
        obj.insertInLinkedList(7,2);
        obj.insertInLinkedList(8,3);
        obj.insertInLinkedList(9,5);
        obj.insertInLinkedList(4,0);
        // System.out.println(obj.head.next.next.value);
        obj.traverseSinglyLL();
        obj.searchNode(6);
        obj.deleteNode(3);
        obj.traverseSinglyLL();
        obj.deleteNode(0);
        obj.traverseSinglyLL();
        obj.deleteNode(5);
        obj.traverseSinglyLL();
        obj.deletedSinglyLL();
        obj.traverseSinglyLL();
    }
}