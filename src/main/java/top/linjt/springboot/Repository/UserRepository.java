package top.linjt.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.linjt.springboot.Pojo.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {


    List<User> findByAge(Integer age);

    List<User> findByName(String name);
}
