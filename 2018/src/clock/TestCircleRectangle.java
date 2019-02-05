package clock;

public class TestCircleRectangle {
	public static void main(String[] args) {
	/**	//Create a circle object
		CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(-1);
		//Print out the circle object information
		System.out.println("A cirlce " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The Area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		circle.hey();
		*/
		try {
			CircleFromSimpleGeometricObject circle3 = new 
					CircleFromSimpleGeometricObject(-5);
			CircleFromSimpleGeometricObject circle4 = new 
					CircleFromSimpleGeometricObject(5);
			CircleFromSimpleGeometricObject circle5 = new 
					CircleFromSimpleGeometricObject(0);
			
			circle4.toString();
		}
		
		catch (IllegalArgumentException ex){
			System.out.println(ex);
		}
	
		
		//Create a rectangle object
		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
		
		//Create an object of GeometricObject class
		GeometricObject geometricObject = new GeometricObject();
		System.out.println("\nPrint the Geometricobject class toString method: \n" + geometricObject.toString());
		GeometricObject parentObject = new GeometricObject();
		System.out.println("This is the parent classs object: \n" + parentObject.toString());
		//Create an object of Person class
		Person firstPerson = new Person("Elias", 30);
		System.out.println(firstPerson.toString());
		System.out.println("My name is " + firstPerson.getName() + " and my age is "
				+ firstPerson.getAge() + ".");
		
		TestToStringMethodReturnType test = new TestToStringMethodReturnType();
		
		System.out.println(test.toString());
		
		//Polymorphism
		CircleFromSimpleGeometricObject circle2 = new CircleFromSimpleGeometricObject();
		circle2.setRadius(20);
		System.out.println(circle2.getRadius());
		displayObject(circle2);
		
		Object o = new GeometricObject();
		System.out.println("woowoowowo " + o.toString());
		
	}
	
	public static void displayObject(GeometricObject object) {
		object.setColor("Purple");
		System.out.println("Created on " + object.getDateCreated() + ", Color "
				+ "is " + object.getColor());
		
	}

}
