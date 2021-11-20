public class CoffeHouse {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("Description: "+ beverage.getDescription()+ " Cost: "+ beverage.cost() );
        beverage = new Mocha(new Milk(new Mocha(beverage)));
        System.out.println("Description: "+ beverage.getDescription()+ "Cost: "+ beverage.cost() );
    }
}
