public class Player extends Characters {
    Player(Position p){
        super('P', p);
    }

    void changePosition(Position p){
        super.p.character = null;
        super.p = p;
        p.character = this;
    }
}
