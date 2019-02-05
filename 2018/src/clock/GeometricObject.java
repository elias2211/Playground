package clock;

public class GeometricObject {
	private String color = "white";
	private boolean filled = true;
	private java.util.Date dateCreated;
	private String random = "I see that it works";
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public GeometricObject(String color, boolean filled, String random) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
		this.random = random;
	}
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;		
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	public void hey() {
		System.out.println("This the the superclass");
	}
}
