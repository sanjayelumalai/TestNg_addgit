package com.Annotation;

public class Demo2 extends Demo1{
	
	@Override
	public void Name1() {
		super.Name1();
	}
	public static void main(String[] args) {
		
		Demo2 d = new Demo2();
		d.Name1();
	}

}
