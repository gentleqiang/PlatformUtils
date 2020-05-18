package com.debug.demo.controller;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class HelloController{
	
	private static Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/index")
	public String info() {
		return "index";	
	}
	
	@RequestMapping(value = "/upload",method = RequestMethod.POST)
	@ResponseBody
	public String action(@RequestParam("file") MultipartFile file) {
		if (file.isEmpty()) {
		   return "文件上传失败";
		}
		
		String filename = file.getName();
		String filePath = "d:/Picture/";
		File dest = new File(filePath+filename);
		try {
			file.transferTo(dest);
			System.out.println("上传成功");
			return "上传成功";
		} catch (Exception e) {
			System.out.println("抛出异常");
		}
		return "上传失败";	
	}
	
}

























