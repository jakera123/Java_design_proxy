package com.zxp.design;

public class ProxyObject extends AbstarctObject {
	
	RealObject realObject=new RealObject();

	public void operation() {
		
		System.out.println("���Ǵ���Ŷ");
		realObject.operation();
		System.out.println("Ļ����˷��껰��Ŷ");
		
	}

}
