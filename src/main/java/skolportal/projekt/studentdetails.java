package skolportal.projekt;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetails")
public class studentdetails {

    @Id
    @Column(name="student_id")
    int student_id;

    @Column(name="guardian_email")
    String guardian_email;

    @Column(name="program_id")
    int program_id;

    @Column(name="borrowed_computer_id")
    int borrowed_computer_id;

    @Column(name="total_attendance")
    int total_attendance;

  public studentdetails( ) {

  }

    public studentdetails(int studentId, String guardian_email, int program_id, int borrowed_computer_id, int total_attendance) {
        this.student_id = studentId;
        this.guardian_email = guardian_email;
        this.program_id = program_id;
        this.borrowed_computer_id = borrowed_computer_id;
        this.total_attendance = total_attendance;
    }
}
