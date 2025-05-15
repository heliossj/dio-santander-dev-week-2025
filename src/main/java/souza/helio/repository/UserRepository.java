package souza.helio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import souza.helio.model.User;

public interface UserRepository extends JpaRepository <User, Long> {
    boolean existsByAccountNumber(String account);
}
