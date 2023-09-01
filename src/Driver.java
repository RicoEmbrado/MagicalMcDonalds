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
        boolean done = false;

        Dragon emptyDragon = new Dragon("");
        Unicorn emptyUnicorn = new Unicorn("");
        Griffith emptyGriffith = new Griffith("");

        //weight is measured by pounds and speed is measured by units. EX: the dragon, Flyff, will move 10 units per round.
        //anything strength related such as fire breathing, horn sharpness, etc. will all be measured from 1-10.
        //a hornAbility is what element a unicorn is able to manipulate using their horn

        //Naming yourself

        System.out.println("You are a new Karen exploring the magical world of McDonalds, what is your name?");
        karen.setName(scanner.nextLine());
        System.out.println("Your name is " + karen.getName() + ". Hi " + karen.getName() + "!");
        System.out.println("How many animals do you plan on racing, 2 or 3?");
        karen.setNumberOfRacers(scanner.nextInt());
        while (karen.getNumberOfRacers() < 2 || karen.getNumberOfRacers() > 3)
        {
            System.out.println("Try again.");
            karen.setNumberOfRacers(scanner.nextInt());
        }
        System.out.println("Ok! You are racing " + karen.getNumberOfRacers() + " animals!");

        if (karen.getNumberOfRacers() == 2)
        {
            String animalType = "";
            String firstAnimal = "";
            String secondAnimal = "";
            System.out.println("Please pick the animals you want to race! Same types are not allowed.\nThe choices are:\nDragon\nUnicorn\nGriffith");
            while(animals.size() == 0)
            {
                animalType = scanner.nextLine();
                firstAnimal = animalType;
                if(scanner.hasNextLine())
                {
                    while (!animalType.equals("Dragon") && !animalType.equals("Unicorn") && !animalType.equals("Griffith"))
                    {
                        animalType = scanner.nextLine();
                        firstAnimal = animalType;
                        if(!animalType.equals("Dragon") && !animalType.equals("Unicorn") && !animalType.equals("Griffith"))
                        {
                            System.out.println("Try Again.");
                        }
                        else if(animalType.equals("Dragon") || animalType.equals("Unicorn") || animalType.equals("Griffith"))
                        {
                            System.out.println("Cool!");
                        }
                    }
                }
                karen.makeAnimal(animalType, animals);
            }
            System.out.println("Please pick the animals you want to race again!\nThe choices are:\nDragon\nUnicorn\nGriffith");
            animalType = scanner.nextLine();
            secondAnimal = animalType;
            while (firstAnimal.equals(secondAnimal))
            {
                System.out.println("Please pick a different one.");
                animalType = scanner.nextLine();
                secondAnimal = animalType;
            }
            karen.makeAnimal(animalType, animals);
        }

        if (karen.getNumberOfRacers() == 3)
        {
            String animalType = "";
            String firstAnimal = "";
            String secondAnimal = "";
            String thirdAnimal = "";
            System.out.println("Please pick the animals you want to race! Same types are not allowed.\nThe choices are:\nDragon\nUnicorn\nGriffith");
            while(animals.size() == 0)
            {
                animalType = scanner.nextLine();
                firstAnimal = animalType;
                karen.makeAnimal(animalType, animals);
            }
            System.out.println("Please pick the animals you want to race again!\nThe choices are:\nDragon\nUnicorn\nGriffith");
            animalType = scanner.nextLine();
            secondAnimal = animalType;
            while (firstAnimal.equals(secondAnimal))
            {
                System.out.println("Please pick a different one, you already picked this.");
                animalType = scanner.nextLine();
                secondAnimal = animalType;
            }
            karen.makeAnimal(animalType, animals);
            System.out.println("Please pick the animals you want to race again!\nThe choices are:\nDragon\nUnicorn\nGriffith");
            animalType = scanner.nextLine();
            thirdAnimal = animalType;
            while (firstAnimal.equals(thirdAnimal) || secondAnimal.equals(thirdAnimal))
            {
                System.out.println("Please pick a different one, you already picked this.");
                animalType = scanner.nextLine();
                thirdAnimal = animalType;
            }
            karen.makeAnimal(animalType, animals);
        }

        //feeding

        System.out.println("Let's feed an animal! Which animal do you want to feed? Your choices are: ");
        while(done == false)
        {
            if (animals.size() == 2) {
                System.out.println(animals.get(0) + "\n" + animals.get(1) + "\nType 1 for the first option and type 2 for the second.");
                if (scanner.nextInt() == 1) {
                    System.out.println(animals.get(0).feed());
                } else if (scanner.nextInt() == 2) {
                    System.out.println(animals.get(1).feed());
                }
            }

            if (animals.size() == 3) {
                System.out.println(animals.get(0) + "\n" + animals.get(1) + "\n" + animals.get(2) + "\nType 1 for the first option, type 2 for the second, and type 3 for the third.");
                if (scanner.nextInt() == 1) {
                    System.out.println(animals.get(0).feed());
                } else if (scanner.nextInt() == 2) {
                    System.out.println(animals.get(1).feed());
                } else if (scanner.nextInt() == 3) {
                    System.out.println(animals.get(2).feed());
                }
            }
            System.out.println("Do you want to feed another animal? Yes or No?");
            String answer = "";
            while(!answer.equals("Yes") && !answer.equals("No"))
            {
                answer = scanner.nextLine();
                if (answer.equals("Yes"))
                {
                    done = false;
                    System.out.println("Let's feed an animal! Which animal do you want to feed? Your choices are: ");
                }
                else if (answer.equals("No"))
                {
                    done = true;
                }
            }
        }

        //Starting the race

        ArrayList <Integer> trueSpeeds = new ArrayList<>();

        if (karen.getNumberOfRacers() == 2)
        {
            trueSpeeds.add(animals.get(0).calcSpd());
            trueSpeeds.add(animals.get(1).calcSpd());
        }
        else if (karen.getNumberOfRacers() == 3)
        {
            trueSpeeds.add(animals.get(0).calcSpd());
            trueSpeeds.add(animals.get(1).calcSpd());
            trueSpeeds.add(animals.get(2).calcSpd());
        }

        System.out.println("\n" + karen.decideWinner(trueSpeeds, animals) + "\n");

        //outputting to String

        System.out.println(karen.toString() + "\n");
        for(int i = 0; i < animals.size(); i++)
        {
            System.out.println(animals.get(i).toStringRegular());
        }
    }
}