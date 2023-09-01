import java.util.Scanner;
import java.util.ArrayList;
public class Driver
{
    public static void main(String[] args)
    {
        //declaring things

        Scanner scanner = new Scanner(System.in);
        Karen karen = new Karen("", 0);
        ArrayList <MagicAnimal> animals = new ArrayList<>();

        //weight is measured by pounds and speed is measured by units. EX: the dragon, Flyff, will move 10 units per round.
        //anything strength related such as fire breathing, horn sharpness, etc. will all be measured from 1-10.
        //a hornAbility is what element a unicorn is able to manipulate using their horn

        //Naming yourself

        System.out.println("You are a new Karen exploring the magical world of McDonalds, what is your name?");
        karen.setName(scanner.nextLine());
        System.out.println("Your name is " + karen.getName() + ". Hi " + karen.getName() + "!");
        System.out.println("How many animals do you plan on racing, 2, 3");
        karen.setNumberOfRacers(scanner.nextInt());
        while (karen.getNumberOfRacers() < 2 || karen.getNumberOfRacers() > 3)
        {
            System.out.println("Try again.");
            karen.setNumberOfRacers(scanner.nextInt());
        }
        System.out.println("Ok! You are racing " + karen.getNumberOfRacers() + " animals!");
        for (int i = 0; i < karen.getNumberOfRacers(); i++)
        {
            String animalType = "";

                System.out.println("Please pick the animals you want to race! Same types are not allowed.\nThe choices are:\nDragon\nUnicorn\nGriffith");
                while(animalType != "Dragon" && animalType != "Unicorn" && animalType != "Griffith")
                {
                    animalType = scanner.nextLine();
                    karen.makeAnimal(animalType, animals);
                }
        }
    }
}