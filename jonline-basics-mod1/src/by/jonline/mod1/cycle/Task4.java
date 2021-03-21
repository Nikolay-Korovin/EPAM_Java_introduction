package by.jonline.mod1.cycle;

import java.math.BigInteger;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {

	public static void main(String[] args) {
		
		BigInteger bigNum = BigInteger.valueOf(1);
		
		for(int i = 1; i <= 200; i++) {
			
			bigNum = bigNum.multiply(BigInteger.valueOf(i * i));
					
		}
		
		System.out.print(bigNum);
		
	}

}
