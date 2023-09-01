import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Karen
{
   //instance variables

    private String name;
    private int numberOfRacers;

    //declaring things

    Scanner scanner = new Scanner(System.in);

    //constructors
    public Karen(String name, int numberOfRacers)
    {
        this.name = name;
        this.numberOfRacers = numberOfRacers;
    }

    public Karen(String name)
    {
        this.name = name;
    }

    //Brain methods

    public void makeAnimal(String type, ArrayList newList)
    {
        if (type.equals("Dragon"))
        {
            System.out.println("Nice Dragon! What do you want to name it?");
            Dragon dragon = new Dragon("","Dragon", 0, 0.0, 0, 0);
            dragon.setName(scanner.nextLine());
            newList.add(dragon);
        }
        else if (type.equals("Unicorn"))
        {
            System.out.println("Nice Unicorn! What do you want to name it?");
            Unicorn unicorn = new Unicorn("","Unicorn", 0, 0.0, 0, "");
            unicorn.setName(scanner.nextLine());
            System.out.println("What about its horn ability? Your options are: Water, Earth, and Fire");
            unicorn.setHornAbility(scanner.nextLine());
            while (!unicorn.getHornAbility().equals("Water") && !unicorn.getHornAbility().equals("Earth") && !unicorn.getHornAbility().equals("Fire"))
            {
                System.out.println("Try again.");
                unicorn.setHornAbility(scanner.nextLine());
            }
            newList.add(unicorn);
        }
        else if (type.equals("Griffith"))
        {
            System.out.println("Nice Griffith! What do you want to name it?");
            Griffith griffith = new Griffith("","Griffith", 0, 0.0, "", 0);
            griffith.setName(scanner.nextLine());
            System.out.println("What about its feather color? Your options are: Blue, Green, and Red");
            griffith.setFeatherColor(scanner.nextLine());
            while (!griffith.getFeatherColor().equals("Blue") && !griffith.getFeatherColor().equals("Green") && !griffith.getFeatherColor().equals("Red"))
            {
                System.out.println("Try again.");
                griffith.setFeatherColor(scanner.nextLine());
            }
            newList.add(griffith);
        }
    }

    public String decideWinner(ArrayList speedList, ArrayList animalList)
    {
        String output = "";
        if (speedList.size() == 2)
        {
            if ((int)speedList.get(1) < (int)speedList.get(0))
            {
                output = animalList.get(0) + " has won the race with " + speedList.get(0) + " speed!";
            }
            else if ((int)speedList.get(1) > (int)speedList.get(0))
            {
                output = animalList.get(1) + " has won the race with " + speedList.get(1) + " speed!";
            }
        }
        else if (speedList.size() == 3)
        {
            if ((int)speedList.get(0) > (int)speedList.get(1) && (int)speedList.get(0) > (int)speedList.get(2))
            {
                output = animalList.get(0) + " has won the race with " + speedList.get(0) + " speed!";
            }
            else if ((int)speedList.get(1) > (int)speedList.get(0) && (int)speedList.get(1) > (int)speedList.get(2))
            {
                output = animalList.get(1) + " has won the race with " + speedList.get(1) + " speed!";
            }
            else if ((int)speedList.get(2) > (int)speedList.get(0) && (int)speedList.get(2) > (int)speedList.get(1))
            {
                output = animalList.get(2) + " has won the race with " + speedList.get(2) + " speed!";
            }
        }
        return output;
    }

    //getters and setters

    public String getName()
    {
        return name;
    }

    public int getNumberOfRacers()
    {
        return numberOfRacers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfRacers(int numberOfRacers)
    {
        this.numberOfRacers = numberOfRacers;
    }

    //to string


    @Override
    public String toString() {
        return "Karen{" +
                "name='" + name + '\'' +
                ", numberOfRacers=" + numberOfRacers +
                '}';
    }
}
