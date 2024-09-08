class MyHashSet 
{
    int size = (int) Math.pow(10, 6) + 1;
    boolean[] set;

    public MyHashSet() 
    {
        set = new boolean[size];    
    }
    
    public void add(int key) 
    {
        set[key] = true;    
    }
    
    public void remove(int key) 
    {
        set[key] = false;    
    }
    
    public boolean contains(int key) 
    {
        return set[key];   
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */