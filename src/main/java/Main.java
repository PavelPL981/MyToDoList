import dictionary.Commands;
import domain.AuthorInfo;
import program_loop.ProgramLoop;
import service.AuthorInfoService;

public class Main {

    public static void main(String[] args) {
//        ProgramLoop loop = new ProgramLoop();
//        loop.run();


        AuthorInfo authorInfo = Commands.START.getAuthorInfo();
        System.out.println(authorInfo.getCreateDate());

    }


}
