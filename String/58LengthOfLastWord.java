class Solution {
    public int lengthOfLastWord(String s) 
    {
        String[] array = s.split(" ");
        String str = array[array.length-1];

        int length = str.length(); 
        return length;   
    }
}