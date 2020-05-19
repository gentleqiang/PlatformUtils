package com.debug.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.debug.demo.entity.User;
import com.debug.demo.mapper.UserMapper;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月19日 上午10:34:48
*/
@RestController
@RequestMapping("/user")
public class UserController {
   private static final Logger log = LoggerFactory.getLogger(UserController.class);
   
   @Autowired
   private UserMapper userMapper;
   
   @RequestMapping("/getAll")
   public void getUserList(@RequestParam Long userId){
	   List<User> queryAll = userMapper.queryAll();
	   List<String> collect = queryAll.stream().map(User::getUsername).collect(Collectors.toList());
	   collect.stream().forEach(t -> System.out.println(t));
	   User userById = userMapper.selectUserById(userId);
	   User user = new User();
	   BeanUtils.copyProperties(userById, user);
	   queryAll.sort((o1, o2) -> -Integer.compare(o1.getUser_id(),o2.getUser_id()));
  }
}
