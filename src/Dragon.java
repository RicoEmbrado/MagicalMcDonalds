public class Dragon extends MagicAnimal
{
    //Instance Variables

    private int wings;
    private int fireBreathStrength;

    //Constructor

    public Dragon(String name, String type, int speed, double weight, int wings, int fireBreathStrength)
    {
        super(name, type, speed, weight);
        this.wings = wings;
        this.fireBreathStrength = fireBreathStrength;
    }

    public Dragon(String name)
    {
        super(name);
        this.name = "";
    }

    //Methods

//    public int calcSpd()
//    {
//
//    }

    //Getters and Setters

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getFireBreathStrength() {
        return fireBreathStrength;
    }

    public void setFireBreathStrength(int fireBreathStrength) {
        this.fireBreathStrength = fireBreathStrength;
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
