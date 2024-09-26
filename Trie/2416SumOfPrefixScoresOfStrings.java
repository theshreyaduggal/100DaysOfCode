class Solution 
{
    class Node 
    {
        Node[] children = new Node[26];
        int count = 0;
    } 
    public int[] sumPrefixScores(String[] words) 
    {
        Node root = new Node();
        
        for (String word : words) 
        {
            Node node = root;

            for (char ch : word.toCharArray()) 
            {
                if (node.children[ch - 'a'] == null) 
                {
                    node.children[ch - 'a'] = new Node();
                }

                node = node.children[ch - 'a'];
                node.count++;
            }
        }

        int[] result = new int[words.length];
        
        for (int i=0; i<words.length; i++) 
        {
            Node node = root;
            int score = 0;
            
            for (char ch : words[i].toCharArray()) 
            {
                node = node.children[ch - 'a'];
                score = score + node.count;
            }

            result[i] = score;
        }
        
        return result;    
    }
}