package ti.tortora.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ti.tortora.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
