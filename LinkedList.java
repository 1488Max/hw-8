public class  LinkedList<E> {

    Node head; // head of list
    static class Node<E> {

        Object data;
        Node next;



        Node(Object d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedList add(LinkedList list,
                                    Object data)
    {

        Node new_node = new Node(data);
        new_node.next = null;


        if (list.head == null) {
            list.head = new_node;
        }
        else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }



        return list;
    }
    public static Object get(int index,LinkedList list){

        int counter = 0;

        Node currNode = list.head, prev = null;

        while (counter<index){

            currNode=currNode.next;

            counter++;

        }

        return currNode.data;
    }
    public static int size(LinkedList list){
        int size = 0;

        Node currNode = list.head, prev = null;

        while (currNode != null) {

            size ++;

            currNode = currNode.next;

        }
        return size;
    }


    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

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



    public static LinkedList remove(LinkedList list, int index)
    {

        Node currNode = list.head, prev = null;


        if (index == 0 && currNode != null) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(
                    index + " position element deleted");

            // Return the updated List
            return list;
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



        return list;
    }
    public void clear(LinkedList list){
        list.head = null;

    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

       
        list = add(list, 1);
        list = add(list, 2);
        list = add(list, 3);
        list = add(list, 4);
        list = add(list, 5);
        list = add(list, 6);
        list = add(list, 7);
        list = add(list, 8);
         System.out.println("list = " + get(1,list));

        printList(list);

       
        list.clear(list);
        printList(list);
    }
}