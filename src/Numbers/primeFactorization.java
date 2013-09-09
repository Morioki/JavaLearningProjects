package Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class primeFactorization {

	private static boolean isPrime(int number){
		
		if(number == 1) return false;
		
		for(int i = 2; i<number; i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}
	
	private static ArrayList<Integer> findFactors(Integer number){
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for(int i = 1; i<=number;i++){
			if(number%i==0){
				factors.add(i);
			}
		}
		
		return factors;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a number and the prime factors(if any) will be returned:");
		Scanner scanInput = new Scanner(System.in);
		Integer number = scanInput.nextInt();
		scanInput.close();
		
		ArrayList<Integer> factorList = new ArrayList<Integer>(findFactors(number));
		System.out.println("Factors: "+factorList);
		System.out.print("Primes: ");
		for(Integer factor : factorList){
			if(isPrime(factor)){
				System.out.print(factor+" ");
			}
		}
	}

}
