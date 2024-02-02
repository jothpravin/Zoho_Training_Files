import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Train {
    String name;
    ArrayList<Coach> coaches;
    HashMap<Integer,ArrayList<Passenger>> pnrMap;
    ArrayDeque<Passenger> RACList;
    ArrayDeque<Passenger> wList;
    
    static int pnrg = 1234;
    int coachNo = 1;
    int berthNo = 1;
    int upperBerths = 0;
    int lowerBerths = 0;
    int middleBerths = 0;
    int racTickets = 0;
    int wlTickets = 0;
    Scanner in = new Scanner(System.in);

    Train(String name){
        this.name = name;
        pnrMap = new HashMap<>();
        RACList = new ArrayDeque<>();
        wList = new ArrayDeque<>();
        coaches = new ArrayList<>();
        coaches.add(new Coach());
    }

    void displayChart(){
        System.out.println("\nPNR  Berth No  Curr. Status  BerthType  Name\t Age");
        System.out.println("-----------------------------------------------------------");
        for(Coach coach : coaches) {
            for (Coach.Cabin cabin : coach.cabins) {
                for (Coach.Cabin.Berth berth : cabin.berths) {
                    if(berth.isAvailable()){
                        System.out.println("---   " + berth.number + "        AVL \t" + berth.type + "\t -----\t--" );
                    }
                    else{
                        System.out.println(berth.p.pnr + "  " + berth.number + "        CNF\t" + berth.type + "\t" + berth.p.name + "   " + berth.p.age);
                    }
                }
            }
        }
        for(Passenger p : wList){
            System.out.println(p.pnr+"  --   WL\t --- \t " + p.name +"  " + p.age);
        }
    }

    void displayPnrDetails(){}

    private void noPreferenceBooking(String name, int age, String preference){
        for(Coach coach : coaches) {
            for (Coach.Cabin cabin : coach.cabins) {
                for (Coach.Cabin.Berth berth : cabin.berths) {
                    if(berth.isAvailable() && berth.type != BerthType.RAC){
                        int pnrCopy = pnrg++;
                        Passenger pass = new Passenger(name,age,preference,berth, pnrCopy);
                        ArrayList<Passenger> pArrayList = new ArrayList<>();
                        pArrayList.add(pass);
                        pnrMap.put(pnrCopy,pArrayList);
                        berth.status = false;
                        berth.p = pass;
                        if(berth.type == BerthType.LB){
                            lowerBerths--;
                        }
                        else if(berth.type == BerthType.MB){
                            middleBerths--;
                        }
                        else{
                            upperBerths--;
                        }
                        return;
                    }
                }
            }
        }
    }

    boolean bookTicket(String name, int age, String preference){
        if((upperBerths+lowerBerths+middleBerths)<=0){
            System.out.println("NO TICKETS AVAILABLE!");
            boolean cont = false;
            System.out.println("\nDo you want to continue?(y/n) :");
            if(in.nextLine().charAt(0) == 'y'){
                cont =true;
            }
            if(!cont) return false;
            if(racTickets > 0){
                bookRAC(name, age, preference);
                return true;
            }
            else{
                System.out.println("NO RAC TICKETS AVAILABLE!");
                boolean conti = false;
                System.out.println("\nDo you want to continue?(y/n) :");
                if(in.nextLine().charAt(0) == 'y'){
                    conti =true;
                }
                if(!conti) return false;
                if(wlTickets > 0){
                    bookWaitList(name, age, preference);
                    return true;
                }
                else{
                    System.out.println("SORRY! WAITING LIST FILLED");
                    return false;
                }
            }
        }
        else{
            return bookConfirmTicket(name, age, preference);
        }
    }

    private void bookWaitList(String name2, int age, String preference) {
        int pnrCopy = pnrg++;
        Passenger pass = new Passenger(name2,age,preference,null, pnrCopy);
        ArrayList<Passenger> pArrayList = new ArrayList<>();
        pArrayList.add(pass);
        pnrMap.put(pnrCopy,pArrayList);
        wList.add(pass);
        wlTickets--;
    }

    private void bookRAC(String name2, int age, String preference) {
        racTickets--;
        for(Coach coach : coaches) {
            for (Coach.Cabin cabin : coach.cabins) {
                for (Coach.Cabin.Berth berth : cabin.berths) {
                    if(berth.isAvailable() && berth.type == BerthType.RAC){
                        int pnrCopy = pnrg++;
                        Passenger pass = new Passenger(name2,age,preference,berth, pnrCopy);
                        ArrayList<Passenger> pArrayList = new ArrayList<>();
                        pArrayList.add(pass);
                        pnrMap.put(pnrCopy,pArrayList);
                        berth.status = false;
                        berth.p = pass;
                        RACList.add(pass);
                        return;
                    }
                }
            }
        }
    }

    boolean bookConfirmTicket(String name, int age, String preference){
        System.out.println(name);
        if(preference.equals("NO")){
            noPreferenceBooking(name, age, preference);
            return true;
        }
        else{
            if(preference.equals("UPPER")){
                if(upperBerths <= 0){
                    System.out.println("Upper Berth Not Available!");
                }
                else{
                    bookUpperBerth(name, age, preference);
                    return true;
                }
            }
            else if(preference.equals("MIDDLE")){
                if(middleBerths <= 0){
                    System.out.println("Middle Berth Not Available!");
                }
                else{
                    bookMiddleBerth(name, age, preference);
                    return true;
                }
            }
            else{
                if(lowerBerths <= 0){
                    System.out.println("Lower Berth Not Available!");
                }
                else{
                    bookLowerBerth(name, age, preference);
                    return true;
                }
            }   
        }
        boolean cont = false;
        System.out.println("Prefered Berth Not Available!");
        System.out.println("Do you want to continue?(y/n) :");
        if(in.nextLine().charAt(0) == 'y'){
            cont =true;
        }
        if(cont){
            noPreferenceBooking(name, age, preference);
            return true;
        }
        return false;
    }

    private void bookMiddleBerth(String name2, int age, String preference) {
        middleBerths--;
        for(Coach coach : coaches) {
            for (Coach.Cabin cabin : coach.cabins) {
                for (Coach.Cabin.Berth berth : cabin.berths) {
                    if(berth.isAvailable() && berth.type == BerthType.MB){
                        int pnrCopy = pnrg++;
                        Passenger pass = new Passenger(name2,age,preference,berth, pnrCopy);
                        ArrayList<Passenger> pArrayList = new ArrayList<>();
                        pArrayList.add(pass);
                        pnrMap.put(pnrCopy,pArrayList);
                        berth.status = false;
                        berth.p = pass;
                        return;
                    }
                }
            }
        }
    }

    private void bookLowerBerth(String name2, int age, String preference) {
        lowerBerths--;
        for(Coach coach : coaches) {
            for (Coach.Cabin cabin : coach.cabins) {
                for (Coach.Cabin.Berth berth : cabin.berths) {
                    if(berth.isAvailable() && berth.type == BerthType.LB){
                        int pnrCopy = pnrg++;
                        Passenger pass = new Passenger(name2,age,preference,berth, pnrCopy);
                        ArrayList<Passenger> pArrayList = new ArrayList<>();
                        pArrayList.add(pass);
                        pnrMap.put(pnrCopy,pArrayList);
                        berth.status = false;
                        berth.p = pass;
                        return;
                    }
                }
            }
        }
    }

    private void bookUpperBerth(String name2, int age, String preference) {
        upperBerths--;
        for(Coach coach : coaches) {
            for (Coach.Cabin cabin : coach.cabins) {
                for (Coach.Cabin.Berth berth : cabin.berths) {
                    if(berth.isAvailable() && (berth.type == BerthType.UB || berth.type == BerthType.SU)){
                        int pnrCopy = pnrg++;
                        Passenger pass = new Passenger(name2,age,preference,berth, pnrCopy);
                        ArrayList<Passenger> pArrayList = new ArrayList<>();
                        pArrayList.add(pass);
                        pnrMap.put(pnrCopy,pArrayList);
                        berth.status = false;
                        berth.p = pass;
                        return;
                    }
                }
            }
        }
    }

    class Coach{
        int number;
        ArrayList<Cabin> cabins;

        Coach(){
            number = coachNo++;
            cabins = new ArrayList<>();
            cabins.add(new Cabin());
            //cabins.add(new Cabin());
        }

        class Cabin{
            ArrayList<Berth> berths;

            Cabin(){
                berths = new ArrayList<>();
                berths.add(new Berth(berthNo++, BerthType.UB));
                berths.add(new Berth(berthNo++, BerthType.MB));
                berths.add(new Berth(berthNo++, BerthType.LB));
                // berths.add(new Berth(berthNo++, BerthType.UB));
                // berths.add(new Berth(berthNo++, BerthType.MB));
                // berths.add(new Berth(berthNo++, BerthType.LB));
                berths.add(new Berth(berthNo++, BerthType.SU));
                berths.add(new Berth(berthNo, BerthType.RAC));
                berths.add(new Berth(berthNo++, BerthType.RAC));
                // upperBerths += 3;
                // middleBerths += 2;
                // lowerBerths += 2;
                upperBerths += 2;
                middleBerths += 1;
                lowerBerths += 1;

                racTickets += 2;
                wlTickets += 1;
            }

            class Berth{
                int number;
                boolean status;
                BerthType type;
                Passenger p;

                public Berth(int number, BerthType berthType) {
                    this.number = number;
                    type = berthType;
                    status = true;
                    p = null;
                }

                public boolean isAvailable(){
                    return status;
                }
            }
        }
    }
}
