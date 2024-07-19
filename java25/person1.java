package java25;

public class person1 {
 
	String Name;
	int age;
	public person1(String Name,int age) {
		this.Name=Name;
		this.age=age;
	}
	public static void main(String[] args) {
		person1 p1=new person1("girish",24);
		person1 p2=new person1("pinkesh",26);
		
		System.out.println("name is:"+p1.Name+"age is:"+p1.age);
		System.out.println("name is:"+p2.Name+"age is:"+p2.age);

	}

}
