class MyCalendar 
{
    ArrayList<int[]> list;

    public MyCalendar() 
    {
        list = new ArrayList<>();    
    }
    
    public boolean book(int start, int end) 
    {
        for (int[] x : list) 
        {
            if ((start<x[0] && end>x[0]) || (start==x[0]) || (start>x[0] && start <x[1])) 
            {
                return false;
            }
        }

        list.add(new int[]{start, end});

        return true;    
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */