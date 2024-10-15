import java.util.Random;
import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();

       int numberToGuess = random.nextInt(100) + 1;
       int numberOfTries = 0;
       boolean hasGuessedCorrectly = false;

        System.out.println("Добро пожаловать в игру 'Угадай число'!");
        System.out.println("Я загадал число от 1 до 100. Попробуй его угадать");

        while (!hasGuessedCorrectly) {
            System.out.print("Введите ваше число: ");
            int playerGuess = scanner.nextInt();
            numberOfTries++;
            if (playerGuess < 1 || playerGuess > 100) {
                System.out.println("Пожалуйста, введите число в диапазоне от 1 до 100.");
            }
            else if (playerGuess < numberToGuess) {
                System.out.println("Твое число слишком маленькое");
            }
            else if (playerGuess > numberToGuess) {
                System.out.println("Твое число слишком большое");
            }
            else {
                hasGuessedCorrectly = true;
                System.out.println("Поздравляю! Вы угадали число " + numberToGuess + " за " + numberOfTries + " попыток.");
            }
        }
        scanner.close();
    }
}