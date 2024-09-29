class Node 
{
    String str;
    Node next;
    int count;
   
    Node() 
    {

    }
   
    Node(String str, int count) 
    {
        this.str = str;
        this.count = count;
    }
}

class AllOne 
{
    Node head;

    public AllOne() 
    {
    }
    
    public void inc(String key) 
    {
        if (head == null) 
        {
            Node newNode = new Node(key, 1);
            head = newNode;
            return;
        }

        Node temp = head;
        
        while (temp != null) 
        {
            if (temp.str.equals(key)) 
            {
                temp.count = temp.count + 1;
                return;
            }

            temp = temp.next;
        }

        Node newNode = new Node(key, 1);
        newNode.next = head;
        head = newNode;    
    }
    
    public void dec(String key) 
    {
        Node temp = head;
        Node prev = null;

        while (temp != null) 
        {
            if (temp.str.equals(key)) 
            {
                temp.count = temp.count - 1;
                
                if (temp.count == 0) 
                {
                    if (prev != null) 
                    {
                        prev.next = temp.next;
                    } 
                    else 
                    {
                        head = temp.next;
                    }
                }

                return;
            }
            prev = temp;
            temp = temp.next;
        }    
    }
    
    public String getMaxKey() 
    {
        Node temp = head;
        int max = Integer.MIN_VALUE;
        String maxKey = "";

        while (temp != null) 
        {
            if (temp.count > max) 
            {
                max = temp.count;
                maxKey = temp.str;
            }

            temp = temp.next;
        }

        return maxKey;    
    }
    
    public String getMinKey() 
    {
        Node temp = head;
        int min = Integer.MAX_VALUE;
        String minKey = "";

        while (temp != null) 
        {
            if (temp.count < min) 
            {
                min = temp.count;
                minKey = temp.str;
            }
            
            temp = temp.next;
        }

        return minKey;    
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */