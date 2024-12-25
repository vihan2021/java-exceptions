package exphandling;
class MyException extends Exception{
	public MyException(String s)
	{
		super(s);
		
	}
}
/*
class SaiExcep extends Throwable{
	public SaiExcep(int a);
	{
		super(a);
	}
}
*/

public class Customexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("new Exception");
			
			
		}
		catch(MyException ex)
		{
			System.out.println("Exception caught");
			System.out.println(ex.getMessage());
			Syste.out.println()
		}
		

	}

}
