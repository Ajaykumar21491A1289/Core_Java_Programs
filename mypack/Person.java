package mypack;

public class Person {
     String name = "Ajay";
     int age = 21;
     public void display() {
    	 System.out.println("Name "+name);
    	 System.out.println("Age "+age);
     }
	public static void main(String[] args) {
		
      Person p=new Person();
      p.display();
	}

}
