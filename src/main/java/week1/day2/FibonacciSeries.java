package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {
	//012345679
	//0, 1, 1, 2, 3, 5, 8, 13, 21

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=0,num2=1,sum;
		System.out.println(num1);
		
		for (int i = 2; i <= 11; i++) {
			sum = num1+num2;
			
			num1=num2;
			num2=sum;
			System.out.println(sum);
			
			
		}
	}

}
