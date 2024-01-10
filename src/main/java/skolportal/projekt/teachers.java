package skolportal.projekt;


import jakarta.persistence.*;

@Entity
@Table (name="teachers")
public class teachers {

    @Id
    @Column(name="teacher_id")
    int teacherId;

    @Column
    String email;

    public teachers(int teacherId, String email) {
        this.teacherId = teacherId;
        this.email = email;
    }

    public teachers() {

    }


}
