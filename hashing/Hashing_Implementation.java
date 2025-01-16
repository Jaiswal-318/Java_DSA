package concept.hashing;

import java.util.LinkedList;

public class Hashing_Implementation<K,V> {
    private static class HashNode<K, V> {
        K key;
        V value;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HashNode<K,V>>[] map;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public Hashing_Implementation() {
        capacity = 10;  // Initial capacity of the HashMap
        map = new LinkedList[capacity];
        size = 0;

        for (int i = 0; i < capacity; i++) {
            map[i] = new LinkedList<>();
        }
    }
    // Hash function to compute index for a key
    private int getIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    // Insert a key-value pair
    public void put(K key, V value) {
        int index = getIndex(key);
        LinkedList<HashNode<K, V>> bucket = map[index];

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;  // Update the value if key already exists
                return;
            }
        }

        // If the key doesn't exist, add a new node
        bucket.add(new HashNode<>(key, value));
        size++;

        // Resize the map if the load factor exceeds 0.7
        if ((1.0 * size) / capacity >= 0.7) {
            resize();
        }
    }

    // Get a value by key
    public V get(K key) {
        int index = getIndex(key);
        LinkedList<HashNode<K, V>> bucket = map[index];

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null;  // Return null if key is not found
    }

    // Remove a key-value pair
    public V remove(K key) {
        int index = getIndex(key);
        LinkedList<HashNode<K, V>> bucket = map[index];

        HashNode<K, V> toRemove = null;
        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                toRemove = node;
                break;
            }
        }

        if (toRemove == null) {
            return null;  // Key not found
        }

        bucket.remove(toRemove);
        size--;
        return toRemove.value;
    }

    // Resize the map when load factor exceeds 0.7
    @SuppressWarnings("unchecked")
    private void resize() {
        LinkedList<HashNode<K, V>>[] oldMap = map;
        capacity *= 2;
        map = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            map[i] = new LinkedList<>();
        }

        size = 0;

        for (LinkedList<HashNode<K, V>> bucket : oldMap) {
            for (HashNode<K, V> node : bucket) {
                put(node.key, node.value);
            }
        }
    }

    // Return the current size of the HashMap
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Hashing_Implementation<String, Integer> map = new Hashing_Implementation<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        System.out.println("Get apple: " + map.get("apple"));  // Output: 1
        System.out.println("Size: " + map.size());  // Output: 3

        map.remove("banana");
        System.out.println("Size after removing banana: " + map.size());  // Output: 2
        System.out.println("Get banana: " + map.get("banana"));  // Output: null
    }
}

