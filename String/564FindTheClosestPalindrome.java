class Solution {
    public String nearestPalindromic(String n)
    {
        int index = 0;

        if (n.length() % 2 == 0)
        {
            index = ((n.length() / 2) - 1);
        }
        else
        {
            index = (n.length() / 2);
        }

        long left = Long.parseLong(n.substring(0, index + 1));

        List<Long> list = new ArrayList<>();

        list.add(getPalindrom(left, n.length() % 2 == 0));
        list.add(getPalindrom(left + 1, n.length() % 2 == 0));
        list.add(getPalindrom(left - 1, n.length() % 2 == 0));
        list.add((long) Math.pow(10, n.length()) + 1);
        list.add((long) Math.pow(10, n.length() - 1) - 1);

        long diff = Long.MAX_VALUE;
        long res = 0;
        long num = Long.parseLong(n);

        for (long l : list) 
        {
            if (l == num) 
            {
                continue;
            }

            if (Math.abs(l - num) < diff) 
            {
                diff = Math.abs(l-num);
                res = l;
            } 
            else if (Math.abs(l - num) == diff) 
            {
                res = Math.min(res, l);
            }
        }
        
        return String.valueOf(res);    
    }

    public long getPalindrom(long left, boolean check) 
    {
        long res = left;
        
        if (!check) 
        {
            left = left / 10;
        }

        while (left > 0) 
        {
            res = (res * 10) + (left % 10);
            left = left / 10;
        }

        return res;
    }
}