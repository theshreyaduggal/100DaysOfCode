class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        ArrayList<Integer> words = new ArrayList<>();

        for (int i=0; i<sentences.length; i++)
        {
            String[] array = sentences[i].split(" ");
            words.add(array.length);
        }
        words.sort(null);  
        
        return words.get(words.size()-1); 
    }
}