public class Milk extends Decorator {

    Beverage beverage;
    public Milk(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription()+"-Milk-";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return this.beverage.cost()+0.99;
    }
    
}
