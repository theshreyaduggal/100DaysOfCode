class Solution {
    public boolean isAcronym(List<String> words, String s) 
    {
        String str = "";
        for (int i=0; i<words.size(); i++)
        {
            String character = words.get(i);
            str = str + character.charAt(0);
        } 
        if (str.equals(s))
        {
            return true;
        }   
        return false;
    }
}