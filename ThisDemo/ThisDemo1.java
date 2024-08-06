package ThisDemo;
class Student{
	int rollno;
	String name;
	//Student(){}
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name = name;
	}
	void display() {
		System.out.println("Roll no is "+rollno);
		System.out.println("Name is "+name);
	}
}
public class ThisDemo1 {

	public static void main(String[] args) {
		Student s = new Student(10,"Ajay");
		Student s2 = new Student(10,"Ajay");
		s.display();
		


	}

}
