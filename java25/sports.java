package java25;

public class sports {

	public static void main(String[] args) {
		Sports sport1 = new Football();
	     Sports sport2 = new Basketball();
	     Sports sport3 = new Rugby();

	     sport1.play(); 
	     sport2.play(); 
	     sport3.play(); 


	}

}


class Sports {
 public void play() {
     System.out.println("Playing generic sport.");
 }
}


class Football extends Sports {
 @Override
 public void play() {
     System.out.println("Playing football: Kick-off!");
 }
}


class Basketball extends Sports {
 @Override
 public void play() {
     System.out.println("Playing basketball: Shoot the hoop!");
 }
}

class Rugby extends Sports {
 @Override
 public void play() {
     System.out.println("Playing rugby: Scrum down!");
 }
}


      

