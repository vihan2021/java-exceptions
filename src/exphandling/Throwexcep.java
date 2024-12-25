package exphandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throwexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		try {
		  ShowException();
		}
		catch(Exception e)
		{
			System.out.println("Exception from different function : "+e);
		}
	}
		static void ShowException() {
			try {
		    Scanner se=new Scanner(System.in);
			System.out.println("enter the numerator:");
			int num=se.nextInt();
			System.out.println("enter the denamenator:");
			int den=se.nextInt();
			int  res=num/den;
			System.out.println("the res is:"+res);
			}
			catch(ArithmeticException e)
			{
				throw new ArithmeticException("enter any number except Zero");
				
			}catch(InputMismatchException e) {
			throw e;
			}
		
		}
		
	}

	