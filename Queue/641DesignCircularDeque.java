class MyCircularDeque 
{
    ArrayList<Integer> list;
    int size;

    public MyCircularDeque(int k) 
    {
        list = new ArrayList<>();
        size = k;     
    }
    
    public boolean insertFront(int value) 
    {  
        if(list.size() < size)
        {
            list.add(0, value);
            return true;
        }
        else
        {
            return false;
        }  
    }
    
    public boolean insertLast(int value) 
    {
        if(list.size() < size)
        {
            list.add(value);
            return true;
        }
        else
        {
            return false;
        }    
    }
    
    public boolean deleteFront() 
    {
        if(list.size() > 0)
        {
            list.remove(0);
            return true;
        }
        else
        {
            return false;
        }    
    }
    
    public boolean deleteLast() 
    {
        if(list.size() > 0)
        {
            list.remove(list.size()-1);
            return true;
        }
        else
        {
            return false;
        }    
    }
    
    public int getFront() 
    {
        if(list.size() > 0) 
        {
            return list.get(0);
        }
        else 
        {
            return -1;    
        }
    }
    
    public int getRear()
    {
        if(list.size() > 0) 
        {
            return list.get(list.size()-1);
        }
        else 
        {
            return -1;    
        }    
    }
    
    public boolean isEmpty() 
    {
        if (list.size() == 0)
        {
            return true;
        }    
        else
        {
            return false;
        }
    }
    
    public boolean isFull() 
    {
        if (list.size() == size)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */