package pl.polsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.domain.Project;
import pl.polsl.domain.Sprint;

/**
 * Created by psikorski on 25.03.2017.
 */
@Repository
public interface SprintRepository extends JpaRepository<Sprint, Long> {
}
