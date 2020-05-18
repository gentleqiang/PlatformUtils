package com.debug.demo.controller.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.serializer.Serializer;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * 自定义注入bean，操作Redis组件
 * 
 * @author gentleman_qiang
 * @version 创建时间：2020年5月12日 下午3:48:53
 */
@Configuration
public class RedisConfig {

	
	 @Autowired private RedisTemplate redisTemplate;
	 
	 @Autowired private RedisConnectionFactory connectionFactory;
	
	@Bean public RedisTemplate redisTemplate() { 
	   RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
	   redisTemplate.setConnectionFactory(connectionFactory);
	 
	   redisTemplate.setKeySerializer(new StringRedisSerializer());
       redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
	   redisTemplate.setHashKeySerializer(new StringRedisSerializer());
	 
	   redisTemplate.afterPropertiesSet(); 
	   return redisTemplate; 
	 }
	 
	 @Bean public StringRedisTemplate stringRedisTemplate() { 
		 StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
	     stringRedisTemplate.setConnectionFactory(connectionFactory); return
	     stringRedisTemplate; 
	 }
	
}
