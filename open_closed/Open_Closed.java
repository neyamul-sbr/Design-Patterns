abstract class OrderReport{
    String customer;
    int total;
    OrderReport(String customer, int total){
        this.customer = customer;
        this.total = total;
    }
    abstract void print_out();
}
class Invoice extends OrderReport{

    String customer;
    int total;
    Invoice(String customer, int total) {
        super(customer, total);
        //TODO Auto-generated constructor stub
        this.customer=customer;
        this.total = total;
    }
    public void print_out(){
        System.out.println("Invoice \n"+customer+"\n" + total);
    }

}

class BillOfLading extends OrderReport{

    String address,customer;
    int total;
    BillOfLading(String address,String customer, int total) {
        super(customer, total);
        this.address = address;
        this.customer =customer;
        this.total=total;
        //TODO Auto-generated constructor stub
    }
    public void print_out(){
        System.out.println("Bill of Landing \n"+customer+"\n" + total +"\n"+ address);
    }
    
}
class Open_Closed{
    public static void main(String[] args) {
        Invoice I = new Invoice("Sbr",2000);
        I.print_out();
        BillOfLading B = new BillOfLading("USA", "sbr", 5000);
        B.print_out();
    }
}