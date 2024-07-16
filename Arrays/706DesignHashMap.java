class MyHashMap {

    List<List<Integer>> list;
    public MyHashMap() 
    {
        list = new ArrayList<>();
    }
    
    public void put(int key, int value) 
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).get(0) == key)
            {
               list.remove(i);
            }
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(key);
        list1.add(value);
        list.add(list1); 
    }
    
    public int get(int key) 
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).get(0) == key)
            {
                return list.get(i).get(1);
            }
        }
        return -1;  
    }
    
    public void remove(int key) 
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).get(0) == key)
            {
               list.remove(i);
            }
        } 
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */