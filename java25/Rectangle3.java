package java25;


public class Rectangle3 {

	float l,w,p,area;
	
	Rectangle3(float l,float w){
		this.l=l;
		this.w=w;
	}
	public void area() {
		area=l*w;
	}
	public void p() {
		p=2*l+w;
	}
	
	
	public static void main(String[] args) {
		Rectangle3 r=new Rectangle3(10,10);
		r.area();
		r.p();
		
		
		System.out.println("Area is:"+r.area+"\n Perimeter is:"+r.p);	
		

	}

}
