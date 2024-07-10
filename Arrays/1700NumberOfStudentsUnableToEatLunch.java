class Solution {
    public int countStudents(int[] students, int[] sandwiches) 
    {
        int circleCount = 0;
        int squareCount = 0;

        for (int i=0; i<students.length; i++)
        {
            if (students[i] == 0)
            {
                circleCount++;
            }
            else
            {
                squareCount++;
            }
        }    
        for (int j=0; j<sandwiches.length; j++)
        {
            if (sandwiches[j] == 0 && circleCount == 0)
            {
                return squareCount;
            }
            else if (sandwiches[j] == 1 && squareCount == 0)
            {
                return circleCount;
            }
            else if (sandwiches[j] == 0)
            {
                circleCount--;
            }
            else
            {
                squareCount--;
            }
        }
        return 0;
    }
}