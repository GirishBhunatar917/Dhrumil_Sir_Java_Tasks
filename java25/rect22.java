package java25;

public class rect22 {

	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0); 
        
        System.out.println("Initial Dimensions:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        
        rectangle.setLength(7.0);
        rectangle.setWidth(4.0);

     
        System.out.println("\nModified Dimensions:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

	}

}

class Rectangle {
    
    private double length;
    private double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    public double getLength() {
        return length;
    }

    
    public void setLength(double length) {
        this.length = length;
    }

    
    public double getWidth() {
        return width;
    }

   
    public void setWidth(double width) {
        this.width = width;
    }

   
    public double calculateArea() {
        return length * width;
    }

    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
