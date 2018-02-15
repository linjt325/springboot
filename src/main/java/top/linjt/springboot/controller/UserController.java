package top.linjt.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.linjt.springboot.Pojo.User;
import top.linjt.springboot.Repository.UserRepository;
import top.linjt.springboot.service.UserService;

import java.util.List;

/**
 * @author XxX
 * @date 2018/2/11 15:50
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userDao;

    @Autowired
    private UserService userService;


    @GetMapping("{id}")
    public User get(@PathVariable int id ){
        return userDao.findOne(id);
    }

    @GetMapping({"","list"})
    public List<User> getList(){
        return userDao.findAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id ) {
        userDao.delete(id);
    }

    @PostMapping("/insert")
    public void insert(User user){
        userDao.save(user);
    }

    @GetMapping("age/{age}")
    public List<User> getByAge(@PathVariable("age") Integer age){
        return userDao.findByAge(age) ;
    }

    @GetMapping("name/{name}")
    public List<User> getByName(@PathVariable("name") String name){
        return userDao.findByName(name);
    }

    @GetMapping("trans")
    public void transTest(){
        userService.transTest();
    }
}
