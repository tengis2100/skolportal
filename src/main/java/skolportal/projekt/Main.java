package skolportal.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Main implements CommandLineRunner {

    public static Scanner input = new Scanner(System.in);
    @Autowired
    UsersService usersService;

    String string = new String();
    public  void menu () {
    System.out.println("Skapa studentkonto: tryck 1");
    System.out.println("Skapa lärarkonto: tryck 2");

    String text = input.nextLine();

    if (text.equals("1")) {
    createStudent();
    }   else if (text.equals("2")) {
        createTeacher();
    }

    }

    public static void createStudent () {
        System.out.println("skriv ditt mejl");
        String email = input.nextLine();


        System.out.println("skriv ditt lösenord");
        String passStudent = input.nextLine();

        System.out.println("Vilket program");
        String program = input.nextLine();

        System.out.println("Vill du låna en dator?");
        String text = input.nextLine();
        if (text.equalsIgnoreCase("ja")) {
            borrow();
        }

        System.out.println("skriv vårdnadshavarens mejl");
        String parentMail = input.nextLine();

    }

    public  void createTeacher () {

        System.out.println("skriv ditt mejl");
        String email = input.nextLine();

        System.out.println("skriv ditt lösenord");
        String passStudent = input.nextLine();

        usersService.createNewUser(email, passStudent);

        // System.out.println("Vilket/vilka program");
       // String program = input.nextLine();


    }

    private static void borrow () {

    }



    public static void Database () {
//        Statement stmt = null;
//        conn = mySqlDriver.getConnection(url, user, password);
//        stmt = conn.createStatment();
//
//        stmt.execute(sql);
//        String sql = "INSERT INTO schema" + "()" + "Values()";
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(usersService.usersRepo.findAll());
        menu();
       // usersService.createNewUser("fnisnif@vdsvvs.ffs", "bvhsbvjsk");
       // usersService.changeEmail(1);
        //2usersService.deleteUserByID(1);

    }
}