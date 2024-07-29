class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                char ch = board[i][j];
                if(ch == '.')   
                {
                    continue;
                }

                for(int k=0; k<9; k++)
                {
                    if(board[i][k] == ch && k != j)   
                    {
                        return false;
                    }
                    if(board[k][j] == ch && k != i)   
                    {
                        return false;
                    }
                }
            }
        }

        for(int i=0; i<9; i=i+3)
        {
            for(int j=0; j<9; j=j+3)
            {
                HashSet<Character> set = new HashSet<>();
                for(int k=0; k<3; k++)
                {
                    for(int m=0; m<3; m++)
                    {
                        if(board[i+k][j+m] == '.')  
                        {
                            continue;
                        }

                        if(set.contains(board[i+k][j+m]))  
                        {
                            return false;
                        }
                        else    
                        {
                            set.add(board[i+k][j+m]);
                        }
                    }
                }
            }
        }

        return true;    
    }
}