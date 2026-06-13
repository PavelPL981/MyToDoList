package program_loop;

import java.util.Scanner;

public class ProgramLoop {

    private boolean isContinier = true;

    public void run() {
        while(isContinier) {
            printMenu();
            isContinier = !isContinier;
            userInput();
        }
    }

    private int userInput() {
        System.out.println("Введите значение от 1 до 3");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input < 1 || input > 3) {
            return -1;
        }

        return input;
    }

    private static void printMenu() {
        System.out.println("Press 1. Create a new Task");
        System.out.println("Press 2. Change a Task");
        System.out.println("Press 3. Close a Task");
    }
}
