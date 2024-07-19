package java25;

public class animal18 {

	public static void main(String[] args) {
		dog d= new dog();
		d.bark();
		

	}

}

interface creature{
	
	void bark();
	
}

class dog implements creature{

	@Override
	public void bark() {
		System.out.println("dog is barking");
		
	}	
}
