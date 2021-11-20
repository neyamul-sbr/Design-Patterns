public class FanOnCommand implements Command {
    Fan fan;
    public FanOnCommand(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        this.fan.on();
        
    }

    @Override
    public void unexecute() {
        // TODO Auto-generated method stub
        this.fan.off();
    }
    
}
