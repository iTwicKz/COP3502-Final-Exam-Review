import java.util.Scanner;
class GeometricObject{
	protected boolean filled;
	protected String color;
	
	public GeometricObject(){
		filled = false;
		color = "blue";
	}
	
	public GeometricObject(boolean filled, String color){
		this.filled = filled;
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public boolean getFill(){
		return filled;
	}

	
}

class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
	}
	
	public Triangle(double side1, double side2, double side3, boolean filled, String color){
		super(filled, color);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	
	public double getArea(){
		if(side1 > side2 && side1 > side3){
			return side2*side3/2;
		}else if(side2 > side1 && side2 > side3){
			return side1*side3/2;
		}
		return side1*side2/2;
	}
	
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	public String toString(){
		return "Triangle: side 1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
}

public class Exercise11_1{
	public static void main(String[] args){
		
		System.out.println("Please input the three sides of your triangle:");
		Scanner input = new Scanner(System.in);
		double[] sidesOfTriangle = new double[3];
		for(int i = 0; i < sidesOfTriangle.length; i++){
			sidesOfTriangle[i] = input.nextDouble();
		}
		System.out.println("Is it filled or unfilled? True or False?");
		boolean fill = input.nextBoolean();
		System.out.println("What color is this shape?");
		String color = input.next();
		Triangle userTri = new Triangle(sidesOfTriangle[0], sidesOfTriangle[1], sidesOfTriangle[2], fill, color);
		
		System.out.println(userTri.toString());
		System.out.println("Perimeter: " + userTri.getPerimeter() + "\ncolor " + userTri.getColor() + "\nfilled: " + userTri.getFill() + "\narea: " + userTri.getArea());
		
		
	}
}













