public class Problem4Sudoku
{
    public static void main(String[] args)
    {
        int[][] grid = {{1,3,5,2,9,7,8,6,4},
                        {9,8,2,4,1,6,7,5,3},
                        {7,6,4,3,8,5,1,9,2},
                        {2,1,8,7,3,9,6,4,5},
                        {5,9,7,8,6,4,2,3,1},
                        {6,4,3,1,5,2,9,7,8},
                        {4,2,6,5,7,1,3,8,9},
                        {3,5,9,6,2,8,4,1,7},
                        {8,7,1,9,4,3,5,2,6}};

        for(int i = 0; i < 9; ++ i)
        {
            for(int j = 0; j < 9; ++ j)
            {
                -- grid[i][j];
            }
        }

        boolean isSolution = true;

        for(int i = 0; i < 9; ++ i)
        {
            isSolution &= checkRoll(grid, i);
        }

        for(int i = 0; i < 9; ++ i)
        {
            isSolution &= checkColumn(grid, i);
        }

        for(int i = 0; i < 3; ++ i)
        {
            for (int j = 0; j < 3; ++j)
            {
                isSolution &= checkBox(grid, i * 3, j * 3);
            }
        }

        if(isSolution)
        {
            System.out.println("This is a solution.");
        }else
        {
            System.out.println("This isn't a solution");
        }
    }

    public static boolean checkRoll(int[][] grid, int roll)
    {
        boolean[] used = new boolean[9];
        for(int i = 0; i < 9; ++ i)
        {
            if(used[grid[roll][i]])
            {
                return false;
            }
            used[grid[roll][i]] = true;
        }

        return true;
    }

    public static boolean checkColumn(int[][] grid, int column)
    {
        boolean[] used = new boolean[9];
        for(int i = 0; i < 9; ++ i)
        {
            if(used[grid[i][column]])
            {
                return false;
            }
            used[grid[i][column]] = true;
        }

        return true;
    }

    public static boolean checkBox(int[][] grid, int roll, int column)
    {
        boolean[] used = new boolean[9];
        for(int i = 0; i < 3; ++ i)
        {
            for(int j = 0; j < 3; ++ j)
            {
                if(used[grid[roll + i][column + j]])
                {
                    return false;
                }
                used[grid[roll + i][column + j]] = true;
            }
        }

        return true;
    }
}
