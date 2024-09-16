class Solution {
    public int findMinDifference(List<String> timePoints) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (String timePoint : timePoints) 
        {
            int hour = Integer.parseInt(timePoint.substring(0, 2));
            int min = Integer.parseInt(timePoint.substring(3));
            int minutes = hour * 60 + min;
            
            list.add(minutes);
        }
        
        Collections.sort(list);
        
        int min = Integer.MAX_VALUE;

        for (int i=1; i<list.size(); i++) 
        {
            min = Math.min(list.get(i)-list.get(i-1), min);
        }

        return Math.min(min, 1440+list.get(0)-list.get(list.size()-1));   
    }
}