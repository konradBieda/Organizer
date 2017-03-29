package pl.polsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.domain.Task;

/**
 * Created by Jakub Majcher on 29.03.17.
 */

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
