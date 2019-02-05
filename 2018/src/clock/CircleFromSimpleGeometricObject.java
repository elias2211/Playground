package clock;

public class CircleFromSimpleGeometricObject extends GeometricObject {
	private double radius;
	
	/**The number objects created */
	private static int numberOfObjects = 0;
	
	public CircleFromSimpleGeometricObject() {
		this(1);
	}
	
	public CircleFromSimpleGeometricObject(double radius) {
		this.radius = radius;
	}
	
	public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) 
		throws IllegalArgumentException{
			if(newRadius >=0)
				radius = newRadius;
			else
				throw new IllegalArgumentException("Radius cannot be negative");
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public void printCircle() {
		System.out.println("The cirlce is created " + getDateCreated() + " and the radius is " + radius);
	}
	
	public String toString() {
		return super.toString() + " and the radius is " + radius;
	}
	
	public boolean equals(Object circle) {
		if(circle instanceof CircleFromSimpleGeometricObject)
			return radius == ((CircleFromSimpleGeometricObject)circle).radius;
		else
			return this == circle;
	}
	
	
}
