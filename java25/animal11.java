package java25;

public class animal11 {

	public static void main(String[] args) {
		lion l= new lion();
		l.sound();
		tiger t= new tiger();
		t.sound();
		

	}

}
abstract class animal{
	
	abstract void sound();
}

class lion extends animal{

	@Override
	void sound() {
		System.out.println(" lion");
		
	}
	
}

class tiger extends animal{

	@Override
	void sound() {
		System.out.println("tiger");
		
	}
	
}