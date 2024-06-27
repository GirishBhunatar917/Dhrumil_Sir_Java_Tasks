public class pojo1{
	
	public static void main(String[]args) 
	{
		pojo p=new pojo();
		
		p.setId(1);
		p.setName("girish");
		p.setPhone_no(9173304);
		p.setAddress("Ahmedabad");
		p.setPincode(382430);
		
		System.out.println("id:"+p.getId());
		System.out.println("name:"+p.getName());
		System.out.println("phone no:"+p.getPhone_no());
		System.out.println("address:"+p.getAddress());
		System.out.println("pincode:"+p.getPincode());
		
		add a = new add();
		a.addition();
		sub b = new sub();
		b.substraction();
		div c = new div();
		c.division();
		mul d = new mul();
		d.multiplication();
		
		
		
		
		
		
	}
}