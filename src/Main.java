public class Main
{
    public static void main(String[] args)
    {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar();
        instruments[1] = new Drum();
        instruments[2] = new Tube();

        for (Instrument instrument : instruments)
        {
            instrument.play();
        }
    }
}