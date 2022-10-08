package dive.dev.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dive.dev.models.UserDetail;

@Repository
public interface UserRepository extends JpaRepository<UserDetail, Long>{
}
