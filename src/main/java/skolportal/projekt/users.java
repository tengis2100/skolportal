package skolportal.projekt;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="users")
public class users {

    @Id
    @Column
    String email;

    @Column
    String password;

    public users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public users() {

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

}


