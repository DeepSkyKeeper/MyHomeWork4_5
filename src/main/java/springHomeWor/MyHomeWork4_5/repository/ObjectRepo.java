package springHomeWor.MyHomeWork4_5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springHomeWor.MyHomeWork4_5.models.User;

@Repository
public interface ObjectRepo extends JpaRepository<User,Integer> {
}
