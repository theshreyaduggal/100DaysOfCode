class Solution {
    public int regionsBySlashes(String[] grid) 
    {
        int array[][] = new int[grid.length*3][grid.length*3];
        int row = 0;
        int col = 0;

        for(String s: grid) 
        {
            for(char c: s.toCharArray()) 
            {
                if(Character.toString(c).equals("\\")) 
                {
                    int i = row;
                    int j = col;

                    while(i < row+3 && j < col+3)
                    { 
                        array[i][j] = 1;
                        i++;
                        j++;
                    }
                }
                if(Character.toString(c).equals("/")) 
                {
                    int i = row;
                    int j = col+2;

                    while(i < row+3 && j >= col) 
                    {
                        array[i][j] = 1;
                        i++;
                        j--;
                    }
                }

                col = col + 3;
                if(col >= array[0].length) 
                {
                    row = row + 3;
                    col = 0;
                }
            }
        }
        int region = 0;

        for(int i=0; i<array.length; i++) 
        {
            for(int j=0; j<array[0].length; j++) 
            {
                if(array[i][j] == 0) 
                {
                    helper(array, i, j);
                    region++;
                }
            }
        }
        return region;    
    }

    public void helper(int arr[][], int i, int j) 
    {
        if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j]==1)
        {
            return;
        }

        arr[i][j] = 1;

        helper(arr, i+1, j);
        helper(arr, i, j+1);
        helper(arr, i-1, j);
        helper(arr, i, j-1);
    }
}