class Solution {
    public List<Integer> diffWaysToCompute(String expression) 
    {
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<expression.length(); i++) 
        {
            char ch = expression.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*') 
            {
                List<Integer> list1 = diffWaysToCompute(expression.substring(0,i));
                List<Integer> list2 = diffWaysToCompute(expression.substring(i+1));

                for (int num1 : list1) 
                {
                    for (int num2 : list2) 
                    {
                        if (ch == '+') 
                        {
                            list.add(num1 + num2);
                        }
                        else if (ch == '-') 
                        {
                            list.add(num1 - num2);
                        }
                        else if (ch == '*') 
                        {
                            list.add(num1 * num2);
                        }
                    }
                }
            }
        }

        if (list.isEmpty()) 
        {
            list.add(Integer.parseInt(expression));
        }

        return list;    
    }
}