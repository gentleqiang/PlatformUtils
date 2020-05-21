package com.debug.demo.api.status;
/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月21日 上午9:48:09
*/
public enum StatusCode {
     Suceess(1,"成功"),
     Fail(0,"失败"),
	 InvalidArguments(-1,"非法的参数"),
     ;
	private Integer code;
	private String  msg;
	
	private StatusCode(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	private StatusCode() {}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
	
}
