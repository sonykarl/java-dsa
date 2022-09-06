package DataStructures.linkedList;

public class SinglyLinkedList {


    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    public Node find(int data){
        Node current = head;

        if (current == null){
            return null;
        }

        while (current.next != null){
            if (current == null){
                return null;
            } else if (current.data == data){
                return current;
            }
            else {
                current = current.next;
            }
        }

        return current;
    }
    public void display(){
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Node of a singley list");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList myLinkedList = new SinglyLinkedList();

        myLinkedList.addNode(45);
        myLinkedList.addNode(46);
        myLinkedList.addNode(47);
        myLinkedList.addNode(48);

        myLinkedList.display();

    }
}
