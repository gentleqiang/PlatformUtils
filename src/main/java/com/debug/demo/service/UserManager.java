package com.debug.demo.service;

import com.debug.demo.api.request.LogDto;
import com.debug.demo.api.status.BaseResponse;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月21日 上午10:13:10
*/
public interface UserManager {
	
	BaseResponse login(LogDto logDto);
}
