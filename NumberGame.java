import java.util.Random;
import java.util.Scanner;


public class NumberGame
{
    Random random = new Random();
    int guessingNo = random.nextInt(11);
    public int userGuess, levels = 1;

    public void Introduction()
    {
        System.out.println("----Welcome to Number Game---- \n Please Select Any Number From 0-100 :\n");
    }
    public void rules()
    {
        System.out.println("Note : you will get 5 chances to guess the Numbers\n Lets Start!");
    }
    public void mygame()
    {
        int Chance = 1;
        Scanner sc = new Scanner(System.in);

        userGuess = sc.nextInt();
        while (guessingNo != userGuess && Chance != 5)
        {
            userGuess = sc.nextInt();
            Chance++;

        }
        if (guessingNo == userGuess)
        {
            System.out.println("You Won !!");
        } else {
            System.out.println("You lost !\n");
        }
    }

    public static void main(String args[])
    {
        NumberGame g = new NumberGame();

        g.Introduction();
        g.rules();
        g.mygame();

        while (true)
        {
            System.out.println("\n Select n to quit or y to play again \n");
            Scanner sc = new Scanner(System.in);
            String gameOver = sc.next();

            switch (gameOver) {

                case "n":
                    System.out.println("You are quiting soon ! See you \n");
                    return;
                case "y":
                    System.out.println("You are in level :"+g.levels);
                    System.out.println();
                    g.mygame();
                    g.levels++;
                    break;

                default:
                    break;

            }
        }
    }
}
