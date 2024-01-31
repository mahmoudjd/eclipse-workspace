package oop.sudoku;

public class Sudoku
{

    private static int[][] matrix;

    private static void setBoard(int[][] board)
    {
        matrix = board;
    }

    // test, die Laenge der Matrizen und ob der Matrix null ist
    private static int[][] checkBoard(int[][] board)
    {
        if (board == null)
        {
            throw new IllegalArgumentException();
        }
        if (board.length != 9)
        {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < 9; i++)
        {
            if (board[i].length != 9)
            {
                throw new IllegalArgumentException();
            }
        }
        return board;
    }

    // testet , ob die Werte zwischen 1 und 9 sind
    private static int[][] checkBoardsValues(int[][] board)
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                int value = board[i][j];
                if (value < 0 && value > 9)
                {
                    throw new IllegalArgumentException();
                }
            }
        }
        return board;
    }

    // prueft , ob es einen ungueltigen Wert gibt
    private static boolean checkBoardsNotIllegalValues(int[][] board)
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                if (board[i][j] < 0 || board[i][j] > 9)
                {
                    throw new IllegalArgumentException();
                }
            }
        }
        return true;
    }

    // prueft, ob die Nummer zu einer Linie passt
    private static boolean testRow(int row, int number)
    {
        for (int i = 0; i < 9; i++)
        {
            if (matrix[row][i] == number)
            {
                return true;
            }
        }
        return false;
    }

    // prueft, ob die Nummer zu einer Spalte passt
    private static boolean testColumn(int column, int number)
    {
        for (int i = 0; i < 9; i++)
        {
            if (matrix[i][column] == number)
            {
                return true;
            }
        }

        return false;
    }

    // testet, ob dieNummer zu einem kleinen 3x3 Board passt
    private static boolean testSmallBox(int row, int col, int number)
    {
        int r = row - row % 3;
        int c = col - col % 3;

        for (int i = r; i < r + 3; i++)
        {
            for (int j = c; j < c + 3; j++)
            {
                if (matrix[i][j] == number)
                {
                    return true;
                }
            }
        }
        return false;
    }

    // testet, ob es mehre als ein mal number im Board stattgefunden ist
    private static boolean notDoppleNumber(int row, int col, int number)
    {
        return !testRow(row, number) && !testColumn(col, number) && !testSmallBox(row, col, number);
    }

    // testet, os der eingegbene Board loesbar ist
    private static boolean istLoesbar(int[][] board)
    {
        // check row
        for (int row = 0; row < 9; row++)
        {
            for (int column = 0; column < 8; column++)
            {
                for (int column2 = column + 1; column2 < 9; column2++)
                {
                    if (board[row][column] != 0 && board[row][column] == board[row][column2])
                    {
                        return false;
                    }
                }
            }
        }
        // check column
        for (int column = 0; column < 9; column++)
        {
            for (int row = 0; row < 8; row++)
            {
                for (int row2 = row + 1; row2 < 9; row2++)
                {
                    if (board[row][column] != 0 && board[row][column] == board[row2][column])
                    {
                        return false;
                    }
                }
            }
        }

        // check smallBoard
        for (int row = 0; row < 9; row += 3)
        {
            for (int column = 0; column < 9; column += 3)
            {
                for (int pos = 0; pos < 8; pos++)
                {
                    for (int pos2 = pos + 1; pos2 < 9; pos2++)
                    {
                        if (board[row + pos % 3][column + pos / 3] != 0 && board[row + pos % 3][column + pos / 3] == board[row + pos2 % 3][column + pos2 / 3])
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean helpSolve(int[][] board)
    {

        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9;)
            {
                if (board[i][j] == 0)
                {
                    // Versuche alle Zahlen von 1 bis 9 für nächstes
                    // gefundenes freies Feld:
                    for (int number = 1; number < 10; number++)
                    {
                        // Falls die Zahl zu keinem unmittelbaren Konflikt
                        // führt:

                        if (notDoppleNumber(i, j, number))
                        {
                            // Wert in board setzen, aber ACHTUNG:
                            // keine Kopie des Boards => muss bei Misserfolg
                            // wieder zurückgenommen werden:
                            board[i][j] = number;
                            // Löse Sudoku durch Füllen
                            // ab der nächsten Position:
                            // boolean solved = ;
                            // Erfolg:
                            if (helpSolve(board))
                            {

                                return true;
                            }
                            else
                            {
                                // Misserfolg: Änderung wieder zurücknehmen
                                board[i][j] = 0;
                            }
                        }
                    }
                    // alle Zahlen vergeblich durchprobiert => Misserfolg
                    return false;
                }

                j++;

            }

        }
        // Sind alle Felder gefuellt? Dann Erfolg!
        return true;
    }

    public static boolean solve(int[][] board)
    {

        setBoard(board);
        // Überprüfung des Parameters:
        checkBoard(matrix);
        checkBoardsValues(matrix);
        if (!checkBoardsNotIllegalValues(matrix))
        {
            throw new IllegalArgumentException();
        }

        if (!istLoesbar(matrix))
        {
            return false;
        }

        return helpSolve(matrix);

    }

    public static void print(int[][] arr, int nN)
    {// prints the sudoku
        for (int i = 0; i < nN; i++)
        {
            if (i % 3 == 0 && i != 0)
            {
                System.out.println("----------|---------|----------");
            }
            // int count1 = 0;
            for (int j = 0; j < nN; j++)
            {

                if (j % 3 == 0)
                {
                    System.out.print("|");
                }
                System.out.print(" " + arr[i][j] + " ");

            }
            System.out.println();
        }

    }

    public static void printInitial(int[][] arr, int nN)
    {// prints the sudoku
        for (int i = 0; i < nN; i++)
        {
            if (i % 3 == 0 && i != 0)
            {
                System.out.println("----------|---------|----------");
            }
            // int count1 = 0;
            for (int j = 0; j < nN; j++)
            {

                if (j % 3 == 0)
                {
                    System.out.print("|");
                }
                if (arr[i][j] == 0)
                {
                    System.out.print(" " + "-" + " ");
                }
                else
                {
                    System.out.print(" " + arr[i][j] + " ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        int[][] board = { { 7, 0, 0, 0, 4, 0, 5, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 6 }, { 2, 5, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 4, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 4 }, { 0, 0, 4, 6, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 3, 0, 0, 8 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 7, 0, 0 }

        };
        printInitial(board, board.length);
        System.out.println();
        System.out.println(solve(board));
        System.out.println();

        solve(board);
        System.out.println("AFTER SOLVING : ");
        print(board, board.length);
        long end = System.currentTimeMillis();
        long elapsed = end - start;
        System.out.println("Time: " + elapsed + " ms");
    }

}
