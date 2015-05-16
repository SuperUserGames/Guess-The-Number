import java.util.Random;
import java.util.Scanner;

public class Main {

	public static int NUMBER, GUESS, MAXVALUE;
	public static Scanner scan;
	public static Random rand;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		rand = new Random();
		NUMBER = rand.nextInt(100);

		System.out.println("Please Enter A Guess");
		while (GUESS != NUMBER) {
			GUESS = scan.nextInt();

			if (GUESS > NUMBER) {
				System.out.println("Your Guess Is Too High");
			}
			if (GUESS < NUMBER) {
				System.out.println("Your Guess Is Too Low");
			}
		}
		if (GUESS == NUMBER) {
			System.out.println("You Won");
		}
	}
}
