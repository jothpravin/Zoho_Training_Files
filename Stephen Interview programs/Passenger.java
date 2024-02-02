public class Passenger {
    String name;
    int age;
    String preference;
    int number;
    Train.Coach.Cabin.Berth berth;
    int pnr;
    static int sno = 1;

    
    public Passenger(String name, int age, String preference ,Train.Coach.Cabin.Berth berth , int pnr) {
        this.name = name;
        this.age = age;
        this.preference = preference;
        this.berth =  berth;
        this.number = sno++;
        this.pnr = pnr;
    }
}
