package java25;

public class dog2 {
	
	String Name;
	String breed;
	public dog2(String Name,String breed) {
		this.Name=Name;
		this.breed=breed;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public static void main(String[] args) {
		dog2 d1=new dog2("tommy","german sephard");
		dog2 d2=new dog2("lucy","bulldog");
		
		d1.setName("Rocky");
		d1.setBreed("sephard");
		d2.setName("Simba");
		d2.setBreed("bullydog");
		
		System.out.println("dog name:"+d1.getName()+"\ndog breed:"+d1.getBreed());
		System.out.println("dog name:"+d2.getName()+"\ndog breed:"+d2.getBreed());
		
	}
		
        
}
	