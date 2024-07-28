class Solution {
    public String firstPalindrome(String[] words) 
    {
        for (int i=0; i<words.length; i++)
        {
            int length = words[i].length();
            System.out.println("LEN: " + length);
            boolean check = true;

            for (int j=0; j<length; j++)
		    {
                if (words[i].charAt(j) != words[i].charAt((length-1)-j))
			    {
                    check = false;
			    }
		    } 
            if (check == true)
            {
                return words[i];
            }
        }
        return "";
           
    }
}