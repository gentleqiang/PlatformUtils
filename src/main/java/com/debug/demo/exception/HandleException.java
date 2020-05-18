package com.debug.demo.exception;

import javax.jws.HandlerChain;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月14日 上午10:03:22
*/
@RestControllerAdvice
public class HandleException {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public String handleExceptino(MethodArgumentNotValidException e) {
		//从异常对象中拿到objecterror对象
		ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
		//返回错误的信息
		return objectError.getObjectName();
	}
}


































