public class  MyLinkedList<E> {

    Node head; // head of list
    static class Node<E> {

        Object data;
        Node next;



        Node(E d)
        {
            data = d;
            next = null;
        }
    }

    public  void add(E data)
    {

        Node new_node = new Node(data);
        new_node.next = null;


        if (this.head == null) {
            this.head = new_node;
        }
        else {

            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }


    }
    public  E get(int index){

        int counter = 0;

        Node currNode = this.head, prev = null;

        while (counter<index){

            currNode=currNode.next;

            counter++;

        }

        return (E) currNode.data;
    }
    public  int size(){
        int size = 0;

        Node currNode = this.head, prev = null;

        while (currNode != null) {

            size ++;

            currNode = currNode.next;

        }
        return size;
    }


    public  void printList()
    {
        Node currNode = this.head;

        System.out.print("\nLinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("\n");
    }



    public  void remove(int index)
    {

        Node currNode = this.head, prev = null;


        if (index == 0 && currNode != null) {
            this.head = currNode.next; // Changed head

            // Display the message
            System.out.println(
                    index + " position element deleted");

            // Return the updated List

        }


        int counter = 0;


        while (currNode != null) {

            if (counter == index) {

                prev.next = currNode.next;


                break;
            }
            else {

                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }




    }
    public void clear(){
        this.head = null;

    }


}