public class selfLinkedList {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next !=null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteFirst(){
         
    }

    public void printList(){
        if (head==null) {
            System.out.println("Null");
            return;
        }
         Node currNode = head;
        while (currNode !=null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
        }

    public static void main(String[] args) {
        selfLinkedList ll = new selfLinkedList();
        // ll.addFirst("hello");
        // ll.addFirst("world!");
        // ll.addFirst("this");
        // ll.addFirst("is");
        // ll.addFirst("linked");
        // ll.addFirst("list");
        ll.printList();
        ll.addLast("hello");
        ll.addLast("world!");
        ll.addLast("this");
        ll.addLast("is");
        ll.addLast("linked");
        ll.addLast("list");
        ll.printList();
    }    
}
