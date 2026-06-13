package program_loop;

public class ProgramLoop {

    private boolean isContinuer = true;

    public void run() {
        while(isContinuer) {
            System.out.println("Я работаю");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
