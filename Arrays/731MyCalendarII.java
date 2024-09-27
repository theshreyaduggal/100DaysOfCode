class MyCalendarTwo 
{
    ArrayList<int[]> list1;
    ArrayList<int[]> list2;

    public MyCalendarTwo() 
    {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();    
    }
    
    public boolean book(int start, int end) 
    {
        for (int[] x : list2)
        {
            if (Math.max(start, x[0]) < Math.min(end, x[1]))
            {
                return false;
            }
        }

        for (int[] y : list1) 
        {
            int max = Math.max(start, y[0]);
            int min = Math.min(end, y[1]);
        
            if (max < min)
            {
                list2.add(new int[] {max, min});
            }
        }

        list1.add(new int[] {start, end});
    
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */