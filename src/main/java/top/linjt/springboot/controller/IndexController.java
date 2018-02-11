package top.linjt.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import top.linjt.springboot.entity.Girl;


@RestController//代替了@Controller和@ResponseBody 的组合
public class IndexController {

    @Value(value = "${age}")//指定配置文件中的属性值
    private int age;
    @Value(value = "${cupSize}")
    private String cupSize;
    @Value(value = "${content}")
    private String content;

    @Autowired//将配置文件中的值通过注解自动注入到类中
    private Girl girl;

    //@GetMapping() 用于指定该方法 通过get方法调用
    @RequestMapping(value = {"/test/{id}","/{id}"})//value属性为数组,支持传入多个值
    public String test(@PathVariable("id") Integer id ,Integer age,@RequestParam(value = "name",defaultValue = "有没有名字啊")String n) {//@PathVariable将路径中的值作为参数传入
        System.out.println("age: " + age);
        System.out.println("name: " + n);
        System.out.println("id: " + id);
        return girl.toString();
    }



}
