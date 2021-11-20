public class DvdPlayerObj implements DvdPlayer {

    @Override
    public void on() {
        // TODO Auto-generated method stub
        System.out.println("DVD player is on");
        
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        System.out.println("DVD player is off");
        
    }

    @Override
    public void play(String S) {
        // TODO Auto-generated method stub
        System.out.println(S+ " Is playing now!!!");
        
    }
    
}
