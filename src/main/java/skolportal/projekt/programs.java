package skolportal.projekt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="programs")
public class programs {

    @Id
    @Column
    int id;
    @Column
    String programName;

    public programs(int id, String programName) {
        this.id = id;
        this.programName = programName;
    }

    public programs() {

    }

    public int getId() {
        return id;
    }

    public String getProgramName() {
        return programName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
