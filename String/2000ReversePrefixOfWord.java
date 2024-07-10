class Solution {
    public String reversePrefix(String word, char ch) 
    {
        int index = word.indexOf(ch);
        if (index == -1)
        {
            return word;
        }

        String sub1 = word.substring(0, index+1);
        String sub2 = word.substring(index+1, word.length());

        String rev = "";
		for (int i=sub1.length()-1; i>=0; i--)
		{
			rev = rev + word.charAt(i);
		}
         
        String s = rev + sub2;

        return s; 
    }
}