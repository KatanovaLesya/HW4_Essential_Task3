public class Player implements Recodable, Playable {
    @Override

    public void play()
    {
        System.out.println("Функція програвання");
    }
    public void pause()
    {System.out.println("Функція призупинення");}

    public void stop()
    {System.out.println("Функція зупинки");}

    public void record()
    {
        System.out.println("Функція запису");
    }
}
