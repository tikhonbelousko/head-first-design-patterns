public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Sony Amplifier");
        PopcornPopper popcornPopper = new PopcornPopper("Sweet popcorn");
        StreamingPlayer streamingPlayer = new StreamingPlayer("Sony Streaming Player", amplifier);
        Projector projector = new Projector("Sony Projector", streamingPlayer);
        TheaterLights theaterLights = new TheaterLights("Theater lights");
        Screen screen = new Screen("IMAX Screen");

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                amplifier,
                popcornPopper,
                projector,
                screen,
                streamingPlayer,
                theaterLights);

        homeTheaterFacade.watchMovie("Batman");
        System.out.println("\n");
        homeTheaterFacade.endMovie();
    }
}
