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

    //methods

    @Override
    public String feed()
    {
        int coin1 = (int)(Math.random()*10);

        speed = speed + (int)(Math.random()*10);
        weight = weight + (Math.round(Math.random()*100));

        if (coin1 > 5)
        {
            nailSharpness = nailSharpness + 1;
        }

        return("You fed your animal and it now has " + speed + " speed and a weight of " + weight + " pounds. Its amount of nail sharpness is " + nailSharpness + ".");
    }

    @Override
    public int calcSpd()
    {
        int trueSpeed;
        trueSpeed = (int) (speed * (weight/10));
        if (featherColor.equals("Water"))
        {
            trueSpeed = (trueSpeed + nailSharpness) * 1;
        }
        else if (featherColor.equals("Earth"))
        {
            trueSpeed = (trueSpeed + nailSharpness) * 2;
        }
        else if (featherColor.equals("Earth"))
        {
            trueSpeed = (trueSpeed + nailSharpness) * 3;
        }

        return(trueSpeed);
    }

    //getters and setters

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
