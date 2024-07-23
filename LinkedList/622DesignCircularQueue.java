class ListNode 
{
    int data;
    ListNode next;
    public ListNode(int data, ListNode next) 
    {
        this.data = data;
        this.next = next;
    }
}

class MyCircularQueue 
{
    int size = 0;
    int maxSize = 0;
    ListNode head = null;
    ListNode tail = null;

    public MyCircularQueue(int k) 
    {
        maxSize = k;    
    }
    
    public boolean enQueue(int value) 
    {
        if (isFull())
        {
            return false;
        }

        ListNode newNode = new ListNode(value, null);

        if (isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() 
    {
        if (isEmpty())
        {
            return false;
        }
        head = head.next;
        size--;
        return true;    
    }
    
    public int Front() 
    {
        if (isEmpty())
        {
            return -1;
        }    
        else
        {
            return head.data;
        }
    }
    
    public int Rear() 
    {
        if (isEmpty())
        {
            return -1;
        }    
        else
        {
            return tail.data;
        }    
    }
    
    public boolean isEmpty() 
    {
        if (size == 0)
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
        if (size == maxSize)
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
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */