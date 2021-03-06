public class MyArrayList <T>{
    private T[] list = (T[]) new Object[0];
    private int counter = 0;

    public void add(T value){
        T[] newList = (T[]) new Object[list.length + 1];
        for (int i = 0; i < newList.length - 1; i++){
            newList[i < newList.length ? i : i + 1] = list[i];
        }
        newList[newList.length-1] = value;
        list = newList;
        counter++;

    }
    public T get(int index){
        return (T) list[index] ;
    }

    public void remove(int index){
        if(index <= list.length-1){
            for(int i = index;i < list.length-1;i++){
                list[i] = list[i+1];
            }
            list[list.length-1] = null;
            counter--;
        }
        else System.out.println("Index is incorrect");

    }
    public int size(){
        return counter;
    }
    public void clear(){
        list = (T[]) new Object[0];
        counter = 0;
    }
}
class MyTest{
    public static void main(String[] args) {
        MyArrayList<String> my = new <String>MyArrayList();
        my.add("12");
        my.add("14");
        my.remove(0);
        System.out.println("my.get(0) = " + my.get(0));
        System.out.println("my size = " + my.size());
    }

}