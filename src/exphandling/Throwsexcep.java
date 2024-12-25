package exphandling;

public class Throwsexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkage(2);

	}
	static void checkage(int age)throws ArithmeticException{
		if(age<18)
		{
			throw new ArithmeticException("you must be 18 or above 18 to vote");
			
		}
		else {
			System.out.println("you are eligible to vote");
		}
	}
}


