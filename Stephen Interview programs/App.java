import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Zoho Railways");
        Train train = new Train("Zoho Express");
        train.bookTicket("name-1", 23, "UPPER");
        train.bookTicket("name-2", 23, "UPPER");
        train.bookTicket("name-3", 23, "LOWER");
        train.bookTicket("name-4", 23, "LOWER");
        train.bookTicket("name-5", 23, "MIDDLE");
        train.bookTicket("name-6", 23, "MIDDLE");
        train.bookTicket("name-7", 23, "UPPER");
        train.bookTicket("name-8", 23, "LOWER");
        
        while(true){
            System.out.println("\n1.Display Tickets \n2.Book Ticket \n3. \n4.");
            System.out.println("Enter your choice:");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    train.displayChart();
                    break;

                case 2:
                    bookTicket(train);
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;

                case 5:
                    
                    break;

                case 6:
                    
                    break;
            
                default:
                    break;
            }
        }
    }

    private static void bookTicket(Train t) {
        in.nextLine();
        System.out.println("Enter name :");
        String name = in.nextLine();
        System.out.println("Enter age :");
        int age = in.nextInt();
        String preference;
        if(age>60){
            preference = "LOWER";
        }
        else{
            preference = getPreference();
        }
        if(t.bookTicket(name, age, preference))
            System.out.println("Booked Successfully!");
        else
            System.out.println("Booking Failed!");
    }

    private static String getPreference() {
        System.out.println("\n1.Upper 2.Lower 3.Middle 4.No Preference");
        while(true){
            int ch = in.nextInt();
            switch(ch){
                case 1:
                    return "UPPER";
                case 2:
                    return "LOWER";
                case 3:
                    return "MIDDLE";
                case 4:
                    return "NO";
            }
        }
    }
}
