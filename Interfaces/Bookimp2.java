package Interfaces;

public class Bookimp2 implements Book {
	public void bookname() {
		System.out.println("Book Name Is: Java");
	}
    public void bookauthor() {
    	System.out.println("Book Author is: James  ");
    	
    }
    public void bookprize() {
    	System.out.println("Book Prize is 550");
    	
    }
    public void display() {
    	System.out.println("Local Method");
    }
	public static void main(String[] args) {
		Book bl = new Bookimp2();
		bl.bookname();
		bl.bookauthor();
		bl.bookprize();
		Bookimp2 b2 = new Bookimp2();
		b2.display();

	}

}
