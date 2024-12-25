package exphandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Specificcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("division operation");
			System.out.println("enter the numerator");
            int num=sc.nextInt();
            System.out.println("enter the denomenator");
            int den=sc.nextInt();
            int res=num/den;
            System.out.println(res);
            System.out.println("Array operation");
            System.out.println("enter size of the array");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the position numeber");
            int pos=sc.nextInt();
            System.out.println("enter the value to be addded");
            int val=sc.nextInt();
            arr[pos]=val;
            System.out.println("data added");
            
		}
  	catch(InputMismatchException e1) {
			System.out.println("input is invalid");
			
		}
		catch(ArithmeticException e2) {
			System.out.println("ArithmaticException is occred");
			
			
		}
		catch(NegativeArraySizeException e3) {
			System.out.println("array size cannot be negative"); 			
		
		
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("specific index is out of range");
		
			
	}
		catch(Exception e) {
			System.out.println("Exception handeled in generic method");
		

}
		finally {
			System.out.println("successfully  executed");
			
	}
	}
}
