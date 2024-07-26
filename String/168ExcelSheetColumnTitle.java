class Solution {
    public String convertToTitle(int columnNumber) 
    {
        String str = "";
        while (columnNumber > 0) 
        {
            columnNumber--;
            char ch = (char) ('A' + columnNumber % 26);
            str = ch + str;
            columnNumber /= 26;
        }

        return str; 
    }
}