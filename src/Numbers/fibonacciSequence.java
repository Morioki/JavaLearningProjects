package Numbers;

import java.util.Scanner;


public class fibonacciSequence {

	private static int fibonacci(int fOne, int fTwo, int maxVal ){
		
		int nextFibVal = fOne + fTwo;
		
		if(nextFibVal >= maxVal){
			return maxVal;
		}
		
		System.out.print(nextFibVal+" ");
		
		return fibonacci(fTwo,nextFibVal,maxVal);
	}
	
	private static void fibonacciWrapper(int maxNumber){
		
		System.out.print("Fibonacci Sequence: 0 1 ");
		fibonacci(0,1,maxNumber);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the max Value you want to follow the Fibonacci Sequence to: ");
		Scanner scanInput = new Scanner(System.in);
		Integer number = scanInput.nextInt();
		scanInput.close();
		//if(number > 2000000000) number = 2000000000;
		
		fibonacciWrapper(number);
	}

}
