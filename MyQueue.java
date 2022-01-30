public class MyQueue<T> {
    private T[] queue = (T[]) new Object[0];
    private int counter = 0;


    public void add(T value) {
        T[] newQueue = (T[]) new Object[queue.length + 1];
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
        queue = (T[]) new Object[0];
        counter = 0;
    }
    public T peek(){
        return queue[0];
    }
    public T poll(){
        T first = queue[0];
        for(int i = 0;i < queue.length-1;i++){
            queue[i] = queue[i+1];
        }
        queue[queue.length-1] = null;
        counter--;
        return (T) first;
    }
}


