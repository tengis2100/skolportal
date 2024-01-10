package skolportal.projekt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface teachersRepo extends JpaRepository <teachers, Integer> {
    Optional<Users> findByTeacherId (Long id);

}
