class Solution {
    public int maxNumberOfBalloons(String text) 
    {
        HashMap<Character,Integer> map = new HashMap();
        ArrayList<Character> list = new ArrayList<>();
        list.add('b');
        list.add('a');
        list.add('l');
        list.add('l');
        list.add('o');
        list.add('o');
        list.add('n');
        
        for(int i=0; i<text.length(); i++)
        {
            char ch = text.charAt(i);
            if(list.contains(ch))
            {
                if(map.containsKey(ch))
                {
                    map.put(ch, map.get(ch)+1);
                }
                else
                {
                    map.put(ch, 1);
                }
            }
        }

        for(int i=0; i<list.size(); i++)
        {
            if(!map.containsKey(list.get(i))) 
            {
                return 0;
            }
        }
        
        int min=Integer.MAX_VALUE;

        for(char key: map.keySet())
        {
            if(key=='l' || key=='o') 
            {
                min = Math.min(min, map.get(key)/2);
            }
            else
            {
                min = Math.min(min, map.get(key));
            }
        }
        
        for(char key: map.keySet())
        {
            if(map.get(key) < min)
            {
                return 0;
            }
        }
        return min;    
    }
}