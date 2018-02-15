package top.linjt.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.linjt.springboot.Pojo.User;
import top.linjt.springboot.Repository.UserRepository;

import javax.transaction.Transactional;


@Service
public class UserService {

    @Autowired
    protected UserRepository userRepository;

    @Transactional
    public void  transTest(){

        User user1 = new User();
        user1.setAge(11);
        user1.setName("bz");
        userRepository.save(user1);
//        int i = 1/0;
        User user2 = new User();
        user2.setAge(18);
        user2.setName("bzz");
        userRepository.save(user2);

    }

}
