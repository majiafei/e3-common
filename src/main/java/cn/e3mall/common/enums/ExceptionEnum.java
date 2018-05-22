package cn.e3mall.common.enums;

import javax.security.auth.kerberos.KerberosKey;

public enum ExceptionEnum {
	
	UPLOAD_ERROR(0,"文件上传失败")
	
	;
	
	private int code;
	
	private String message;
	
	private ExceptionEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
