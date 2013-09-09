package Numbers;

import java.math.RoundingMode;
import java.math.BigDecimal;
import java.util.Scanner;

public class costOfTile {
	
	private static float squareFootageCalc(float x, float y){
		return x*y;
	}
	
	private static float costOfTile(float floorSquareFootage, float tileSquareFootage, float costPerTile){
		BigDecimal tilesNeeded = new BigDecimal(floorSquareFootage/tileSquareFootage);
		tilesNeeded = tilesNeeded.setScale(0,RoundingMode.UP);
		float totalCost = tilesNeeded.floatValue()*costPerTile;
		
		return totalCost;
	}

	public static void main(String[] args){
		System.out.println("Enter Size of the Room, Size of the Tile, and Price per tile all seperated by spaces: ");
		System.out.println("Ex: 10 12 1 1 14.99 for Room size of 10x12, Tile size of 1x1 and price of $14.99");
		Scanner scanInput = new Scanner(System.in);
		float roomX = scanInput.nextFloat();
		float roomY = scanInput.nextFloat();
		float tileX = scanInput.nextFloat();
		float tileY = scanInput.nextFloat();
		float tilePrice = scanInput.nextFloat();
		System.out.println("Total Cost: ");
		System.out.printf("%.2f",costOfTile(squareFootageCalc(roomX,roomY),squareFootageCalc(tileX,tileY),tilePrice));
	}
}
