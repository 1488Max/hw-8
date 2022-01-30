public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        String l;
        int i;
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        list.remove(2);
        list.remove(2);

        System.out.println("l = list.get(2) = "  + list.get(2));
        i = list.size();
        list.clear();

        MyLinkedList<String> list2 = new MyLinkedList<>();

        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");

        list2.remove(2);
        list2.remove(2);
        System.out.println("l = list2.get(2) = "  + list2.get(2));
        l = list2.get(2);
        i = list2.size();
        list2.clear();

        MyQueue<String> queue = new MyQueue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");

        queue.remove(2);
        queue.remove(2);
        System.out.println("l = queue.peek = "  + queue.peek());
        i = queue.size();
        l = queue.peek();
        l = queue.poll();
        l = queue.poll();
        queue.clear();

        MyStack<String> stack = new MyStack<>();
        stack.push("1");//push
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");


        stack.remove(2);
        stack.remove(2);

        i = stack.size();

        System.out.println("l = stack.peek() = " + stack.pop());
        System.out.println("l = stack.peek() = " +  stack.pop());

        stack.clear();

        MyHashMap<Integer, String> hashMap = new MyHashMap<Integer, String>(5);

        hashMap.put(1, "1111");
        hashMap.put(2, "2222");
        hashMap.put(3, "3");
        hashMap.put(4, "4");
        hashMap.put(5, "5");

        hashMap.put(1, "1");
        hashMap.put(2, "2");

        hashMap.remove(2);
        hashMap.remove(2);

        i = hashMap.size();

        System.out.println("l = hashMap.get(2) = " +  hashMap.get(2));
        System.out.println("l = hashMap.get(1) = " + hashMap.get(1));

        hashMap.clear();
    }
}