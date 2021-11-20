public class Main {
    public static void main(String[] args) {
        Duck malladDuck = new MalladDuck();
        malladDuck.qucak();
        malladDuck.fly();

        Duck malladTurkey = new Adapter(new MalladTurkey());

        malladTurkey.fly();
        malladTurkey.qucak();
    }
}
