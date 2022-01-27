public class MyHashMap {
    public static class HashMap {
        private int TABLE_SIZE;
        private int size;
        private HashEntry[] table;
        public HashMap(int TABLE_SIZE) {
            this.TABLE_SIZE = TABLE_SIZE;
            this.size = 0;
            this.table = new HashEntry[TABLE_SIZE];
        }

        public int getSize() {
            return size;
        }
        public void put(Integer key, Integer value) {
            int hash = key.hashCode() % TABLE_SIZE;
            remove(key);
            HashEntry next = table[hash];
            table[hash] = new HashEntry(key, value);
            table[hash].next = next;
        }
        public void clear() {
            size = 0;
            for (int i = 0; i < TABLE_SIZE; i++)
                table[i] = null;
        }

        public Integer get(Integer key) {
            int hash = key.hashCode() % TABLE_SIZE;
            HashEntry curr = table[hash];
            while (curr != null) {
                if (curr.key == key)
                    return curr.value;
                curr = curr.next;
            }
            return null;
        }


        public Integer remove(Integer key) {
            int hash = key.hashCode() % TABLE_SIZE;
            HashEntry curr = table[hash];
            if (curr == null)
                return null;
            else if (curr.key == key) {
                table[hash] = null;
                return curr.value;
            }
            while (curr.next != null) {
                if (curr.next.key == key) {
                    Integer ret = curr.next.value;
                    curr.next = curr.next.next;
                    return ret;
                }
                curr = curr.next;
            }
            return null;
        }

        private class HashEntry {
            Integer key, value;
            HashEntry next;

            HashEntry(Integer key, Integer value) {
                this.key = key;
                this.value = value;
                next = null;
            }
        }
    }
}
