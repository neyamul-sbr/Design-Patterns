import java.util.function.DoubleBinaryOperator;

public class Facade {
    Amplifier amplifier;
    DvdPlayer dvdPlayer;
    Lights lights;
    Projectors projectors;

    public Facade(Amplifier amplifier, DvdPlayer dvdPlayer, Lights lights, Projectors projectors){
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.projectors = projectors;
    }

    public void watchMovie(String movie){
        amplifier.on();
        dvdPlayer.on();
        lights.off();
        projectors.on();
        dvdPlayer.play(movie);
    

    }

    public void endMovie(){
        lights.on();
        amplifier.off();
        projectors.off();
        dvdPlayer.off();

    }
    
}
