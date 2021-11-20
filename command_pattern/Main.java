public class Main {
    public static void main(String[] args) {
        FanOnCommand fan1 = new FanOnCommand(new Fan());
        LightOnCommand light1 = new LightOnCommand(new Light());

        Invoker I1 = new Invoker(fan1, light1);
        I1.executeButton1();
        I1.executeButton2();
        System.out.println("\nLet's swap Commands for buttons\n");
      
        Invoker I2 = new Invoker(light1, fan1);
        I2.executeButton1();
        I2.executeButton2();
    }
}
