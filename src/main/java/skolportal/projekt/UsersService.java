package skolportal.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Scanner;

@Component
public class UsersService {
    @Autowired
    UsersRepo usersRepo;

    public static Scanner input = new Scanner (System.in);
    public static void addEmail () {
        System.out.println("skriv mejl");
        String text = input.nextLine();


    }
    public void createNewUser(String email , String password, double attendance_percentage){

        Users newUser = new Users(email, password, attendance_percentage);
        usersRepo.save(newUser);

    }

    public void changeEmail(String email){

        Optional<Users> us = usersRepo.findByEmail(email);
        if(us.isPresent()){
            Users user = us.get();
            System.out.println("skriv ny mejl");
            String text = input.nextLine();
            user.setEmail(text);
            System.out.println("skriv ny lösenord");
            String passtext = input.nextLine();
            user.setPassword(passtext);
            usersRepo.save(user);
        }else{
            System.out.println("There is no such user");
        }
    }

    public void deleteUserByID(long id){
        Optional<Users> us = usersRepo.findById(id);
        if(us.isPresent()){
            Users user = us.get();
            usersRepo.delete(user);
        }else{
            System.out.println("There is no such user");
        }
    }

    public void deleteUserByEmail(String email){
        Optional<Users> us = usersRepo.findByEmail(email);
        if(us.isPresent()){
            Users user = us.get();
            usersRepo.delete(user);
            System.out.println("Kontot har raderats");
        }else{
            System.out.println("There is no such user");
        }
    }


}
