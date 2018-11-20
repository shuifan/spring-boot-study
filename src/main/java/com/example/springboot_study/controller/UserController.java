package com.example.springboot_study.controller;


import com.example.springboot_study.async.Task;
import com.example.springboot_study.config.Properties;
<<<<<<< HEAD
import com.example.springboot_study.dao.mapper.ModelDeptMapper;
=======
import com.example.springboot_study.domain.ResultStyle;
>>>>>>> 0411252277c8d7b436b0b013c019b7b56a227366
import com.example.springboot_study.domain.p.User;
import com.example.springboot_study.domain.p.UserRepository;
import com.example.springboot_study.domain.s.MsgRepository;
import com.example.springboot_study.service.Animal;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    //创建线程安全的 map
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private MsgRepository msgRepository;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private Task task;

    @Autowired
    private Properties properties;

    @Autowired
    @Qualifier("cat")
    private List<Animal> animals;

    @Autowired
    private ModelDeptMapper deptMapper;

    @ApiOperation(value = "获取所有用户", notes = "获取所有的用户")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public  Object getUsers(@RequestParam("id") Integer id){
        //处理 “/users/” 的get请求
        //@RequestParam 可以绑定get的参数 或者  post的body data
        return id;
    }

    @ApiOperation(value = "获取收入信息", notes = "获取指定时间内的收入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startTime", value = "开始日期", required = true, dataType = "2017-08-01")
    })
    @RequestMapping(value = "/income/{startTime}/{endTime}", method = RequestMethod.GET)
    public  Object getIncome(@PathVariable String startTime, @PathVariable String endTime){
        return startTime + endTime;
    }

//    @Cacheable(value = MyRedisKeys._CACHE_TEST, key = "#name")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public  Object test(String name) throws Exception{
//        userRepository.save(new User("fandong", 13));
//        return userRepository.findByName("fandon");
//        userRepository.save(new User("haha", 23));
//        msgRepository.save(new Msg("ceshi", "ceshi"));
//        stringRedisTemplate.opsForValue().set("aaa", "111");
//
//        return stringRedisTemplate.opsForValue().get("aaa");

        //async 异步任务测试start
//        long start = System.currentTimeMillis();
//
//        Future<String> task1 = task.doTaskOne();
//        Future<String> task2 = task.doTaskTwo();
//
//        while (true){
//
//            if (task1.isDone() && task2.isDone()) break;
//
//            Thread.sleep(100);
//
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println("任务全部完成 总耗时: " + (end - start) + "毫秒");
        //async 异步任务测试end


//        Gson gson = new GsonBuilder().create();
//        System.out.println("111111");
//        return name;
//        stringRedisTemplate.opsForValue().get("aaa");
//        return userRepository.findByName("ceshi");

//        if (null != animals && animals.size() > 0){
//            for (Animal animal : animals){
//                System.out.println(animal.getName());
//            }
//        }else {
//            System.out.println("is null");
//        }
<<<<<<< HEAD
//        List<User> users = new ArrayList<>();
//        users.add(new User("122", 89));
//        users.add(new User("133", 99));
//        userRepository.save(users);
//        return properties;
        return deptMapper.selectAllDepts();
=======

//        Map<String, String> map = new HashMap<>();
//        map.put("aaa", "ssss");
        return new ResultStyle<Map<String, String>>("测试用失败");
>>>>>>> 0411252277c8d7b436b0b013c019b7b56a227366
    }

}
