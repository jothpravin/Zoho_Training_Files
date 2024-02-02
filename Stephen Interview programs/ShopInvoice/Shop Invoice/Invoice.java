import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Invoice {
    int id;
    double tax;
    static int idCounter=10001;
    Shop shop;
    Customer customer;
    List<ItemList> ItemLists;
    double total;
    double grandTotal;
    Date date;

    public Invoice(Shop shop, Customer customer, List<ItemList> ItemLists){
        this.id=idCounter++;
        this.shop=shop;
        this.customer=customer;
        this.ItemLists=ItemLists;
        this.date=new Date();
        findTotal();
        calcTax();
    }

    void findTotal(){
        total=0;
        for(ItemList i : ItemLists){
            total+=i.amount;
        }
    }

    void calcTax(){
        tax=(total *5)/100;
        grandTotal=Math.round(total+tax);
    }

    public void showInvoice(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        System.out.println("\n\n-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                            INVOICE");
        System.out.println(shop.name+",                                                               Invoice Id : "+ id);
        System.out.println(shop.place+".                                                                          Date : "+ sdf.format(date));
        System.out.println("\nCustomer Details : ");
        System.out.println("    "+customer.name+",\n"+"    "+customer.place+".\n    "+ customer.mobile);
        System.out.println("\nS.no \t ItemLists \t Unit Price \t Qty \t Amount");
        System.out.println("----------------------------------------------------------");
        int n=1;
        for (ItemList ItemList : ItemLists) {
            System.out.println(n++ +" \t "+ ItemList.name +"\t "+ ItemList.unitPrice +" \t\t "+ ItemList.nos +" \t " + ItemList.amount);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("                                        Total :  "+total);
        System.out.println("                                      Tax(5%) :  "+tax);
        System.out.println("                                  Grand Total :  "+grandTotal );
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");   
    }
}
