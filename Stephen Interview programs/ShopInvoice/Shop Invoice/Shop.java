import java.util.ArrayList;
import java.util.List;

public class Shop {
    String name;
    String place;
    List<Customer> customers;
    List<Invoice> invoices;
    List<Product> products;

    public Shop(String name, String place){
        this.name=name;
        this.place=place;
        invoices = new ArrayList<>();
        products = new ArrayList<>();
        customers = new ArrayList<>();
    }

    void addProduct(Product product){
        products.add(product);
    }

    void addInvoice(Invoice invoice){
        invoices.add(invoice);
    }

    void addCustomer(Customer customer){
        customers.add(customer);
    }

    Invoice getInvoice(int iid){
        for(Invoice i : invoices){
            if(i.id == iid){
                return i;
            }
        }
        return null;
    }

    Customer getCustomer(long mobile){
        for(Customer c : customers){
            if(c.mobile == mobile){
                return c;
            }
        }
        return null;
    }
}
