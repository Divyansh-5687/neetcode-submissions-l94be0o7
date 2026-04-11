class MyHashMap {
    int[] map;

    public MyHashMap() {
        map = new int[1000001]; // Supports keys from 0 to 1,000,000
        Arrays.fill(map, -1);   // -1 means key is not present
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key]; // Returns -1 if key is not present
    }

    public void remove(int key) {
        map[key] = -1; // Mark as removed
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */