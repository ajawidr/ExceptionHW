package homeWork;

public class ExceptionNullpoint {

	public static void main(String[] args) {
		
		System.out.println("main method");
		String s=null;
		int a=1;
		int b=0;
		
		
		try {
			
			int c=a/b;
			System.out.println(s.contentEquals("abc"));
		}
		catch(NullPointerException ne)
		{
			ne.printStackTrace();
			System.out.println("Exception 1");
		}
		catch (ArithmeticException ae)
		{
			ae.printStackTrace();
			System.out.println("Exception 2");
		}
		
		System.out.println("End of method");
	}
	

}
