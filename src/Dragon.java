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

    @Override
    public String feed()
    {
        int coin1 = (int)(Math.random()*10);
        int coin2 = (int)(Math.random()*10);

        speed = speed + (int)(Math.random()*10);
        weight = weight + (Math.round(Math.random()*100));

        if (coin1 > 5)
        {
            wings = wings + 1;
        }
        if (coin2 > 5)
        {
            fireBreathStrength = fireBreathStrength + 1;
        }

        return("You fed your animal and it now has " + speed + " speed and a weight of " + weight + " pounds. Its amount of wings is " + wings + ", and its fire breath strength is at " + fireBreathStrength + ".");
    }

    @Override
    public int calcSpd()
    {
        int trueSpeed;
        trueSpeed = (int) (speed * (weight/10));
        trueSpeed = (trueSpeed + wings) + fireBreathStrength;

        return(trueSpeed);
    }

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
        return name;
    }

    @Override
    public String toStringRegular()
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
