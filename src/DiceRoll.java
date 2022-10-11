import java.util.Scanner;
import java.util.Random;
public class DiceRoll {
    public static void main(String[] args) {
        Scanner playAgain = new Scanner(System.in);
        String YorN = "";
        do {
            Random rnd = new Random();
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            System.out.println("Your first die reads: " + die1);
            System.out.println("Your second die reads" + die2);
            System.out.println("Your craps roll is" + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("You crapped out");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("You win!");

            } else {
                System.out.println("roll again");

            }
            System.out.println("do you want to play again [Y/N]?");
            YorN = playAgain.nextLine();


        }while (YorN.equalsIgnoreCase("Y")) ;
            Random rnd = new Random();
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            System.out.println("Your first die reads: " + die1);
            System.out.println("Your second die reads" + die2);
            System.out.println("Your craps roll is" + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("You crapped out");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("You win!");

            } else {
                System.out.println("roll again");

            }
            System.out.println("do you want to play again?");

        }

    }






