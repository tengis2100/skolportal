package skolportal.projekt;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void menu () {
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

    public static void createTeacher () {

        System.out.println("skriv ditt mejl");
        String email = input.nextLine();

        System.out.println("skriv ditt lösenord");
        String passStudent = input.nextLine();

        System.out.println("Vilket/vilka program");
        String program = input.nextLine();


    }

    private static void borrow () {

    }

    public static void Database () {}
    Statement stmt = null;
    conn = mySqlDriver.getConnection(url,user,password);
    stmt = conn.createStatment();

    stmt.execute(sql);
    String sql = "INSERT INTO schema" + "()" + "Values()";
}