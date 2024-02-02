import java.util.Scanner;

public class TicTacToe
{
	public static void main(String []args)
	{
		char board[][] = {
			{'-','-','-'},
			{'-','-','-'},
			{'-','-','-'},
		};
		char currentPlayer = 'X';
		printBoard(board);
			
		while(true)
		{
			int [] move = getPalyerMove(currentPlayer);
			int row = move[0];
			int col = move[1];
			if(isValidMove(row, col, board))
			{
				board[row][col] = currentPlayer;
				if(checkWin(board, currentPlayer))
				{
					printBoard(board);
					System.out.println(currentPlayer+" Won the game!!");
					System.exit(0);
				}
				else if(isBoardFull(board))
				{
					printBoard(board);
					System.out.println("The game is tied...!");
					System.exit(0);
				}
				printBoard(board);
				currentPlayer = currentPlayer == 'X' ? '0' : 'X';
			}
			else
			{
				System.out.println("Invalid Move.....");
				System.out.println("Try Again");
			}
		}
	}
	
	public static int[] getPalyerMove(char currentPlayer)
	{
		int [] move = new int[2];
		Scanner in = new Scanner(System.in);
		System.out.println(currentPlayer+"'s turn.");
		System.out.print("Enter row and column between 0 to 2:");
		move[0] = in.nextInt();
		move[1] = in.nextInt();
		
		return move;
	}
	
	public static boolean isValidMove(int row, int col,char[][] board)
	{
		return (row<3 && row>=0 && col<3 && col>=0 && board[row][col]=='-');
	}
	
	public static boolean checkWin(char [][]board, char currentPlayer)
	{
		for(int i=0; i<board.length; i++)
		{
			if(board[i][0]==currentPlayer && board[i][1]==currentPlayer && board[i][2]==currentPlayer) return true;
			
			if(board[0][i]==currentPlayer && board[1][i]==currentPlayer && board[2][i]==currentPlayer) return true;
		}
		
		if(board[2][2]==currentPlayer && board[1][1]==currentPlayer && board[0][0]==currentPlayer) return true;
		
		if(board[0][2]==currentPlayer && board[1][1]==currentPlayer && board[2][0]==currentPlayer) return true;
		
		return false;
	}
	
	public static void printBoard(char[][] board)
	{
		System.out.println("  0 1 2");
		for(int i=0; i<3; i++)
		{
			System.out.print(i+" ");
			for(int j=0; j<3; j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static boolean isBoardFull(char [][]board)
	{
		for(char []r : board)
		{
			for(char c : r)
			{
				if(c == '-')
				{
					return false;
				}
			}
		}
		return true;
	}
}
