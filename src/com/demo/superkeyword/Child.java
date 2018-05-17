package com.demo.superkeyword;

public class Child extends Parent {

	String str="child_class";
	
	
	public Child() {

//		super(20);
		this(20);
		System.out.println(" Zero parameterize constructor : Child");
		
	}

	public Child(int a) {
		

		System.out.println("parameterize constructor : Child");
		
	}
	
	
	void m1()
	{
		System.out.println("M1:Child");
		super.m1();
		this.m2();
	}
	
	
	void m2()
	{
		{
			
			System.out.println("M2:Child : "+ this.str);
//			super.m1();
		}	
	}
}
