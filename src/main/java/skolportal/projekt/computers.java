package skolportal.projekt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="computers")
public class computers {

    @Id
    @Column
    private int id;

    @Column(name="computer_name")
    private String computerName;

    public computers(int id, String computerName) {
        this.id = id;
        this.computerName = computerName;
    }

    public int getId() {
        return id;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public computers() {
    }

}
