package Numbers;

import java.util.Scanner;

public class nextPrimeNumber {

	private static boolean isPrime(int number){
		for(int i = 2; i<number; i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continueFlag = true;
		int currentCheck= 2;
		Scanner scanInput = new Scanner(System.in);
		
		System.out.println("Welcome to the Prime Number Generator, where the prime number counts up until you tell it to stop!");
		while(continueFlag){
			if(isPrime(currentCheck)){
				System.out.println("Prime: "+currentCheck);
				System.out.println("Would you like to continue (Y/N)");
				
				String scannedInput = scanInput.nextLine();
				
				if(scannedInput.equals("n") || scannedInput.equals("N")){
					continueFlag = false;
				}
			}
			currentCheck++;
		}
		scanInput.close();
		System.out.println("Thank you, Goodbye!");
	}

}
