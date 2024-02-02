import java.util.Scanner;

public class TicTacToe 
{
    public static void main(String[] args) 
    {
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
        char currentPlayer = 'X';
        boolean gameWon = false;

        while (true) 
        {
            displayBoard(board);
            int[] move = getPlayerMove(currentPlayer);
            int row = move[0];
            int col = move[1];

            if (isValidMove(board, row, col)) 
            {
                board[row][col] = currentPlayer;
                gameWon = checkWin(board, currentPlayer);
                if (gameWon) 
                {
                	  displayBoard(board);
                    System.out.println(currentPlayer + " wins!");
                    break;
                } 
                else if (isBoardFull(board)) 
                {
                    displayBoard(board);
                    System.out.println("It's a tie!");
                    break;
                }

                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } 
            else 
            {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    public static void displayBoard(char[][] board) 
    {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] getPlayerMove(char player) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player " + player + ", enter your move (row and column): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[] {row, col};
    }

    public static boolean isValidMove(char[][] board, int row, int col) 
    {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    public static boolean checkWin(char[][] board, char player) 
    {
        for (int i = 0; i < 3; i++) 
        {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) 
            {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) 
            {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) 
        {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) 
        {
            return true;
        }

        return false;
    }

    public static boolean isBoardFull(char[][] board) 
    {
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (board[i][j] == '-') 
                {
                    return false;
                }
            }
        }
        return true;
    }
}

