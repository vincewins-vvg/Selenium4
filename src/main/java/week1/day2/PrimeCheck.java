package week1.day2;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sn.nextInt();
		for (int i = 2	; i < input; i++) {
	
			if(input%i==0) {
				System.out.println("Number is 5not  prime: "+i);
			}
//	3
			else {
				System.out.println("Number is not prime");
			}
			}
			
		}

	}


