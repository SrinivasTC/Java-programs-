package JAVA;

public class Methodoverloadingandmethodoverriding {

	
		// TODO Auto-generated method stub

	
	 public static void main(String[] args) {
	        Parent parent = new Parent();
	        Child child = new Child();

	        parent.doSomething(10);
	        parent.doSomething("hello");

	        child.doSomething(10);
	        child.doSomething("hello");
	    }

	}

	class Parent {
	    public void doSomething(int x) {
	        System.out.println("Parent's doSomething(int): " + x);
	    }

	    public void doSomething(String s) {
	        System.out.println("Parent's doSomething(String): " + s);
	    }
	}

	class Child extends Parent {
	    // method overriding
	    public void doSomething(String s) {
	        System.out.println("Child's doSomething(String): " + s);
	    }

	    // method overloading
	    public void doSomething(double d) {
	        System.out.println("Child's doSomething(double): " + d);
	    }
	




}


