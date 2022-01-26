class MyLinkedList<E> {
    private static class Node<E> {
        int index;
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(int index, E item, Node<E> next, Node<E> prev) {
            this.index = index;
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public int getIndex() {
            return index;
        }

        public E getItem() {
            return item;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }
    }
    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public Node<E> getFirst() {
        return first;
    }

    public Node<E> getLast() {
        return  last;
    }

    public <E> void add(E object){
        if(this.size == 0){
            Node newObject = new Node(0,object,null,null);
            this.first = newObject;
            size++;
            this.last = newObject;
        }
        else{
            Node newObject = new Node(size,object,null,this.last);
            this.last = newObject;
            size++;

        }
    }

    public Node getPrevious(Node node){
        return node.prev;
    }
    public E get(int index){
       Node realLast = (Node) getLast();

       for(int i = 0; i < size()-index-1;i++) {
           realLast = getPrevious(realLast);
       }


       return (E) realLast.item;
    }

    public int size(){
        return size;
    }

    public void clear(){
        this.size = 0;
        this.last = null;
        this.first = null;
    }

}
class LinkedTest{
    public static void main(String[] args) {
        MyLinkedList<Integer> lol = new <Integer>MyLinkedList();
        lol.add(1);
        lol.add(5);
        lol.add(1);
        System.out.println("lol.get(2) = " + lol.get(1));
        System.out.println("lol.getLast() = " + lol.getLast());
        System.out.println("lol.size() = " + lol.size());
    }
}