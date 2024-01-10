package skolportal.projekt;


import jakarta.persistence.*;

@Entity
@Table (name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column
    String email;

    @Column
    String password;

    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Users() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}' +"\n";
    }
}


