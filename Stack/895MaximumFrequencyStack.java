class FreqStack 
{
    HashMap<Integer,Stack<Integer>> stackMap;
    HashMap<Integer,Integer> map;
    int maxFreq = 0;

    public FreqStack() 
    {
        stackMap = new HashMap<>();
        map = new HashMap<>(); 
    }
    
    public void push(int val) 
    {
        if (map.containsKey(val))
        {
            map.put(val, map.get(val)+1);
        }
        else
        {
            map.put(val, 1);
        }
        
        int freq = map.get(val);

        if(freq > maxFreq)
        {
            maxFreq = freq;
        }

        Stack<Integer> stack = new Stack();

        if(stackMap.containsKey(freq))
        {
            stack = stackMap.get(freq);
        }

        stack.push(val);
        stackMap.put(freq, stack);    
    }
    
    public int pop() 
    {
        Stack<Integer> stack = stackMap.get(maxFreq);
        int ans = stack.pop();

        map.put(ans, map.get(ans)-1);

        if(stackMap.get(maxFreq).size() == 0)
        {
            stackMap.remove(maxFreq);
            maxFreq--;
        }

        return ans;    
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */