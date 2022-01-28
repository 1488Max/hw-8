public class Stack<T> {
    private Object[] stack = new Object[0];
    private int counter = 0;


    public void add(T value) {

        Object[] newStack = new Object[stack.length + 1];
        for (int i = 0; i < newStack.length - 1; i++) {

            newStack[i < newStack.length ? i : i + 1] = stack[i];
        }

        newStack[newStack.length - 1] = value;
        stack = newStack;
        counter++;
    }

    public void remove(int index){

        if(index <= counter-1){

            for(int i = index;i < stack.length-1;i++){

                stack[i] = stack[i+1];
            }
            stack[stack.length-1] = null;
            counter--;
        }
        else System.out.println("Index is incorrect");

    }
    public int size(){

        return counter;
    }

    public void clear(){

        stack = new Object[0];
        counter = 0;
    }

    public Object peek(){

        return stack[stack.length-1];
    }

    public Object pop(){

        Object last = stack[stack.length-1];
        stack[stack.length-1] = null;
        counter--;
        return last;
    }

}
