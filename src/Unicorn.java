public class Unicorn extends MagicAnimal
{
    int hornSharpness;

    public Unicorn(String name, String type, int speed, double weight, int hornSharpness)
    {
        super(name, type, speed, weight);
        this.hornSharpness = hornSharpness;
    }

    @Override
    public String toString()
    {
        return "Unicorn{" +
                "hornSharpness=" + hornSharpness +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
