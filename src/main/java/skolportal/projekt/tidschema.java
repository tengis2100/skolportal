package skolportal.projekt;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
@Table
public class tidschema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cursid")
    Courses cours;
    @Column
    Time time;

    @Column
    String subject;

    public tidschema(int id, Courses cursID, Time time, String subject) {
        this.id = id;
        this.cours = cursID;
        this.time = time;
        this.subject = subject;
    }

    public tidschema() {
    }

    @Override
    public String toString() {
        return "tidschema{" +
                "id=" + id +
                ", cursID=" + cours +
                ", time=" + time +
                ", subject='" + subject + '\'' +
                '}' + "\n";
    }

}
