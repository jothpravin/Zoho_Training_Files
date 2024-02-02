import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Shop myShop = new Shop("Stephen Stores","Sivakasi");
        
        myShop.addProduct( new Product("Kurkure", 5));
        myShop.addProduct( new Product("Nabati ", 10));
        myShop.addProduct( new Product("Eclairs", 1));
        myShop.addProduct( new Product("Parle-G", 3));
        do {
            System.out.println("\n1 -> Add Products to Shop\n2 -> Prepare Invoice \n3 -> Get Invoice with Id \n4 -> Invoices of one customer \nANY NUMBER TO EXIT \nEnter your choice:");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter the product name : ");
                    String product = in.nextLine();
                    System.out.println("Enter the price : ");
                    int price = in.nextInt();
                    myShop.addProduct(new Product(product, price));
                    break;

                case 2:
                    Customer customer;
                    System.out.println("\nEnter Customer name, place and mobile number: ");
                    String name = in.nextLine();
                    String place = in.nextLine();
                    long mobile = in.nextLong();
                    customer = myShop.getCustomer(mobile);
                    if(customer == null){
                        customer = new Customer(name, place,mobile);
                        myShop.addCustomer(customer);
                    }
                    List<ItemList> itemLists = new ArrayList<>();
                    System.out.println("\nProduct Details:");
                    for(int i=0; i<myShop.products.size() ; i++){
                        System.out.println(i+1 + " -> "+myShop.products.get(i).product+ " - " + myShop.products.get(i).price);
                    }
                    System.out.println("ANY NUMBER TO STOP ");
                    while(true){
                        System.out.println("\nEnter Item number to shop : ");
                        int id = in.nextInt() - 1;
                        if( id < 0 || id >= myShop.products.size()){
                            break;
                        }
                        else{
                            System.out.println("Enter no of "+ myShop.products.get(id).product +" : ");
                            int nos = in.nextInt();
                            itemLists.add(new ItemList(myShop.products.get(id).product, myShop.products.get(id).price, nos));
                        }
                    }
                    Invoice invoice = new Invoice(myShop, customer, itemLists);
                    myShop.addInvoice(invoice);
                    customer.addInvoice(invoice);
                    invoice.showInvoice();
                    break;

                case 3:
                    System.out.println("\nEnter the Id to get Invoice:");
                    int iid = in.nextInt();
                    Invoice invoice2 = myShop.getInvoice(iid);
                    if(invoice2 == null)
                        System.out.println("The Invoice id is not valid");
                    else
                        invoice2.showInvoice();
                    break;
                
                case 4:
                    System.out.println("\nEnter the moblie of the customer:");
                    long phone = in.nextLong();
                    Customer c = myShop.getCustomer(phone);
                    if(c == null)
                        System.out.println("The Mobile no is wrong or the customer doesn't exist!");
                    else{
                        System.out.println("The Customer "+c.name+" has "+c.invoices.size()+" invoices.");
                        c.showInvoices();
                    }
                    break;
            
                default:
                    System.exit(0);

            }
        } while (true);
    }
}
