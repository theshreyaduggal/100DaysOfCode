class Solution {
    public String decodeMessage(String key, String message) 
    {
        HashMap<Character,Character> map = new HashMap<>();
        char c = 'a';

        for(char ch : key.toCharArray())
        {
            if(ch != ' ' && !map.containsKey(ch)) 
            {
                map.put(ch, c);
                c++;
            }
        }
        
        String str = "";
        for(char ch : message.toCharArray())
        {
            if(ch == ' ') 
            {
                str = str + " ";
            }
            else 
            {
                str = str + map.get(ch);
            }
        }
        return str;    
    }
}