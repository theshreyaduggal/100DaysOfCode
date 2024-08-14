class Solution {
    public List<String> generateParenthesis(int n)
    {
        ArrayList<String> list = new ArrayList<>();
        generateParenthesis(list, "", 0, 0, n);
        
        return list;
    }

    public void generateParenthesis(ArrayList<String> list, String str, int open, int close, int max) 
    {
        if (str.length() == max * 2) 
        {
            list.add(str);
            return;
        }

        if (open < max) 
        {
            generateParenthesis(list, str + "(", open+1, close, max);
        }
        if (close < open) 
        {
            generateParenthesis(list, str + ")", open, close + 1, max);
        }    
    }
}