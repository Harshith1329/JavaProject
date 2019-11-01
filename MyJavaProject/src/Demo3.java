
class Demo3 {

	void m1()		// non static method (context) 
	{
		System.out.println("from m1");
	}
	
	public static void main(String[] args) {
		
		Demo3 x = new Demo3();
		x.m1();   //we call non static method using object reference variable 
	}
}
