package com.springstudy.bean;

public class American {
	private String name;
	private String color;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getFeature() {
		return "美国人："+name+"毛发颜色："+color;
	}
	
}
