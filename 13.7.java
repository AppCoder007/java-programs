
public class testColorable {

	public static void main(String[] args) {

		
		GeometricObject[] shapes = new GeometricObject[5];
		 	shapes[0] = new Rectangle();
	        shapes[1] = new circle();
	        shapes[2] = new Square();
	        shapes[3] = new cube();
	        shapes[4] = new Ellipse();
	        
	        for (int i = 0; i < shapes.length; i++) {

	        	System.out.println("shape "  + (i + 1)+ " " +  shapes[i].getArea());
	        	((Colorable) shapes[i]).howToColor();
	}

}
}

------------------------------------------------------------------------------------------------------------------------------

public interface Colorable {
public  void howToColor();
}

---------------------------------------------------------------------------------------------------------------------------
public abstract class GeometricObject {
private String color = "WHITE";
private boolean filled;
private java.util.Date dateCreated;


public GeometricObject() {
	dateCreated = new java.util.Date();
}



public GeometricObject(String color, boolean filled){
	dateCreated = new java.util.Date();
	this.color = color;
	this.filled = filled;
}


public String getColor() {
	return color;
}

public void setColor(String color){
	this.color = color;
}


public boolean isFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled = filled;
}

public java.util.Date getDateCreated() {
	return dateCreated;
}


public String toString(){
	return "created on " + dateCreated + "\ncolor: " + color 
			+ " and filled; " + filled;
	}



public  void howToColor() {
	System.out.println("Color all  sides");	

}

		




public String getArea() {
	// TODO Auto-generated method stub
	return null;
}

}

-----------------------------------------------------------------------------------------------


public class Rectangle extends GeometricObject implements Colorable{
	private int length = 20;
	private int breath = 10;
	private double area;
	
public  Rectangle(){
	 
}

public String getArea() {
	area = length*breath;
	return "area = " + area;
}

public double setArea(double area) {
	
	return area;
}


public void howToColor(){
	System.out.println("color all four sides");
}
}
-----------------------------------------------------------------------------------------------------------------------------


public class circle extends GeometricObject implements Colorable{
	private double area;

	public circle(){
		
	}
	
	
	public String getArea() {
		area = 2*Math.PI*10;
		return "area = " + area;
	}

	@Override
	public void howToColor() {
		System.out.println("Color one sides");		
	}
	

}
-----------------------------------------------------------------------------------------------------------------------------


public class Square extends GeometricObject implements Colorable{
	private double area;
	
	
	public String getArea() {
		area = 10*10;
		return "area = " + area;
	}


	@Override
	public void howToColor() {
		System.out.println("Color all four sides");

	
		
	}
}
--------------------------------------------------------------------------------------------------------------------


public class cube extends GeometricObject implements Colorable {


	private double area;

	public String getArea() {
		area = 10*10*10;
		return "area = " + area;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all six sides");		
	}
}
----------------------------------------------------------------------------------


public class Ellipse extends GeometricObject implements Colorable{
	private double area;


	public Ellipse(){
		
	}
	
	public String getArea() {
		area = 10*20*Math.PI;
		return "area = " + area;
	}
	
	@Override
	public void howToColor() {
				System.out.println("Color one side");
	}

}
-------------------------------------------------------------------------------------------------------------
OUTPUT:

shape 1 area = 200.0
color all four sides
shape 2 area = 62.83185307179586
Color one sides
shape 3 area = 100.0
Color all four sides
shape 4 area = 1000.0
Color all six sides
shape 5 area = 628.3185307179587
Color one side
