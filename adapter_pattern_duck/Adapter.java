public class Adapter implements Duck {
    Turkey turkey;
    public Adapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        for( int i = 0; i<4;i++){
            turkey.fly_5();
        }
        
    }

    @Override
    public void qucak() {
        // TODO Auto-generated method stub
        turkey.gobble();
        
    }
    
}
