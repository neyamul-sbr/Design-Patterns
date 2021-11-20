public class Main {
    public static void main(String[] args) {
        Amplifier amp = new AmplifierObj();
        DvdPlayer dvd = new DvdPlayerObj();
        Lights light = new LightsObj();
        Projectors projector = new ProjectorsObj();

        Facade HomeTheater = new Facade(amp, dvd, light, projector);

        HomeTheater.watchMovie("Skyfall");
        HomeTheater.endMovie();


    }
    
}
