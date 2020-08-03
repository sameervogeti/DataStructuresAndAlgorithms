// Given a 2D matrix, if an element is 0, set its entire row and column to 0. Do it in place.
//Input: 1, 1, 0, 1
//       1, 1, 1, 0
//       1, 1, 0, 1
class Main {

    public static void setZeros(int[][] matrix)
    {

        boolean firstRowIsZero = false;
        boolean firstColumnIsZero = false;

        for(int row = 0; row < matrix.length; row++)
        {
            if(matrix[row][0] == 0)
            {
                firstColumnIsZero = true;
                break;
            }
        }

        for(int column = 0; column < matrix[0].length; column++)
        {
            if(matrix[0][column] == 0)
            {
                firstRowIsZero = true;
                break;
            }
        }

        for(int row = 1; row < matrix.length; row++)
        {
            for(int column = 1; column < matrix[0].length; column++)
            {
                if(matrix[row][column] == 0)
                {
                    matrix[row][0] = 0;
                    matrix[0][column] = 0;
                }
            }
        }

        for(int row = 1; row < matrix.length; row++)
        {
            for (int column = 1; column < matrix[0].length; column++)
            {
                if(matrix[row][0] == 0 || matrix[0][column] == 0)
                {
                    matrix[row][column] = 0;
                }
            }
        }

        if(firstColumnIsZero)
        {
            for(int row = 0; row < matrix.length; row++)
            {
                matrix[row][0] = 0;
            }
        }

        if(firstRowIsZero)
        {
            for(int row = 0; row < matrix[0].length; row++)
            {
                matrix[0][row] = 0;
            }
        }
    }

    public static void printMatrix(int matrix[][])
    {
        int row = 0;
        int column = 0;
        for (row = 0; row < matrix.length; row++)
        {
            for (column = 0; column < matrix[0].length; column++)
            {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//Input: 1, 1, 0, 1
//       1, 1, 1, 0
//       1, 1, 0, 1
        int matrix[][] = {{1, 1, 0, 1}, {1, 1, 1, 0}, {1, 1, 0, 1}};

        setZeros(matrix);
        printMatrix(matrix);
    }
}
