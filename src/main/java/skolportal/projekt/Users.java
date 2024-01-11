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

    @Column
    double attendance_percentage;

    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Users(String email, String password, double attendance_percentage) {
        this.email = email;
        this.password = password;
        this.attendance_percentage = attendance_percentage;
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

    public double getAttendance_percentage() {
        return attendance_percentage;
    }

    public void setAttendance_percentage(double attendance_percentage) {
        this.attendance_percentage = attendance_percentage;
    }

    @Override
    public String toString() {
        return "Users{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", attendance=" + attendance_percentage +
                '}'+"\n";
    }
}


