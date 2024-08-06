package Abstracts;
abstract class Sample extends Poduct{
	public void display() {
		System.out.println("We are not Overriding an abstract Methods");
	}
}
public class Productimp extends Poduct{
	public void newProduct() {
    	   System.out.println("my New Product");
       }
	public static void main(String[] args) {
	  Poduct p = new Productimp();
	  p.newProduct();
	  p.products();
	}

}
