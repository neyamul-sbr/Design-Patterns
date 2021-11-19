
import java.util.*;

public class WeatherData implements Subject {
    private ArrayList<Observer1> observers;
    private float temperature;

    public WeatherData() {
       observers = new ArrayList<Observer1>();

    }

    @Override
    public void addObserver(Observer1 O) {
        // TODO Auto-generated method stub
        observers.add(O);
        
    }
    public float getTemp(){

        return temperature;
    }

    @Override
    public void removeObserver(Observer1 O) {
        // TODO Auto-generated method stub
        int i = observers.indexOf(O);
        if(i>=0){
            observers.remove(i);
        }
        
    }

    public void notifyObserver(){
        for (int i=0; i<observers.size();i++){
            Observer1 observer = (Observer1)observers.get(i);
            observer.update();
        }


    }


public void measurementsChanged() {

    notifyObserver();
}

public void setValue(float temperature){
    
    this.temperature = temperature;
    measurementsChanged();
}

    
}
