import java.util.*;
import java.io.*;
 
public class Main 
{
    public static void main(String[] arg) throws Exception
    {
        Game game = new Game();
        game.addPlayer(new Player("Jai"));
        game.addPlayer(new Player("Jaya"));
        game.addPlayer(new Player("Pravin"));
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
        players = new ArrayList<Player>();
    }
    void addPlayer(Player player)
    {
         players.add(player);
    }
    void start()
    {
        boolean isGameEnded = false;
        Dice dice = new Dice(6);
         
        //Simulate Game
        while(!isGameEnded)
        {
            for(Player player : players)
            {
                int newPosition = dice.rollDice();
                isGameEnded = player.move(board , newPosition);
                if(isGameEnded)
                {
                    System.out.println(player.name +" wins");
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
     
    //Get random number
    int rollDice()
    {
        Random rand = new Random();
        return 1+rand.nextInt(this.max);
    }
}
class Board
{
    int boardSize;
    Cell cells[];
    Board(int size)
    {
        boardSize = size;
        cells = new Cell[boardSize+1];
        initializeBoard();
    }
    void initializeBoard()
    {
        for(int i = 1; i<boardSize; i++)
        {
            cells[i] = new Cell(i,i,CellType.NORMAL);
        }
         
        cells[boardSize] = new Cell(boardSize,boardSize,CellType.TARGET);
         
         
        addSnake(new Snake(50,10));
        addSnake(new Snake(20,2));
        addSnake(new Snake(30,12));
        addSnake(new Snake(44,21));
        /*add snakes here*/
        addLadder(new Ladder(4,30));
        addLadder(new Ladder(2,100));
        addLadder(new Ladder(14,40));
        addLadder(new Ladder(42,60));
        addLadder(new Ladder(45,70));
        /*add ladders here*/
         
    }
    void addSnake(Snake snake)
    {
       //throw error if snake is out of cells range
        cells[snake.start] = snake;
    }
    void addLadder(Ladder ladder)
    {
        //throw error if ladder is out of cells range
        cells[ladder.start] = ladder;
    }
    Cell get(int position)
    {
        //Check range
        return cells[position];
    }
}
class Cell
{
    int start;
    int end;
    CellType type;
    Cell(int start,int end, CellType type)
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
        super(start,end,CellType.SNAKE);
    }
}
class Ladder extends Cell
{
    Ladder(int start,int end)
    {
        super(start, end, CellType.LADDER);
    }
}
enum CellType
{
    NORMAL,SNAKE,LADDER,TARGET;
}
class Player
{
    int position;
    String name;
    Player(String name)
    {
        this.name = name;
        position = 0;
    }
    boolean move(Board board, int number)
    {
        
        int newPosition = position+number;
        
        if(newPosition <= board.boardSize)
            System.out.println("Player "+name + " Move to "+newPosition);
        else
            System.out.println("Player "+name + " Move to "+newPosition+" But it is invalid");
            
        if(newPosition > board.boardSize)
            return false;
         
        Cell cell = board.get(newPosition);
        if(cell.type == CellType.TARGET)
        {
            return true;
        }
        else if(cell.type == CellType.SNAKE || cell.type == CellType.LADDER)
        {
            this.position = cell.end;
            cell = board.get(position);
            
            if(position > newPosition)
                System.out.println("Player "+name + " Climbed the ladder Move to "+position);
            else
                System.out.println("Player "+name + " Bitten by snake Move to "+position);
                
            if(cell.type == CellType.TARGET)
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
