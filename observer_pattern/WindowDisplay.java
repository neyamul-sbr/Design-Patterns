import java.util.*;
public class WindowDisplay implements Observer1 {

    private float temp;
    private WeatherData weatherobject;
    

    public WindowDisplay(WeatherData weatherobject){
        this.weatherobject = weatherobject;
        weatherobject.addObserver(this);
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        temp = this.weatherobject.getTemp();
        display();
        
    }
    public void display() {
        System.out.println("Current Conditions: "+ temp);
    }
    
    
}
