class Solution {
    public List<Integer> getRow(int rowIndex)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        long num = 1;

        for (int i=1; i<=rowIndex; i++)
        {
            long number = (num * (rowIndex-i+1)) / i;
            list.add((int)number);
            num = number;
        }      

        return list;
    }
}