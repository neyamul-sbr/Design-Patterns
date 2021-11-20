public class Invoker {
    Command button1Command;
    Command button2Command;
     
    public Invoker(Command button1Command, Command button2Command)
    {
        this.button1Command = button1Command;
        this.button2Command = button2Command;
    }


    public void executeButton1(){
        button1Command.execute();
    }
    public void executeButton2(){
        button2Command.execute();
    }

}
