package com.debug.demo.service;

import org.springframework.stereotype.Component;

import com.debug.demo.entity.Persion;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月14日 上午9:49:05
*/
@Component
public class PersionService {
      public String addPersion(Persion persion) {
    	  return "Success";
      };
}
