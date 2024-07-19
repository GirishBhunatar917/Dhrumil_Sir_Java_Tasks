package java25;

public class vehicle16 {

	public static void main(String[] args) {
		car c= new car();
		c.startengine();
		c.stopengine();
		motorcycle m=new motorcycle();
		m.startengine();
		m.stopengine();

	}

}
 
abstract class vehicle{
	
	abstract void startengine();
	abstract void stopengine();
	
}

class car extends vehicle{

	@Override
	void startengine() {
		System.out.println("car engine started");
		
	}

	@Override
	void stopengine() {
		System.out.println("car engine stopped");
	}
	
	
}
class motorcycle extends vehicle{

	@Override
	void startengine() {
		System.out.println("motorcycle engine started");
		
	}

	@Override
	void stopengine() {
		System.out.println("motorcycle engine stopped");
		
	}
	
}