public class MagicAnimal
{
    //instance variables

    public String name;
    public String type;
    public int speed;
    public double weight;

    //constructors

    public MagicAnimal(String name, String type, int speed, double weight)
    {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.weight = weight;
    }

    public MagicAnimal(String name)
    {
        this.name = "";
    }

    //brain methods

    public String feed()
    {
        speed = speed + (int)(Math.random()*10);
        weight = weight + (Math.random()*100);

        return("You fed your animal and it now has " + speed + " speed and a weight of " + weight + "pounds.");
    }

    public int calcSpd()
    {
        int trueSpeed;
        trueSpeed = (int) (speed * (weight/10));

        return(trueSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MagicAnimal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
