class Solution {
    public String reverseWords(String s) 
    {
        String[] array = s.split(" ");

        for (int i=0; i<array.length; i++)
        {
            String temp = array[i];
            String rev = "";

            for (int j=temp.length()-1; j>=0; j--)
            {
                rev = rev + temp.charAt(j);
            }

            array[i] = rev;
        }   

        String ans = "";
        for (int i=0; i<array.length; i++)
        {
            ans = ans + array[i] + " ";
        }

        return ans.trim();
    }
}