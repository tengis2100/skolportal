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
    @Autowired
    tidschemaRepo tidRepo;

    String string = new String();
    public  void menu () {
    System.out.println("Skapa studentkonto: tryck 1");
    System.out.println("Skapa lärarkonto: tryck 2");

    String text = input.nextLine();

    if (text.equals("1")) {
    createStudent();
    }   else if (text.equals("2"))
        {
        createTeacher();
        }
    }

    public static void createStudent () {
        System.out.println("skriv ditt mejl");
        String email = input.nextLine();

        System.out.println("skriv ditt lösenord");
        String passStudent = input.nextLine();

        System.out.println("Vilka kurser");
        String program = input.nextLine();



//        System.out.println("Vill du låna en dator?");
//        String text = input.nextLine();
//        if (text.equalsIgnoreCase("ja")) {
//            borrow();
//        }

      //  System.out.println("skriv vårdnadshavarens mejl");
      //  String parentMail = input.nextLine();

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


    @Override
    public void run(String... args) throws Exception {
        System.out.println(tidRepo.getAllByCoursesName("economic "));
        menu();
       // usersService.createNewUser("fnisnif@vdsvvs.ffs", "bvhsbvjsk");
       // usersService.changeEmail(1);
        //2usersService.deleteUserByID(1);

    }
}