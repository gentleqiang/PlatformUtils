package com.debug.demo.controller;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.debug.demo.entity.Persion;
import com.debug.demo.service.PersionService;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月14日 上午9:45:41
*/
@RestController
@RequestMapping("/base")
public class PersionController {
	
	@Autowired
	private PersionService persionService;
	
	@RequestMapping(value = "/info")
	public String info(@Validated Persion persion,BindingResult result){
		for (ObjectError error : result.getAllErrors()) {
			return error.getDefaultMessage();
		}
		return persionService.addPersion(persion);		
	}
	
}













































