import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    String place;
    long mobile;
    int id;
    static int idCounter = 1001;
    List<Invoice> invoices;

    public Customer(String name,String place,long mobile){
        this.name=name;
        this.place=place;
        this.mobile=mobile;
        this.id=idCounter++;
        invoices = new ArrayList<>();
    }

    void addInvoice(Invoice invoice){
        invoices.add(invoice);
    }

    void showInvoices(){
        for (Invoice invoice : invoices) {
            invoice.showInvoice();
        }
    }
}
