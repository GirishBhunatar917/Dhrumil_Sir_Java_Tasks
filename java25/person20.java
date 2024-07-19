package java25;

public class person20 {

	public static void main(String[] args) {
		person p=new person();
		p.setName("girish");
		p.setage(24);
		p.setCountry("india");
		
		System.out.println("name is:"+p.getName());
		System.out.println("age is:"+p.getage());
		System.out.println("country is:"+p.getCountry());
		
		p.setName("pinkesh");
		p.setage(26);
		p.setCountry("japan");
        
		System.out.println("After modifying");
		System.out.println("name is:"+p.getName());
		System.out.println("age is:"+p.getage());
		System.out.println("country is:"+p.getCountry());
	}

}
class person{
	private String name;
	private int age;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}