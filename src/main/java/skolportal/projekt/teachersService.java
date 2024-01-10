package skolportal.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Scanner;

public class teachersService {

    @Component
    public class UsersService {
        @Autowired
        UsersRepo usersRepo;

        public static Scanner input = new Scanner(System.in);

        public static void addEmail() {
            System.out.println("skriv mejl");
            String text = input.nextLine();


        }

        public void createNewUser(String email, String password) {

            Users newUser = new Users(email, password);
            usersRepo.save(newUser);

        }

        public void changeEmail(long id) {
            Optional<Users> us = usersRepo.findById(id);
            if (us.isPresent()) {
                Users user = us.get();
                user.setEmail("newemail.cnoic");
                usersRepo.save(user);
            } else {
                System.out.println("There is no such user");
            }
        }

        public void deleteUserByID(long id) {
            Optional<Users> us = usersRepo.findById(id);
            if (us.isPresent()) {
                Users user = us.get();
                usersRepo.delete(user);
            } else {
                System.out.println("There is no such user");
            }
        }
    }
}
