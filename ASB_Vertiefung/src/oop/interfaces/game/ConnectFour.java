package oop.interfaces.game;

import java.util.Scanner;

public class ConnectFour implements Game
{
    private static final int ROWS = 6;

    private static final int COLUMNS = 7;

    private static final int NUMBER_OF_PLAYERS = 2;

    private static final int UNDEFINED = NUMBER_OF_PLAYERS;

    private static String[] symbol = { "X", "O", " " };

    private int[][] board;

    private int[] fuelledColumn = new int[COLUMNS];

    private int next;

    private int winner;

    @Override
    public String getNameOfGame()
    {
        return "4 gewinnt";
    }

    @Override
    public int getMinNumberOfPlayers()
    {
        return NUMBER_OF_PLAYERS;
    }

    @Override
    public int getMaxNumberOfPlayers()
    {
        return NUMBER_OF_PLAYERS;
    }

    @Override
    public void initialize(int players)
    {
        if (players != NUMBER_OF_PLAYERS)
        {
            throw new IllegalArgumentException("Es dürfen genau " + NUMBER_OF_PLAYERS + " Personen teilnehmen.");
        }

        board = new int[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                board[i][j] = UNDEFINED;
            }
        }
        next = (int) Math.round(Math.random());
        winner = UNDEFINED;
    }

    @Override
    public String getBoard() throws NotInitializedException
    {
        if (board == null)
        {
            throw new NotInitializedException();
        }
        StringBuffer text = new StringBuffer();
        String line = "-".repeat(2 * COLUMNS + 1);
        text.append(line + "\n");
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                if (board[i][j] == 0)
                {
                    text.append("|" + symbol[1]);
                }
                else if (board[i][j] == 1)
                {
                    text.append("|" + symbol[0]);
                }
                else
                {
                    text.append("|" + symbol[2]);
                }
            }
            text.append("|\n");
            text.append(line + "\n");
        }
        return text.toString();
    }

    @Override
    public int getNextPlayer() throws NotInitializedException, GameFinishedException
    {
        if (board == null)
        {
            throw new NotInitializedException();
        }
        if (isFinished())
        {
            throw new GameFinishedException();
        }

        return next;

    }

    @Override
    public String getHintForInput()
    {
        return "Geben Sie die Nummer einer Spalte (1-7) eines noch freien Felds ein!\n" ;
    }

    @Override
    public void makeMove(int player, String input) throws NotInitializedException, GameFinishedException, WrongPlayerException, BadInputException
    {
        if (board == null)
        {
            throw new NotInitializedException();
        }
        if (isFinished())
        {
            throw new GameFinishedException();
        }
        if (player != next)
        {
            throw new WrongPlayerException();
        }
        Scanner scanner = new Scanner(input);

        try
        {

            int row;
            int column = scanner.nextInt() - 1;
            if (fuelledColumn[column] >= ROWS)
            {
                throw new BadInputException("Column is full!");
            }

            fuelledColumn[column]++;

            row = 6 - fuelledColumn[column];

            if (board[row][column] != UNDEFINED)
            {
                throw new BadInputException("Position schon belegt!");
            }

            board[row][column] = player;
            next = 1 - next; 

        }
        catch (Exception e)
        {
            throw new BadInputException("Beachten Sie die Hinweise!");
        }
        finally
        {
            scanner.close();
        }
    }

    @Override
    public boolean isFinished()
    {
        if (hasWinner())
        {
            return true;
        }
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                if (board[i][j] == UNDEFINED)
                {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean hasWinner()
    {
        boolean hasWinner = checkForWinner(0);
        if (hasWinner)
        {
            winner = 0;
            return true;
        }
        hasWinner = checkForWinner(1);
        if (hasWinner)
        {
            winner = 1;
            return true;
        }
        return false;
    }

    private boolean checkForWinner(int player)
    {
        boolean returnwert = false;

        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                if (checkColumns(i, j, player) || checkRows(i, j, player) || checkDiagonals(i, j, player))
                {
                    returnwert = true;
                }

            }
        }

        return returnwert;
    }

    public boolean checkColumns(int x, int y, int player)
    {
        boolean returnwert = false;

        if (y + 3 < board[x].length)
        {
            if (board[x][y] == player && board[x][y + 1] == player && board[x][y + 2] == player && board[x][y + 3] == player)
            {
                returnwert = true;
            }
        }
        return returnwert;
    }

    public boolean checkRows(int x, int y, int player)
    {
        boolean returnwert = false;
        if (x + 3 < board.length)
        {
            if (board[x][y] == player && board[x + 1][y] == player && board[x + 2][y] == player && board[x + 3][y] == player)
            {
                returnwert = true;
            }
        }
        return returnwert;
    }

    public boolean checkDiagonals(int x, int y, int player)
    {
        boolean returnwert = false;
        if (x + 3 < board.length && y + 3 < board.length)
        {
            if (board[x][y] == player && board[x + 1][y + 1] == player && board[x + 2][y + 2] == player && board[x + 3][y + 3] == player)
            {
                returnwert = true;
            }
        }

        if (x - 3 >= 0 && y + 3 < board.length)
        {
            if (board[x][y] == player && board[x - 1][y + 1] == player && board[x - 2][y + 2] == player && board[x - 3][y + 3] == player)
            {
                returnwert = true;
            }
        }

        return returnwert;
    }

    @Override
    public int getWinner() throws NoWinnerException
    {
        if (!hasWinner())
        {
            throw new NoWinnerException();
        }
        return winner;
    }

}
