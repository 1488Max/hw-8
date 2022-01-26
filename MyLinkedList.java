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
    }
    private int size = 0;
    private Node<E> first;
    private Node<E> last;
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
    }
}