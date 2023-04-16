package JAVA;

public class Abstractionimplementation {
	
	
	 public static void main(String[] args) {
	        Circle circle = new Circle(5.0);
	        System.out.println("Circle area: " + circle.getArea());
	        System.out.println("Circle perimeter: " + circle.getPerimeter());
	    }
	}
	
	


	// Abstraction class
	abstract class Shape {
	    // Abstract methods
	    abstract double getArea();
	    abstract double getPerimeter();
	}

	// Concrete class that implements the Shape abstraction
	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    public double getPerimeter() {
	        return 2 * Math.PI * radius;
	    }
	}

	
	   




