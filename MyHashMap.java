public  class MyHashMap<K,V> {
        private int TABLE_SIZE;
        private int size;
        private Node[] table;
        public MyHashMap(int TABLE_SIZE) {
            this.TABLE_SIZE = TABLE_SIZE;
            this.size = 0;
            this.table = new Node[TABLE_SIZE];
        }


    public int size() {
            return size;
        }
        public void put(K key, V value) {
            int hash = key.hashCode() % TABLE_SIZE;
            remove(key);
            Node next = table[hash];
            table[hash] = new Node(key, value);
            table[hash].next = next;
        }
        public void clear() {
            size = 0;
            for (int i = 0; i < TABLE_SIZE; i++)
                table[i] = null;
        }

        public V get(K key) {
            int hash = key.hashCode() % TABLE_SIZE;
            Node curr = table[hash];
            while (curr != null) {
                if (curr.key == key)
                    return (V) curr.value;
                curr = curr.next;
            }
            return null;
        }


    public Object remove(K key) {
        int hash = key.hashCode() % TABLE_SIZE;
        Node curr = table[hash];
        if (curr == null)
            return null;
        else if (curr.key == key) {
            table[hash] = null;
            return curr.value;
        }
        while (curr.next != null) {
            if (curr.next.key == key) {
                Object ret = curr.next.value;
                curr.next = curr.next.next;
                return ret;
            }
            curr = curr.next;
        }
        return null;
    }

        private class Node<K,V> {
            K key;
            V value;
            Node next;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
                next = null;
            }
        }
}
