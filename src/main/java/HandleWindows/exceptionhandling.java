package HandleWindows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling {

	public static void main(String[] args) {
		try{
			Scanner s1= new Scanner (System.in);
		
       System.out.println("please enter your age");
       int age= s1.nextInt();
		}
       catch(InputMismatchException A1) {
		System.out.println("sorry check it again it is not age");
	}
	}
}
