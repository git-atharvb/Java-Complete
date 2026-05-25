package Hash;
public class Rehash {
    public static void main(String[] args) {
        SimpleHashMap<String, Integer> map = new SimpleHashMap<>();
        System.out.println("Before inserts: capacity=" + map.capacity() + ", size=" + map.size());

        for (int i = 1; i <= 10; i++) {
            map.put("key" + i, i);
            if (i == 3 || i == 5 || i == 9 || i == 10) {
                System.out.println("After inserting " + i + " entries: capacity=" + map.capacity() + ", size=" + map.size() + ", load=" + String.format("%.2f", map.loadFactor()));
            }
        }
        System.out.println("Value for key5 = " + map.get("key5"));
    }
    static class SimpleHashMap<K, V> {
        private static final int DEFAULT_CAPACITY = 4;
        private static final float LOAD_FACTOR = 0.75f;
        private Entry<K, V>[] table;
        private int size;
        @SuppressWarnings("unchecked")
        public SimpleHashMap() {
            table = (Entry<K, V>[]) new Entry[DEFAULT_CAPACITY];
            size = 0;
        }
        public V get(K key) {
            int index = indexFor(key.hashCode(), table.length);
            Entry<K, V> entry = table[index];
            while (entry != null) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
                entry = entry.next;
            }
            return null;
        }
        public void put(K key, V value) {
            if (size + 1 > table.length * LOAD_FACTOR) {
                rehash();
            }
            int index = indexFor(key.hashCode(), table.length);
            Entry<K, V> entry = table[index];
            while (entry != null) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
                entry = entry.next;
            }
            table[index] = new Entry<>(key, value, table[index]);
            size++;
        }
        public int size() {
            return size;
        }
        public int capacity() {
            return table.length;
        }
        public float loadFactor() {
            return (float) size / table.length;
        }
        @SuppressWarnings("unchecked")
        private void rehash() {
            Entry<K, V>[] oldTable = table;
            table = (Entry<K, V>[]) new Entry[oldTable.length * 2];
            size = 0;
            for (Entry<K, V> entry : oldTable) {
                while (entry != null) {
                    put(entry.key, entry.value);
                    entry = entry.next;
                }
            }
        }
        private int indexFor(int hash, int length) {
            return (hash & 0x7fffffff) % length;
        }
        static class Entry<K, V> {
            final K key;
            V value;
            Entry<K, V> next;
            Entry(K key, V value, Entry<K, V> next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }
        }
    }
}