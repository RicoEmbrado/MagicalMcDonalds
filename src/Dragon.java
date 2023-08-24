public class Dragon extends MagicAnimal
{
    public int wings;

    public Dragon(String name, String type, int speed, double weight, int wings)
    {
        super(name, type, speed, weight);
        this.wings = wings;
    }

    @Override
    public String toString()
    {
        return "Dragon{" +
                "wings=" + wings +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
