public class Client {
    public static void main(String[] args) {
        Iterget target = new Adapter(new Adaptee());
        target.clientRequest();
    }
    
}
