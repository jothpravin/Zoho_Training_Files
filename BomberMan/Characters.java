public abstract class Characters {
    char rep;
    Position p;
    
    Characters(char rep, Position p){
        this.rep = rep;
        this.p = p;
    }

    public String toString(){
        return rep+"";
    }
}
