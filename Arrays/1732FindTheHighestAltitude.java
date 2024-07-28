class Solution {
    public int largestAltitude(int[] gain) 
    {
        ArrayList<Integer> altitude = new ArrayList<>();
        altitude.add(0);
        int sum = altitude.get(0);
        for (int i=0; i<gain.length; i++)
        {
            sum = sum + gain[i];
            altitude.add(sum);
        }    
        altitude.sort(null);

        return altitude.get(altitude.size()-1);
    }
}