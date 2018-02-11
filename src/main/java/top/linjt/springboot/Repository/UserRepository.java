package top.linjt.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.linjt.springboot.Pojo.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
