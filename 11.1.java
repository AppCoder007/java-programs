// test proGRAM  


import java.util.Scanner;

public class testTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side 1"+ " of triangle");
		double side1 = input.nextDouble();
		System.out.println("Enter the side 2"+" of triangle");
		double side2= input.nextDouble();
		System.out.println("Enter the side 3"+" of triangle");
		double side3= input.nextDouble();
		System.out.println("Enter the color of triangle ");
		String color = input.next();
		System.out.println("Enter true or false for filled or not ");
		boolean filled = input.hasNext();
		
		
Triangle triangle = new Triangle();
triangle.setSide1(side1);
triangle.setSide2(side2);
triangle.setSide3(side3);

GeometricObject geometricObject = new GeometricObject();
geometricObject.setColor(color);
geometricObject.setFilled(filled);

System.out.println("Area of triangle is "+triangle.getArea());
System.out.println("Perimeter of triangle is " + triangle.getPerimeter());
System.out.println("Color of triangle is " + geometricObject.getColor());
System.out.println("Filled property is " + geometricObject.isFilled());
	}

}
_______________________________________________________________________________________________________

// Triangle class


public class Triangle extends GeometricObject {
double side1=1,side2=1,side3=1;

public Triangle(){
	
}

public Triangle (double side1, double side2, double side3){
	
}

public double getSide1(double side1) {
	return side1;
}

public void setSide1(double side1) {
	this.side1 = side1;
}

public double getSide2(double side2) {
	return side2;
}

public void setSide2(double side2) {
	this.side2 = side2;
}

public double getSide3(double side3) {
	return side3;
}

public void setSide3(double side3) {
	this.side3 = side3;
}

double  getArea(){
	double sideLength =  ((side1 + side2 + side3)/2);
	double area =  Math.sqrt(sideLength*(sideLength - side1)*(sideLength - side2)*(sideLength - side3));
	return area;
}

double getPerimeter(){
	double perimeter = side1 + side2 + side2;
	return perimeter;
}


@Override
public String toString() {
	return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
}


}

_______________________________________________________________________________________________________________________________________________

// geometric object class


public class GeometricObject {
private String color = "WHITE";
private boolean filled;
private java.util.Date dateCreated;

// construct a default geometric object
public GeometricObject() {
	dateCreated = new java.util.Date();
}

// consrtuct the geometric object with color and filled value

public GeometricObject(String color, boolean filled){
	dateCreated = new java.util.Date();
	this.color = color;
	this.filled = filled;
}

// return color
public String getColor() {
	return color;
}

public void setColor(String color){
	this.color = color;
}

// return filled
public boolean isFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled = filled;
}
// get date created
public java.util.Date getDateCreated() {
	return dateCreated;
}
// return a String represting of this object
public String toString(){
	return "created on " + dateCreated + "\ncolor: " + color 
			+ " and filled; " + filled;
	}

}


__________________________________________________________________________________________________________________________________________
// output

Enter the side 1 of triangle
3
Enter the side 2 of triangle
4
Enter the side 3 of triangle
5
Enter the color of triangle 
red
Enter true or false for filled or not 
true
Area of triangle is 6.0
Perimeter of triangle is 11.0
Color of triangle is red
Filled property is true
