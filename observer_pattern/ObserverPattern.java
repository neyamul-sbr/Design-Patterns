
public class ObserverPattern{

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        WindowDisplay W = new WindowDisplay(weatherData);
        
        WindowDisplay W2 = new WindowDisplay(weatherData);

        weatherData.setValue(30);
        weatherData.setValue(40);
       

        weatherData.removeObserver(W2);

        weatherData.setValue(60);
        









    }
}