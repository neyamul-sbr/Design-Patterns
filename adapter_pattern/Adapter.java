public class Adapter implements Iterget{
    Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public void clientRequest(){
        adaptee.specificRequest();
    }
}