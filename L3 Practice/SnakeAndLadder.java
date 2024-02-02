import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class SnakeAndLadder
{
	public static void main(String []args)
	{
		Game game = new Game();
		game.addPlayer(new Player("pravin"));
		game.addPlayer(new Player("jai"));
		game.addPlayer(new Player("jaya"));
		game.addPlayer(new Player("meena"));
		game.start();
	}
}

class Game
{
	Board board;
	List<Player> players;
	
	Game()
	{
		board = new Board(100);
		players = new ArrayList<>();
	}
	
	boolean isGameEnd = false;
	Dice dice = new Dice(6); 
	
	void addPlayer(Player player)
	{
		players.add(player);
	}
	
	void start()
	{
		while(!isGameEnd)
		{
			for(Player player : players)
			{
				int num = dice.rollDice();
				isGameEnd = player.move(board, num);
				if(isGameEnd)
				{
					System.out.println("Player " + player.name +" won");
					break;
				}
			}
		}
	}
	
}

class Dice
{
	int max;
	Dice(int max)
	{
		this.max = max;
	}
	
	int rollDice()
	{
		Random r = new Random();
		return (1+r.nextInt(max));
	}
}

class Board
{
	Cell []cells;
	int boardSize;
	
	Board(int size)
	{
		this.boardSize = size;
		cells = new Cell[boardSize+1];
		initializer();
	}
	
	void initializer()
	{
		for(int i=1; i<boardSize; i++)
		{
			cells[i] = new Cell(i, i, CellType.NORMAL);
		}
		
		cells[boardSize] = new Cell(boardSize, boardSize, CellType.TARGET);
		
		//add Snakes
		addSnake(new Snake(50, 10));
		addSnake(new Snake(30, 5));
		addSnake(new Snake(20, 1));
		
		//add Ladders
		addLadder(new Ladder(1, 100));
		addLadder(new Ladder(2, 33));
		addLadder(new Ladder(5, 45));
		addLadder(new Ladder(10, 65));
	}
	
	void addSnake(Snake snake)
	{
		cells[snake.start] = snake;
	}
	
	void addLadder(Ladder ladder)
	{
		cells[ladder.start] = ladder;
	}
	
	Cell get(int position)
	{
		return cells[position];
	}
}

class Cell
{
	int start;
	int end;
	CellType type;
	
	Cell(int start, int end, CellType type)
	{
		this.start = start;
		this.end = end;
		this.type = type;
	}
}

class Snake extends Cell
{
	Snake(int start, int end)
	{
		super(start, end, CellType.SNAKE);
	}
}

class Ladder extends Cell
{
	Ladder(int start, int end)
	{
		super(start, end, CellType.LADDER);
	}
}

enum CellType
{
	NORMAL,
	SNAKE,
	LADDER,
	TARGET;
}

class Player
{
	String name;
	int position;
	Player(String name)
	{
		this.name = name;
		position = 0;
	}
	
	boolean move(Board board, int number)
	{
		int newPosition = position + number;
		if(newPosition <= board.boardSize)
            	System.out.println("Player "+name + " Move to "+newPosition);
      	else
       	     System.out.println("Player "+name + " Move to "+newPosition+" But it is invalid");
            
		
		if(newPosition > board.boardSize)
		{
			return false;
		}
		Cell c = board.get(newPosition);
		
		if(c.type == CellType.TARGET)
		{
			return true;
		}
		else if(c.type == CellType.SNAKE || c.type == CellType.LADDER)
		{
			this.position = c.end;
			c = board.get(position);
		      if(position > newPosition)
		          System.out.println("Player "+name + " Climbed the ladder Move to "+position);
		      else
		          System.out.println("Player "+name + " Bitten by snake Move to "+position);
		          
		      if(position > board.boardSize)
		          return false;
		      if(c.type == CellType.TARGET)
		      {
		          return true;
		      }
		}	
		else
		{
			this.position = newPosition;
		}
		return false;
	}
	
}

