package Interfaces;

public class Bookimp implements Book {
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
		Bookimp bl = new Bookimp();
		bl.bookname();
		bl.bookauthor();
		bl.bookprize();
		bl.display();

	}

}
