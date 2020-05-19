package com.debug.demo.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.debug.demo.entity.User;

/**
* 用户mapper
* @author gentleman_qiang
* @version 创建时间：2020年5月11日 下午1:51:48
*/
@Component
public interface UserMapper {
   int addUser(User user);
   
   int deleteById(Integer userId);
   
   User updateUserById(User user);
   
   List<User> queryAll();
   
   User selectUserById(Long userId);
   
   //开始复杂的动态查询
   List<User> showUser(String username,String password);
   
   List<User> getUserList(List<Integer> userIdsList);
   
   User updateUser(String username,String password,Integer user_id);
}













































