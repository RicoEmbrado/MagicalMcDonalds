public class Unicorn extends MagicAnimal
{
    private int hornSharpness;
    private String hornAbility;

    public Unicorn(String name, String type, int speed, double weight, int hornSharpness, String hornAbility)
    {
        super(name, type, speed, weight);
        this.hornSharpness = hornSharpness;
        this.hornAbility = hornAbility;
    }

    public Unicorn(String name)
    {
        super(name);
        this.name = "";
    }

    public int getHornSharpness() {
        return hornSharpness;
    }

    public void setHornSharpness(int hornSharpness) {
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
