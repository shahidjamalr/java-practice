import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        int secret = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int tries = 0;
        while (guess != secret) {
            System.out.println("Your guess");
            guess = sc.nextInt();
            tries++;
            if (guess > secret) {
                System.out.println("Too high!");
            } else if (guess < secret) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! you got it in " + tries + " tries");
            }
        }
    }
}