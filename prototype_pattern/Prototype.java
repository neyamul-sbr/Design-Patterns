interface Villain_Clone{
    Villain villain_clone();
}
abstract class Villain implements Villain_Clone{
    abstract void attackProtagonist();

}

class Villaintype1 extends Villain{

    private int hp , mp;

    Villaintype1(int hp,int mp){
        this.hp = hp;
        this.mp = mp;
    }

    @Override
    public Villain villain_clone() {
        // TODO Auto-generated method stub
        return new Villaintype1(hp, mp);
    }

    @Override
    void attackProtagonist() {
        // TODO Auto-generated method stub
        System.out.println("attacking protagonist");

    }

    public String toString(){
        String str = "{\n";
        str += "\thp: "+ this.hp +"\n";
        str += "\tmp: "+ this.mp +"\n";
        str +="}";

        return str;

    }

    
}
class Prototype{
    public static void main(String[] args) {
        
        Villain Villain_obj = new Villaintype1(50,60);
        System.out.println(Villain_obj);

        Villain V= Villain_obj.villain_clone();

        System.out.println(V);

    }
}