package pl.polsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.domain.User;

/**
 * Created by Jakub Majcher on 30.03.17.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
