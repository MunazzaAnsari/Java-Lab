abstract class Animal
{
    String food;
    String sound;
    String hunger;
    String boundries;
    String location;
    abstract public void makenoise(String s);
    abstract public void eat(String h,String f);
    public void sleep(String l)
    {
        location=l;
        System.out.println("location where the animal sleep"+location);

    }
    public void roam(String r)
    {
        boundries=r;
        System.out.println("Boundries where the animal roam"+boundries);

    }

}