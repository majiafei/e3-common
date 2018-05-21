package cn.e3mall.common;

import java.io.Serializable;

public class EasyUINode implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4256281056994703786L;
	
	private long id;
	private String text;
	private String state;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
