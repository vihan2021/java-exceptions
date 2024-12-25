package exphandling;

import java.util.Scanner;

public class Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se=new Scanner(System.in);
		System.out.println("enter the numerator:");
		int num=se.nextInt();
		System.out.println("enter the denamenator:");
		int den=se.nextInt();
		float res=num/den;
		System.out.println(res);
		

	}

}
