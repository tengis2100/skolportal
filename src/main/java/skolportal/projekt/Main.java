package skolportal.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
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
        while (true) {
            System.out.println(" ");
            System.out.println("Skapa studentkonto: 1");
            System.out.println("se schema: 2");
            System.out.println("ändra konto: 3");
            System.out.println("radera konto: 4");

            String text = input.nextLine();

            if (text.equals("1")) {
                createStudent();
            } else if (text.equals("2")) {
                schema();
            } else if (text.equals("3")) {
                changeStudent();
            } else if (text.equals("4")) {
                deleteStudent();
            }
        }
    }

    public void createStudent () {
        System.out.println("skriv ditt mejl och lösenord");
        String email = input.nextLine();


        System.out.println("skriv ditt lösenord");
        String passStudent = input.nextLine();

        System.out.println("skriv hur många lektioner du har närvarat");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("skriv heltal");
        }
        int denominator = input.nextInt();
        input.nextLine();

        System.out.println("skriv hur många lektioner du har haft totalt");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("skriv heltal");
        }
        int numerator = input.nextInt();
        input.nextLine();

        double quotient = ((double) denominator)/numerator;
        double attendance_percentage = (quotient * 100);
        System.out.println(attendance_percentage);
        System.out.println(quotient);

        usersService.createNewUser(email, passStudent, attendance_percentage);



//        System.out.println("Vill du låna en dator?");
//        String text = input.nextLine();
//        if (text.equalsIgnoreCase("ja")) {
//            borrow();
//        }

      //  System.out.println("skriv vårdnadshavarens mejl");
      //  String parentMail = input.nextLine();

    }
public void changeStudent () {
    System.out.println("skriv mejladress av den du söker");
    String email = input.nextLine();

    usersService.changeEmail(email);

}

public void deleteStudent () {
    System.out.println();
    System.out.println("skriv mejladress av den du söker");
    String email = input.nextLine();

    usersService.deleteUserByEmail(email);
}


    private void schema () {
//        System.out.println("Vilka kurser har du valt");
//        String program = input.nextLine();
//        System.out.println(tidRepo.getAllByCoursesName(program));

            System.out.println("Vilket ämne vill du se");
            String program = input.nextLine();
                List<tidschema> Listschedule = tidRepo.getAllByCoursesName(program);
                if (!Listschedule.isEmpty()) {
                    System.out.println(Listschedule);
                }
                else {
                    System.out.println("kunde inte hittas");
                    schema();
                }
            }





    @Override
    public void run(String... args) throws Exception {
       //  System.out.println(tidRepo.getAllByCoursesName("matte"));
        menu();
       // usersService.createNewUser("fnisnif@vdsvvs.ffs", "bvhsbvjsk");
       // usersService.changeEmail(1);
        //2usersService.deleteUserByID(1);

    }
}