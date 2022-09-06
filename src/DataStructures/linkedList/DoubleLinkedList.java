package DataStructures.linkedList;

public class DoubleLinkedList {

    class Node{
        int data;
        Node next;
        Node previous;

        public Node(int data){
            this.data = data;
        }
    }

    Node head;
    Node tail;
    public void addNode(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.previous = tail;
            tail.next  = newNode;

        }
    }


    public static void main (String args[]){
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addNode(34);
        linkedList.addNode(35);
        linkedList.addNode(37);
        System.out.println(linkedList);
    }
}
