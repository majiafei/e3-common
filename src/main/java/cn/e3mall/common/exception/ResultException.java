package cn.e3mall.common.exception;

import cn.e3mall.common.enums.ExceptionEnum;

public class ResultException extends RuntimeException{
	
	
	private int code;
	private String message;
	
	public ResultException(ExceptionEnum exceptionEnum) {
		super(exceptionEnum.getMessage());
		this.code = code;
	}
	

}
