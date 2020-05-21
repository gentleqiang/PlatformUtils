package com.debug.demo.api.service;
/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月21日 上午10:00:48
*/

import com.debug.demo.api.request.LogDto;
import com.debug.demo.api.status.BaseResponse;

public interface IUserService {
    BaseResponse login(LogDto logDto);
}
