public class produto{
    String name;
    int quantity;
    double price;
    
    public produto(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
     public produto(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }
     public int getQuantity() {
         return quantity;
     }
     public double getPrice() {
         return price;
     }
     
    public void setName(String name) {
        this.name = name;
    }
     public void setQuantity(int quantity) {
         this.quantity = quantity;
     }
     public void setPrice(double price) {
         this.price = price;
     }
    public double totalValueinStock(){
        return price*quantity;
    }
    public void addQuantity(int quantity){
        this.quantity = quantity;
    }
    public void removeproduts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
        + ", $ "
        + String.format("%.2f",price)
        +", "
        + quantity
        +" unitys, total: $"
        +totalValueinStock();
    }
    public produto() {
    }
}