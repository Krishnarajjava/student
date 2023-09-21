package prepertion5;

public class Excep {

	public static void main(String[] args) {
		String[] a= {"Krish","Shabir","Vijay"};
		try {
		System.out.println(a[8].charAt(9));
		}
		catch(StringIndexOutOfBoundsException b) {
			System.out.println("String Index Not Found");
		}
		catch(IndexOutOfBoundsException c) {
			System.out.println("Index Not Found");
			System.out.println(c);
			c.printStackTrace();
	    }
		catch(RuntimeException d) {
			System.out.println("RunTime Exception");
		}
		catch(Exception g) {
			System.out.println("Exception");
	   }
		finally {
			System.out.println("Thank you");
		}
		
		
	}
}
