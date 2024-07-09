class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) 
    {
        int arrival = arrivalTime + delayedTime;

        if (arrival >= 24)
        {
            return arrival-24;
        }
        return arrival;
    }
}