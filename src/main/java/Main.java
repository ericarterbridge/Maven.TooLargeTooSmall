/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int tries;
        int correctNum = rand.nextInt(100);
        correctNum += 1;

        while(true) {
            System.out.println("enter a number from 1 to 100.");
            int guess1 = input.nextInt();

            if (guess1 < correctNum) {
                System.out.println("number is too low!");
            }
            else if (guess1 > correctNum) {
                System.out.println("number is too high!");
            }
            else if (guess1 == correctNum) {
                System.out.println("Correct!!");
                break;
            }
            else {
                System.out.println("Not a valid option.");
            }

        }
    }
}
