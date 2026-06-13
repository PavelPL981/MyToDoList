package util;

import dictionary.ConsoleMessage;

import java.util.Scanner;

public class InputFromConsole {

    Scanner scanner = new Scanner(System.in);
    SendToConsole sendToConsole = new SendToConsole();

    public int userChoosePoint(ConsoleMessage consoleMessage) {
        return userChoosePoint(consoleMessage.getCountPoint(), consoleMessage.getMessage());
    }

    public int userChoosePoint(int maxCountPoints, String text) {
        sendToConsole.send(text);
        int input = scanner.nextInt();

        boolean result = validateChooseUser(maxCountPoints, input);

        if (!result) {
            String message = "Уважаемый пользователь, вы ввели неверное значение. Попробуйте еще раз: ";
            userChoosePoint(maxCountPoints, message + text);
        }

        return input;
    }

    private boolean validateChooseUser(int maxCountPoints, int choose) {
        return choose > 0 && choose <= maxCountPoints;
    }
}
