package com.springstudy.ioc;

public class Chinese implements Person{
	private Axe axe;
	
	//设值注入axe
	//public void setAxe(Axe axe) {
	//	this.axe = axe;
	//}
	
	//构造注入axe
	Chinese(Axe axe) {
		this.axe = axe;
	}
	
	@Override
	public void useAxe() {
		System.out.println(axe.chop());
	}
	
}
