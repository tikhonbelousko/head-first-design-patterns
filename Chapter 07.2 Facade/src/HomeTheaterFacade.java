public class HomeTheaterFacade {
    Amplifier amplifier;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    StreamingPlayer streamingPlayer;
    TheaterLights theaterLights;

    public HomeTheaterFacade(Amplifier amplifier, PopcornPopper popcornPopper, Projector projector, Screen screen, StreamingPlayer streamingPlayer, TheaterLights theaterLights) {
        this.amplifier = amplifier;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.streamingPlayer = streamingPlayer;
        this.theaterLights = theaterLights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(streamingPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        streamingPlayer.on();
        streamingPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        streamingPlayer.stop();
        streamingPlayer.off();
    }

}
