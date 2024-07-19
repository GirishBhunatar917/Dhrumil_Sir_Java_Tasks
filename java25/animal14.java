package java25;

public class animal14 {

	public static void main(String[] args) {
		lions l= new lions();
		l.eat();
		l.sleep();
		tigers t= new tigers();
		t.eat();
		t.sleep();
		deers d= new deers();
		d.eat();
		d.sleep();

	}

}
abstract class a{
	
	abstract void eat();
	abstract void sleep();
}

class lions extends a{

	@Override
	void eat() {
		System.out.println("lion is eating");
		
	}

	@Override
	void sleep() {
		System.out.println("lion is sleeping");
		
	}

	
	
}

class tigers extends a{

	@Override
	void eat() {
		System.out.println("tiger is eating");
		
	}

	@Override
	void sleep() {
		System.out.println("tiger is sleeping");
		
	}

	
	
}
class deers extends a{

	@Override
	void eat() {
		System.out.println("deer is eating");
		
	}

	@Override
	void sleep() {
		System.out.println("deer is sleeping");
		
	}

	
	
}

