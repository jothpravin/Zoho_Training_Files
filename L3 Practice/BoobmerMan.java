import java.util.Scanner;

public class BoobmerMan
{
	static boolean bomb = false;
	static boolean blast = false;
    	static boolean flag = true;
	static Scanner in = new Scanner(System.in);
	public static boolean isValidMove(char[][] map, int row, int col)
	{
		if(map[row][col]==' ')
		{
			return true;
		}
		return false;
	}
	
	public static boolean isVillan(char[][] map, int row, int col)
	{
		if(map[row][col]=='V')
		{
			return true;
		}
		return false;
	}
	
	public static boolean isKey(char[][] map, int row, int col)
	{
		if(map[row][col]=='K')
		{
			return true;
		}
		return false;
	}
	
	public static int[] move(char t, int row, int col)
	{
		switch(t)
		{
			case 'W':
				return new int[]{row-1, col};
			case 'S':
				return new int[]{row+1, col};
			case 'A':
				return new int[]{row, col-1};
			case 'D':
				return new int[]{row, col+1};
			case 'Q':
				return new int[]{row-1, col-1};
			case 'Z':
				return new int[]{row+1, col-1};
			case 'E':
				return new int[]{row-1, col+1};
			case 'C':
				return new int[]{row+1, col+1};
		}
		return null;
	}
	
	public static char playerMove(char[][] map, int row, int col, char t)
	{
		int bkr = row;
		int bkc = col;
		
		switch(t)
		{
			case 'W':
				row = row-1;
				break;
			case 'S':
				row = row+1;
				break;
			case 'A':
				col = col-1;
				break;
			case 'D':
				col = col+1;
				break;
			case 'Q':
				row = row-1;
				col = col-1;
				break;
			case 'Z':
				row = row+1;
				col = col-1;
				break;
			case 'E':
				row = row-1;
				col = col+1;
				break;
			case 'C':
				row = row+1;
				col = col+1;
				break;
			case 'X':
				System.out.println("Enter 1 to Bomb\nEnter 2 to detonate");
				int num = in.nextInt();
				if(num==1)
				{
					bomb = true;
					System.out.print("Enter the Move :");
					char mv = in.next().charAt(0);
					mv = Character.toUpperCase(mv);
					int []ind = move(mv, bkr, bkc);
					int rowb = ind[0];
					int colb = ind[1];
					char res = ' ';
					if(!isVillan(map, rowb, colb))
					{
						if(isKey(map, rowb, colb))
						{
							res = 'K';
						}
						if(isValidMove(map, rowb, colb) && bomb)
						{
							map[rowb][colb] = 'P';
							map[bkr][bkc] = 'X';
							res = 'X';
						}
					}
					else
					{
						res = 'V';
					}
					return res;
									
				}
				else if(num==2)
				{	
					blastBomb(map);
					return 'N';
				}
				break;
		}
		
		char res = ' ';
		
		if(!isVillan(map, row, col))
		{
			if(isKey(map, row, col))
			{
				res = 'K';
			}
			if(isValidMove(map, row, col))
			{
				map[row][col] = 'P';
				map[bkr][bkc] = ' ';
				res = 'P';
			}
		}
		else
		{
			res = 'V';
		}
		return res;
		
	}
	
	public static boolean isBlast(char[][] map, int i, int j, char t)
	{
		boolean check = false;

		if (i > 0 && map[i - 1][j] == t) 
		{
			map[i - 1][j] = ' ';
			check = true;
		}
		if (i < map.length - 1 && map[i + 1][j] == t) 
		{
			map[i + 1][j] = ' ';
			check = true;
		}
		if (j > 0 && map[i][j - 1] == t) 
		{
			map[i][j - 1] = ' ';
			check = true;
		}
		if (j < map[0].length - 1 && map[i][j + 1] == t) 
		{
			map[i][j + 1] = ' ';
			check = true;
		}
		System.out.println("Boom Bomb Blasted");
		return check;
	}
	
	public static void blastBomb(char[][] map)
	{
		for(int i=1; i<map.length; i++)
		{
			for(int j=1; j<map[0].length; j++)
			{
				if(map[i][j] == 'X')
				{
					if(isBlast(map, i, j, 'P'))
					{
						System.out.println("Player died in Bomb");
						System.exit(0);
					}
					else
					{
						isBlast(map, i, j, 'V');
						isBlast(map, i, j, 'B');
					}
					if(map[i][j] != 'P')
					{	
						map[i][j] = ' ';
					}
					bomb = false;
					return;
				}
			}
		}
	}
	
	public static void print(char[][] map)
	{
		for(char[] row: map)
		{
			for(char col: row)
			{
				System.out.print(col+" ");
			}
		System.out.println();
		}
	}

	private static boolean setPlayer(char a, char b,char map[][])
	{
		int row = (int)(a-65)+1;
		int col = (int)(b-65)+1;

		if(map[row][col]==' ')
		{
			map[row][col] = 'P';
			return true;
		}
		return false;

	} 
	private static boolean setBrick(char a, char b,char map[][])
	{
		int row = (int)(a-65)+1;
		int col = (int)(b-65)+1;

		if(map[row][col]==' ')
		{
			map[row][col] = 'B';
			return true;
		}
		return false;

	}
	private static boolean setKey(char a, char b,char map[][])
	{
		int row = (int)(a-65)+1;
		int col = (int)(b-65)+1;

		if(map[row][col]==' ')
		{
			map[row][col] = 'K';
			return true;
		}
		return false;

	}
	private static boolean setVillan(char a, char b,char map[][])
	{
		int row = (int)(a-65)+1;
		int col = (int)(b-65)+1;

		if(map[row][col]==' ')
		{
			map[row][col] = 'V';
			return true;
		}
		return false;

	}
    
	private static void initializeMap(char [][]map, int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==0 && j!=0)
				{
					map[i][j] = (char)(j+64);
				}
				else if(j==0  && i!=0)
				{
					map[i][j] = (char)(i+64);
				}
				else if(i==1 || j==1)
				{
					map[i][j] = '*';
				}
				else if(i==n-1 || j==n-1)
				{
					map[i][j] = '*';
				}
				else
				{
					if(i%2!=0 && j%2!=0)
					{
						map[i][j] = '*';
					}
					else
					{
						map[i][j] = ' ';
					}
				}
			}
		}		
	}

    	
    	private static int[] currentPosition(char [][]map)
    	{
    		for(int i=1; i<map.length; i++)
		{
			for(int j=1; j<map[0].length; j++)
			{
				if(map[i][j] == 'P')
				{
					return new int[]{i, j};
				}
			}
		}
		return null;
    	}
    	
    	private static int[] villainPos(char [][]map)
    	{
    		for(int i=1; i<map.length; i++)
		{
			for(int j=1; j<map[0].length; j++)
			{
				if(map[i][j] == 'V')
				{
					return new int[]{i, j};
				}
			}
		}
		return null;
    	}
    	
    	private static void moveVillain(char [][]map)
    	{
    		int[] ind = villainPos(map);
    		
    		int row = ind[0];
    		int col = ind[1];
    		
    		int startc = col;
    		
    		if(startc<=map[0].length-2 && startc>1 && isValidMove(map, row, startc + 1))
    		{
    			if(flag)
    			{
    				startc++;
    				if(startc==map[0].length-2)
    				{
    					flag = false;
    				}
    			}
    			else
    			{
    				startc--;
				if(startc==2)
				{
					flag =true;
				}
    				
    			}
    			
    			map[row][startc] = 'V';
    			map[row][col] = ' ';
    			
    		}
    	}
    	
	public static void main(String[] args) 
	{
		System.out.print("Enter the size :");
		int n = in.nextInt();
		char [][]map = new char[n][n];

		initializeMap(map, n);
		print(map);
		System.out.print("Enter the Player Start Position:");
		String startPos = in.next().toUpperCase();
		if(!setPlayer(startPos.charAt(0), startPos.charAt(1), map))
		{
			System.out.println("Invalid position");
			System.exit(0);
		}
		System.out.print("Enter the Key Position:");
		String keyPos = in.next().toUpperCase();
		if(!setKey(keyPos.charAt(0), keyPos.charAt(1), map))
		{
			System.out.println("Invalid position");
			System.exit(0);
		}
		System.out.print("Enter the count of Villans:");
		int c = in.nextInt();
		for(int i=0; i<c; i++)
		{
			System.out.print("V"+(i+1)+":");
			String setPos = in.next().toUpperCase();
			if(!setVillan(setPos.charAt(0), setPos.charAt(1), map))
			{
				System.out.println("Invalid position\nEnter correct position");
				i--;
			}
		}
		System.out.print("Enter the count of Bricks:");
		int b = in.nextInt();
		for(int i=0; i<b; i++)
		{
			System.out.print("B"+(i+1)+":");
			String setPos = in.next().toUpperCase();
			if(!setBrick(setPos.charAt(0), setPos.charAt(1), map))
			{
				System.out.println("Invalid position\n Enter correct position");
				i--;
			}
		}
		while(true)
		{
			print(map);
			System.out.print("Enter the Move :");
			char mv = in.next().charAt(0);
			mv = Character.toUpperCase(mv);
			int []startPoss = currentPosition(map);
			//System.out.println(startPoss[0]+" "+startPoss[1]);
			char r = playerMove(map, startPoss[0], startPoss[1], mv);
			moveVillain(map);
			if(r == 'V')
			{
				System.out.println("Player Dead\n");
				System.exit(0);
			}
			else if(r == 'K')
			{
				System.out.println("Player Won");
				System.exit(0);
			}
			else if(r == 'X')
			{
				System.out.println("Bomb Planted!!!!");
			}
			else if(r != ' ')
			{
				System.out.println("Player Moved");
			}
			else
			{
				System.out.println("Invalid Move");
			}
			 
		}
	}
}

