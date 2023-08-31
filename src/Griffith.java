public class Griffith extends MagicAnimal
{
    private String featherColor;
    private int nailSharpness;

    public Griffith(String name, String type, int speed, double weight, String featherColor, int nailSharpness)
    {
        super(name, type, speed, weight);
        this.featherColor = featherColor;
        this.nailSharpness = nailSharpness;
    }

    public Griffith(String name)
    {
        super(name);
        this.name = "";
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString()
    {
        return "Griffith{" +
                "featherColor='" + featherColor + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
