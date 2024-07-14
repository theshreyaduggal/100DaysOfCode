class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] array = new String[score.length];
        for (int i=0; i<score.length; i++)
        {
            map.put(score[i], i);
        }    

        Arrays.sort(score);

        for (int i=0; i<score.length; i++)
        {
            int rank = score.length-i;
            if (rank == 1)
            {
                array[map.get(score[i])] = "Gold Medal";
            }
            else if (rank == 2)
            {
                array[map.get(score[i])] = "Silver Medal";
            }
            else if (rank == 3)
            {
                array[map.get(score[i])] = "Bronze Medal";
            }
            else
            {
                array[map.get(score[i])] = Integer.toString(rank);
            }
        }
        return array;
    }
}