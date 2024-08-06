package mypack;
class Employee{
	int eno;
	String ename;
	double sal;
	public Employee(){    //Default Constructor
		System.out.println("Default constructor");
	}
	public Employee(int eno,String ename,double sal)
	{//Parameter Constructor
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Employee Name is : "+ename);
		System.out.println("Employee number is : "+eno);
		System.out.println("Employee Salary is : "+sal);
	}
}
public class Constructor {

	public static void main(String[] args) {
		new Employee();
		Employee e1=new Employee(121,"AjayKumar",20000);
		e1.display();

	}

}
