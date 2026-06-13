package dictionary;

public enum ConsoleMessage {

    START_MENU(
            """
            1. Создать a new Task
            2. Изменить a Task
            3. Посмотреть текущие задачи
                3.1. Выбрать задачу
            4. Удалить задачу
            5. Закрыть задачу
            6. Выход из программы
            """,
            4
    );

    private final String message;
    private final int countPoint;

    ConsoleMessage(String message, int countPoint) {
        this.message = message;
        this.countPoint = countPoint;
    }

    public String getMessage() {
        return message;
    }

    public int getCountPoint() {
        return countPoint;
    }
}
