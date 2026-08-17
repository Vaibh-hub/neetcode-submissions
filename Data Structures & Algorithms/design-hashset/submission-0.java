class MyHashSet {
    HashSet<Integer> st;
    public MyHashSet() {
        st = new HashSet<>();
    }
    
    public void add(int key) {
        st.add(key);
    }
    
    public void remove(int key) {
        st.remove(key);
    }
    
    public boolean contains(int key) {
        for(int s : st){
            if(s==key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */