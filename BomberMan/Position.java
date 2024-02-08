public class Position {
    private String name;
    Characters character;
    boolean bombPlanted;
    int power;

    Position(String namString){
        name = namString;
        character = null;
    }

    Position(String namString,Characters c){
        name = namString;
        character = c;
        c.p = this;
    }

    boolean hasCharacter(){
        return character != null;
    }

    public String getName(){
        return name;
    }
    
    public String toString(){
        if(hasCharacter())
            return character+"";
        if(power != 0) return power+"";
        if(bombPlanted) return "X";
        return " "; 
    }
}
