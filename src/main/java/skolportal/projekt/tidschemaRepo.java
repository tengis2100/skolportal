package skolportal.projekt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface tidschemaRepo extends JpaRepository<tidschema, Integer> {
    @Query(value = "select * from tidschema where cursid in (select course_id from Courses where course_name = ?)" ,nativeQuery = true)
    List<tidschema> getAllByCoursesName(String name);

}
