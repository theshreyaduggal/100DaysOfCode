class Solution {
    public String reverseWords(String s) 
    {	
        String[] words = s.split("\\s+");
        String str="";
        for (int i=words.length-1; i>=0; i--)
		{
			str = str+words[i]+" ";
		}
		return str.trim();
    }
}