class Node
{
    int val;
    Node next;
    public Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}

class MyLinkedList 
{
    Node head;
    Node tail;
    int size;

    public MyLinkedList() 
    {
        this.head = null;
        this.tail = null;
        this.size = 0;    
    }
    
    public int get(int index) 
    {
        if(index>=size || head==null)
        {
            return -1;
        }

        Node currNode = head;
        while(index>0)
        {
            currNode = currNode.next;
            index--;
        }
        return currNode.val;     
    }
    
    public void addAtHead(int val) 
    {
        Node newNode = new Node(val);
        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            newNode.next = head;
            head = newNode;
        }
        size++;  
    }
    
    public void addAtTail(int val) 
    {
        Node newNode = new Node(val);
        if (head == null) 
        {
            head = newNode;
        }
        else
        {
            Node currNode = head;
            while(currNode.next!=null)
            {
                currNode = currNode.next;
            }

            currNode.next = newNode;
        }
        size++;    
    }
    
    public void addAtIndex(int index, int val) 
    {
        if (index < 0 || index > size) 
        {
            return;
        } 
        else if (index == 0) 
        {
            addAtHead(val);
        } 
        else if (index == size) 
        {
            addAtTail(val);
        } 
        else 
        {
            Node newNode = new Node(val);
            Node currNode = head;
            for (int i=0; i<index-1; i++) 
            {
                currNode = currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
            size++;
        }    
    }
    
    public void deleteAtIndex(int index) 
    {
        if (index<0 || index>=size || head==null) 
        {
            return;
        } 
        else if (index == 0) 
        {
            head = head.next;
        } 
        else if (index == size-1) 
        {
            Node currNode = head;
            while (currNode.next.next != null) 
            {
                currNode = currNode.next;
            }
            currNode.next = null;
        } 
        else 
        {
            Node currNode = head;
            for (int i=0; i<index-1; i++) 
            {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
        }
        size--;    
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */