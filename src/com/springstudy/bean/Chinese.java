package com.springstudy.bean;

public class Chinese {
	private String name;
	private String color;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getFeature() {
		return "中国人："+name+"毛发颜色："+color;
	}
}
