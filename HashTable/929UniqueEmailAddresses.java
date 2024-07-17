class Solution {
    public int numUniqueEmails(String[] emails) 
    {
        HashSet<String> set = new HashSet<>(); 
        int count = 0;

        for(String email : emails)
        {
            int index1 = email.indexOf("@");
            int index2 = email.indexOf("+");

            String str = "";
            if (index2 >= 0)
            {
                str = email.substring(0, index2);
            }
            else
            {
                str = email.substring(0, index1);
            }
            str = str.replace(".","") + email.substring(index1);
            
            if (set.add(str))
            {
                count++;
            }
        }
        return count;   
    }
}