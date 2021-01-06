package FacadePattern;

import FacadePattern.Facades.*;

public class HomeTheaterFacade {
    // --> Here’s the composition; these are all the components of the subsystem we are going to use.
    Amplifier amp;
    DvdPlayer dvd;
    Projector projector;
    TheaterLights lights;
    Screen screen;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, Screen screen, TheaterLights lights) {
        // --> The facade is passed a reference to each component of the subsystem in
        // its constructor. The facade then assigns each to the corresponding instance variable.
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("\n-->Get ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("\n-->Shutting movie theater down...");
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
