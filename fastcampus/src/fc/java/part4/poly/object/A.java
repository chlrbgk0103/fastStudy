package fc.java.part4.poly.object;

import java.lang.*;

public class A extends java.lang.Object{

	// 생성자 [생략 가능]
	public A() {
		super();	//상위클래스의 생성자 호출 (new Object())
	}
	
	public void display() {
		System.out.println("A 입 니 다.");
	}
	
	public void printGo() {
		System.out.println("printGo A 입 니 다.");
	}
	
}
