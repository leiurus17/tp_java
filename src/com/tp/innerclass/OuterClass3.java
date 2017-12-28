package com.tp.innerclass;

abstract class AnonymousInner {
	public abstract void myMethod();
}

public class OuterClass3 {
	
	public static void main(String[] args) {
		AnonymousInner inner = new AnonymousInner() {
			public void myMethod() {
				System.out.println("This is an example of anonymous inner class");
			}
		};
		
		inner.myMethod();
	}
	

}
