package Interfaces;

public class Bookimp3 implements Book ,NewBook{
	public void bookname() {
		System.out.println("Book Name Is: Java");
	}
    public void bookauthor() {
    	System.out.println("Book Author is: James  ");
    	
    }
    public void bookprize() {
    	System.out.println("Book Prize is 550");
    	
    }
    public void newBookName() {
    	System.out.println("New Book Name Is Python");
    }
    public void display() {
    	System.out.println("Local Method");
    }
	public static void main(String[] args) {
		Bookimp3 bl = new Bookimp3();
		bl.bookname();
		bl.bookauthor();
		bl.bookprize();
		bl.display();
		bl.newBookName();

	}

}
