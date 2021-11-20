public class Mocha extends Decorator{

    Beverage beverage;

    public Mocha(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return this.beverage.getDescription()+"-Mocha-";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return this.beverage.cost()+1.05;
    }


}
