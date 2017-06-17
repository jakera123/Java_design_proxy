package com.zxp.design;

public class ProxyObject extends AbstarctObject {
	
	RealObject realObject=new RealObject();

	public void operation() {
		
		System.out.println("我是代理哦");
		realObject.operation();
		System.out.println("幕后的人发完话了哦");
		
	}

}
