import java.util.HashMap;
import java.util.Scanner;

public class App {
    private int mapSize;
    static Scanner in = new Scanner(System.in);
    Position[][] map;
    HashMap<String,Position> positionMap = new HashMap<>();
    int brickc = 0;
    int villc = 0;
    Key key;
    Player player;
    int a,b;
    Bomb[] bombs = new Bomb[1];
    Position prevoius;
    boolean power2;

    public static void main(String[] args) throws Exception{
        App game = new App();
        game.construct();
        game.show();
        game.getObstacles();
        game.show();
        game.getPowers();
        game.show();

        while(true){
            System.out.println();
            System.out.println("W -> Up");
            System.out.println("S -> Down");
            System.out.println("A -> Left");
            System.out.println("D -> Right");
            System.out.println("Q -> UpLeft");
            System.out.println("Z -> DownLeft");
            System.out.println("E -> UpRight");
            System.out.println("C -> DownRight");
            System.out.println("X -> Bomb");
            System.out.println("Enter your choice : ");
            char choice = in.nextLine().charAt(0);
            if(game.move(choice)){
                
            }
            game.show();
        }

    }

    
    private void getPowers() {
        for(int i=1 ; i<4 ; i++){
                System.out.println("Enter position for power "+ i +" :");
                while(true){
                    String pos = in.nextLine();
                    Position p = positionMap.get(pos);
                    if(p == null){
                        System.out.println("Wrong Input! Try Again.");
                    }
                    else{
                        if(p.hasCharacter() || p.power!=0){
                            System.out.println("Position occupied");
                            continue;
                        }
                        p.power = i;
                        break;
                    }
                }

        }
    }

    private void bombChoice(){
        System.out.println("\n1 -> Plant Bomb \n2 -> Detonate Bomb \n3.Cancel");
            char choice = in.nextLine().charAt(0);
            if(choice == '1'){
                plantBomb();
            }
            else if(choice == '2'){
                detonate();
            }
    }

    private void detonate() {
        for(int i=0 ; i<bombs.length ; i++){
            if(bombs[i] == null){
                System.out.println("No Bombs planted!");
            }
            else{
                getPosition(bombs[i]);
                blast(a, b);
                for(int j=1  ; j<=Bomb.range ; j++){
                    blast(a,b+j);
                    blast(a,b-j);
                    blast(a+j, b);
                    blast(a-j, b);
                    if(power2){
                        blast(a+j, b-j);
                        blast(a-j, b-j);
                        blast(a+j, b+j);
                        blast(a-j, b+j);
                    }
                }
                bombs[i].p.bombPlanted = false;
                bombs[i] = null;

            }
        }
    }

    void blast(int i, int j){
        if(i>=0 && j>=0 && i<mapSize && j<mapSize){
            Position p = map[i][j];
            if(p.hasCharacter()){
                if(p.character instanceof Brick || p.character instanceof Villian){
                    p.character = null;
                }
                else if(p.character instanceof Player){
                    System.out.println("Wasted!");
                    System.exit(0);
                }
            }
        }
    }

    private void plantBomb() {
        for(int i=0 ; i<bombs.length ; i++){
            if(bombs[i] == null){
                bombs[i] = new Bomb(player.p);
                player.p.bombPlanted = true;
                return;
            }
        }
        System.out.println("Bombs count exceeded!");
    }

    private boolean move(char a){
        switch(a){
            case 'W':return moveToPosition(-1, 0);
            case 'S':return moveToPosition(1, 0);
            case 'A':return moveToPosition(0, -1);
            case 'D':return moveToPosition(0, 1);
            case 'Q':return moveToPosition(-1, -1);
            case 'Z':return moveToPosition(1, -1);
            case 'E':return moveToPosition(-1, 1);
            case 'C':return moveToPosition(1, 1);
            case 'X':bombChoice(); return false;
            default:
                System.out.println("Wrong Input!");
                return false;
        }
    }

    private boolean moveToPosition(int r, int c) {
        getPosition(player);
        Position p = map[a+r][b+c];
        if(p.hasCharacter() || p.bombPlanted){
            if(p.character instanceof Key){
                System.out.println("Congratulations, You Won!");
                System.exit(0);
            }
            if(p.character instanceof Villian){
                System.out.println("Oops, You Lost!");
                System.exit(0);
            }
            System.out.println("Cannot move! Postion Occupied.");
            return false;
        }
        if(p.power != 0){
            if(p.power == 1){
                Bomb.range++;
            }
            else if(p.power == 2){
                power2 = true;
            }
            else{
                Bomb[] arr = bombs;
                bombs = new Bomb[arr.length+1];
                for(int i=0 ; i<arr.length ; i++){
                    bombs[i] = arr[i];
                }
            }
            p.power = 0;
        }
        player.changePosition(p);
        System.out.println("Player moved!");
        return true;
    }
    
    void getPosition(Characters charas){
        prevoius = charas.p;
        String s = prevoius.getName();
        a = s.charAt(0)-'A';
        b = s.charAt(1)-'A';
    }


    private void getPlayer(){
        System.out.println("Enter the position of Player :");
        while(true){
            String pos = in.nextLine();
            Position p = positionMap.get(pos);
            if(p == null){
                System.out.println("Wrong Input! Try Again.");
            }
            else{
                if(p.hasCharacter()){
                    System.out.println("Position occupied");
                    continue;
                }
                player = new Player(p);
                p.character = player;
                break;
            }
        }
    }


    private void getKey(){
       System.out.println("Enter the position of Key :");
        while(true){
            String pos = in.nextLine();
            Position p = positionMap.get(pos);
            if(p == null){
                System.out.println("Wrong Input! Try Again.");
            }
            else{
                if(p.hasCharacter()){
                    System.out.println("Position occupied");
                    continue;
                }
                p.character = new Key(p);
                break;
            }
        }
    }


    private void getObstacles() {
        System.out.println("Enter no of Bricks :");
        brickc = in.nextInt();
        getBricks();
        show();
        System.out.println("Enter no of Villians :");
        villc = in.nextInt();
        getVillians();
        show();
        getKey();
        show();
        getPlayer();
    }


    private void getVillians() {
        in.nextLine();
        int t = villc;
        while(t != 0){
            System.out.println("Enter the position :");
            String pos = in.nextLine();
            Position p = positionMap.get(pos);
            if(p == null){
                System.out.println("Wrong Input! Try Again.");
            }
            else{
                if(p.hasCharacter()){
                    System.out.println("Position occupied");
                    continue;
                }
                p.character = new Villian(p);
                System.out.println("Villian Added!");
                t--;
            }
        }
    }


    private void getBricks() {
        in.nextLine();
        int t = brickc;
        while(t != 0){
            System.out.println("Enter the position :");
            String pos = in.nextLine();
            Position p = positionMap.get(pos);
            if(p == null){
                System.out.println("Wrong Input! Try Again.");
            }
            else{
                if(p.hasCharacter()){
                    System.out.println("Position occupied");
                    continue;
                }
                p.character = new Brick(p);
                System.out.println("Brick Added!");
                t--;
            }
        }
    }


    private void construct() {
        System.out.println("Enter map size (size should be odd and <26) :");
        mapSize = in.nextInt();
        while(!checkSize()){
            System.out.println("Wrong Input! Try Again");
            mapSize = in.nextInt();
        } 
        map = new Position[mapSize][mapSize];
        for(int i=0 ; i<mapSize ; i++){
            for(int j=0 ; j<mapSize ; j++){
                String name = (char)(i+65) + "" + (char)(j+65);
                if(i == 0 || j==0 || i == mapSize-1 || j == mapSize-1 || (i%2==0 && j%2==0)){
                    Wall wall = new Wall();
                    map[i][j] = new Position(name,wall);
                }
                else{
                    map[i][j] = new Position(name);
                }
                positionMap.put(name, map[i][j]);
            }
        }
    }


    boolean checkSize(){
        if(mapSize >26 || mapSize%2==0)
            return false;
        return true;
    }


    void show(){
        System.out.println();
        System.out.print("  ");
        for(int i=0 ; i<mapSize ; i++){
            System.out.print((char)(i+65) + " ");
        }
        System.out.println();
        for(int i=0 ; i<mapSize ; i++){
            System.out.print((char)(i+65) + " ");
            for(int j=0 ; j<mapSize ; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//1 2 3 4 5 6 7