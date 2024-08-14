class Solution {
    public int maxRepeating(String sequence, String word) 
    {
        int count = 0;
        String str = word;

        while(sequence.contains(word) == true) 
        {
            count++;
            word = word + str;
        }
        
        return count;    
    }
}