package skolportal.projekt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface teachersRepo extends JpaRepository <teachers, Integer> {
}
