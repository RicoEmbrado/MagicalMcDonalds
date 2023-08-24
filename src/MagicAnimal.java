public class MagicAnimal
{
    public String name;
    public String type;
    public int speed;
    public double weight;

    public MagicAnimal(String name, String type, int speed, double weight)
    {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.weight = weight;
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
}
