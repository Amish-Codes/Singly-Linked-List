package Singly_Linked_List;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node(); // O(1)
        Node node = new Node(); // O(1)
        node.next=null; // O(1)
        node.value=nodeValue; // O(1)
        head=node; // O(1)
        tail=node; // O(1)
        size=1; // O(1)
        return head;
        // Space complexity is also O(1) because we are creating only one Node in the program.
    }

    // insert method for Node
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node(); // O(1)
        node.value=nodeValue; // O(1)
        if (head==null) {
            createSinglyLinkedList(nodeValue); // O(1)
            return;
        }
//        at beginning
        else if (location==0) {
            node.next=head; // O(1)
            head=node; // O(1)
        }
//        at middle
        else if (location>=size) {
            node.next=null; // O(1)
            tail.next=node; // O(1)
            tail=node; // O(1)
        }
//        at given location
        else {
            Node tempNode = head; // O(1)
            int index=0; // O(1)
            while (index<location-1) { // O(n)
                tempNode=tempNode.next;
                index++; // O(1)
            }
            Node nextNode = tempNode.next;
            tempNode.next=nextNode; // O(1)
            node.next=nextNode;
        } size++; // O(1)
        // Space complexity is also O(1) because we are creating only one insertion method in the program.
    }

    // traverse method for Node
    public void traverseSinglyLL() {
        if (head==null) {  // O(1)
            System.out.println("Singly LinkedList does not exist!");
        }
        else {
            Node temp = head;  // O(1)
            for(int i=0;i<size;i++) {  // O(N)
                System.out.print(temp.value);  //O(1)
                if (i!=size-1) {  // O(1)
                    System.out.print(" -> ");
                }
                temp=temp.next;  // O(1)
            }
        }
        System.out.println("\n");  // O(1)
        // space complexity will be O(1) because in this case an extra memory is not required tp traverse
    }

    // searching method for Node
    public boolean searchNode(int nodevalue) {
        if (head!=null) {  // O(1)
            Node temp = head;  // O(1)
            for(int i=0;i<size;i++) {  // O(N)
                if(temp.value==nodevalue) {  // O(1)
                    System.out.println("Found node at location " + i + "\n");
                    return true;
                }
                temp=temp.next;  // O(1)
            }
        }
        System.out.println("Node not found!");  // O(1)
        return false;
        // space complexity is O(1) because an additional memory is not required
    }

    // delete method for Node
    public void deleteNode(int location) {
        if (head==null) {  // O(1)
            System.out.println("Singly LinkedList does not exist!");
            return;
        }

        // starting
        else if (location==0) {  // O(1)
            // case for more than one elements
            head = head.next;
            size--;
            // case for only one element
            if (size==0) {  // O(1)
                tail=null;
            }
        }
        // end
        else if (location>=size) {  // O(1)
            Node temp = head;  // O(1)
            for(int i=0; i<size-1; i++) {  // O(N)
                temp=temp.next;  // O(1)
            }
            // for one element
            if (temp==head) {  // O(1)
                tail=head=null;
                size--;
                return;
            }
            // for more than one element
            temp.next=null;  // O(1)
            tail=temp;
            size--;
        }
        // from given location
        else {
            Node temp = head;  // O(1)
            for(int i=0; i<location-1; i++) {  // O(1)
                temp=temp.next;
            }
            temp.next = temp.next.next;  // O(1)
            size--;  // O(1)
        }
        // space complexity will be O(1) because an extra memory is not required to delete a node
    }

    // delete methode to delete entire singly linked list
    public void deletedSinglyLL() {
        head = null;  // O(1)
        tail =null;  // O(1)
        System.out.println("The singly linkedlist deleted successfully :-)");  // O(1)
        // space complexity is O(1) because an extra memory is not require to delete entire singly linkedlist
    }
}
