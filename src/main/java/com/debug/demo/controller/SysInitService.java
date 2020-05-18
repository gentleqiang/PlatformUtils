package com.debug.demo.controller;

import java.util.List;
import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.debug.demo.entity.Constant;
import com.debug.demo.entity.User;
import com.debug.demo.mapper.UserMapper;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月12日 下午4:57:39
*/
@Component
public class SysInitService implements CommandLineRunner{

	private static Logger log = LoggerFactory.getLogger(HelloController.class);

	/*
	 * @Autowired private UserMapper userMapper;
	 */
	
	/*
	 * @Autowired private RedisTemplate redisTemplate;
	 */
	
	@Autowired
	private Environment environment;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO 系统系统之后，加载的一些配置
		try {
			log.info("------------项目启动之后加载一些配置-----------");
			init();
			String property = environment.getProperty("server.servlet.context-path");
			System.out.println(property);
		} catch (Exception e) {
			log.error("项目启动之后加载一些配置异常：{}",e.fillInStackTrace());
		}		
	}
	
	public void init() {
		log.info("------------项目启动之后加载一些配置：开始(放入redis当中)-----------");
	}
		/*
		 * 方式一
		 * List<User> userList = userMapper.queryAll();
		 * redisTemplate.opsForList().leftPushAll(Constant.REDIS_KEY,userList);
		 */
		
        //方式二
		/*List<User> userList = userMapper.queryAll();
		
		ListOperations<String,User> listOperations = redisTemplate.opsForList();
		
		Long redisLength = listOperations.size(Constant.REDIS_KEY);
		
		if(redisLength > 0) {
			if(userList != null && !userList.isEmpty()) {
				//TODO 缓存中有，数据库也有  先删除缓存，在将数据中的更新到缓存
				redisTemplate.delete(Constant.REDIS_KEY);
				listOperations.leftPushAll(Constant.REDIS_KEY, userList);
			}else {
				//TODO 缓存中有，数据库没有，删除缓存
				redisTemplate.delete(Constant.REDIS_KEY);
			}
		}else {
            if(userList != null && !userList.isEmpty()) {
				//缓存没有，数据有，更新到缓存
            	listOperations.leftPushAll(Constant.REDIS_KEY, userList);
			}
		}
		log.info("------------项目启动之后加载一些配置：结束（从Redis取出）-----------");
		 ListOperations<String,User> operations = redisTemplate.opsForList();
		 List<User> userList2 = operations.range(Constant.REDIS_KEY, 0,
		 operations.size(Constant.REDIS_KEY));
		*/

}
