package com.zxp.design;

//代理模式，是让类不直接调用实际想调用的类。把任务交给代理，还有其他的两种代理

public class Client {
	public static void main(String[] args)
	{
	
		AbstarctObject obj=new ProxyObject();
		obj.operation();

	
	}
	
}
