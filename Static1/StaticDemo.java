package Static1;

public class StaticDemo {
   static {
	   System.out.println("Static Block");
   }
   public void display() {
	   System.out.println("Dispaly Method");
   }
	public static void main(String[] args) {
		
StaticDemo st = new StaticDemo();
st.display();
	}

}
