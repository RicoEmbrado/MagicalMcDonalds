public class Unicorn extends MagicAnimal
{
    private int hornSharpness;
    private String hornAbility;

    //constructors

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

    //methods

    @Override
    public String feed()
    {
        int coin1 = (int)(Math.random()*10);

        speed = speed + (int)(Math.random()*10);
        weight = weight + (Math.round(Math.random()*100));

        if (coin1 > 5)
        {
            hornSharpness = hornSharpness + 1;
        }

        return("You fed your animal and it now has " + speed + " speed and a weight of " + weight + " pounds. Its amount of horn sharpness is " + hornSharpness + ".");
    }

    @Override
    public int calcSpd()
    {
        int trueSpeed;
        trueSpeed = (int) (speed * (weight/10));
        if (hornAbility.equals("Water"))
        {
            trueSpeed = (trueSpeed + hornSharpness) * 1;
        }
        else if (hornAbility.equals("Earth"))
        {
            trueSpeed = (trueSpeed + hornSharpness) * 2;
        }
        else if (hornAbility.equals("Earth"))
        {
            trueSpeed = (trueSpeed + hornSharpness) * 3;
        }

        return(trueSpeed);
    }

    //getters and setters

    public int getHornSharpness() {
        return hornSharpness;
    }

    public void setHornSharpness(int hornSharpness) {
        this.hornSharpness = hornSharpness;
    }

    public String getHornAbility() {
        return hornAbility;
    }

    public void setHornAbility(String hornAbility) {
        this.hornAbility = hornAbility;
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
