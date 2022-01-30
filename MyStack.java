public class MyStack<T> {
    private T[] stack = (T[]) new Object[0];
    private int counter = 0;


    public void push(T value) {

        T[] newStack = (T[]) new Object[stack.length + 1];
        for (int i = 0; i < newStack.length - 1; i++) {

            newStack[i] = stack[i];
        }

        newStack[newStack.length - 1] = value;
        stack = newStack;
        counter++;
    }

    public void remove(int index){

        if(index <= counter-1){

            for(int i = index;i < counter-1;i++){

                stack[i] = stack[i+1];
            }
            stack[counter-1] = null;
            counter--;
        }
        else System.out.println("Index is incorrect");

    }
    public int size(){

        return counter;
    }

    public void clear(){

        stack = (T[]) new Object[0];
        counter = 0;
    }

    public T peek(){

        return stack[counter-1];
    }

    public T pop(){

        T last = stack[counter-1];
        stack[counter-1] = null;
        counter--;
        return (T) last;
    }

}
