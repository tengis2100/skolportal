package skolportal.projekt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class courses {

    @Id
    @Column (name="course_id")
    int courseId;

    @Column(name="course_name")
    String courseName;

    @Column(name="program_id")
    int programId;

    @Column(name="teacher")
    int teacher;

    @Column(name="start_vecka")
    int startTime;

    @Column(name="slut_vecka")
    int endTime;

    @Column(name="students")
    int students;

    public courses(int courseId, String courseName, int programId, int teacher, int startTime, int endTime, int students) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.programId = programId;
        this.teacher = teacher;
        this.startTime = startTime;
        this.endTime = endTime;
        this.students = students;
    }

    public courses() {

    }
}
