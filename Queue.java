class Queue<T> {
    private Object[] queue = new Object[0];
    private int counter = 0;


    public void add(T value) {
        Object[] newQueue = new Object[queue.length + 1];
        for (int i = 0; i < newQueue.length - 1; i++) {
            newQueue[i < newQueue.length ? i : i + 1] = queue[i];
        }
        newQueue[newQueue.length - 1] = value;
        queue = newQueue;
        counter++;
    }
    public void remove(int index){
        if(index <= counter-1){
            for(int i = index;i < queue.length-1;i++){
                queue[i] = queue[i+1];
            }
            queue[queue.length-1] = null;
            counter--;
        }
        else System.out.println("Index is incorrect");

    }
    public int size(){
        return counter;
    }
    public void clear(){
        queue = new Object[0];
        counter = 0;
    }
    public Object peek(){
        return queue[0];
    }
    public Object poll(){
        Object first = queue[0];
        for(int i = 0;i < queue.length-1;i++){
            queue[i] = queue[i+1];
        }
        queue[queue.length-1] = null;
        counter--;
        return first;
    }
}
class MyQueueTest{
    public static void main(String[] args) {
        Queue<Integer> my = new Queue<Integer>();
        my.add(0);
        my.add(1);
        my.add(2);
        my.add(3);
        my.add(4);
        System.out.println("my.poll() = " + my.poll());
        System.out.println("my.size() = " + my.size());;
        System.out.println("my.poll() = " + my.poll());
        System.out.println("my.size() = " + my.size());;
        System.out.println("my.poll() = " + my.poll());
    }

}

