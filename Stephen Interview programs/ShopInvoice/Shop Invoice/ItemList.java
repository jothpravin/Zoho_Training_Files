public class ItemList {
    String name;
    int nos;
    double unitPrice;
    double amount;
    
    public ItemList(String name, double unitPrice, int nos) {
        this.name = name;
        this.nos = nos;
        this.unitPrice = unitPrice;
        this.amount=unitPrice*nos;
    }
}
