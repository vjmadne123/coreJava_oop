package Day12;

abstract class A {
	abstract void m1();
	void m2() {
		System.out.println("hello");
	}
	 abstract void m3();
}
class B extends A{
	@Override 
	void m1() {
		System.out.println("good morning");
	}

	@Override
	void m3() {
		System.out.println("hellohi");
				
	}
	
}
	
class Sample{
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.m1();
		b1.m2();
		b1.m3();
        

	}

}
