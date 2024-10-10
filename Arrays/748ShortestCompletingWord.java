class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) 
    {
        licensePlate = licensePlate.toLowerCase();
    	int[] chars = new int[26];
    	
    	String str = "";
    	int min = Integer.MAX_VALUE;
    	
    	for (int i=0; i<licensePlate.length(); i++)
    	{
    		char ch = licensePlate.charAt(i);
    		if (ch >= 'a' && ch <= 'z')
    		{
    			chars[ch-'a']++;
    		}
    	}
    	
    	for (int i=0; i<words.length; i++)
    	{
            int[] temp = chars.clone();

    		for (int j=0; j<words[i].length(); j++)
    		{
    			char ch = words[i].charAt(j);
    			temp[ch-'a']--;
    		}
    		
    		boolean contains = true;
    		
    		for (int j=0; j<temp.length; j++)
    		{
    			if (temp[j] > 0)
    			{
    				contains = false;
    				break;
    			}
    		}
    		
    		if (contains && words[i].length() < min)
    		{
    			min = words[i].length();
    			str = words[i];
    		}
    	}       

        return str;    
    }
}