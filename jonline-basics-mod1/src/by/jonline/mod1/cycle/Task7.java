package by.jonline.mod1.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

public class Task7 {

	public static void main(String[] args) throws IOException{

		int n = 0;
		int m = 0;
		int num;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("введите первое число промежутка натуральных чисел (целое положительное)");

		try {
			m = Integer.parseInt(reader.readLine());
			if (m <= 0) {
				System.out.println("целое положительное пожалуйста");
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("целое положительное пожалуйста");
		} 

		System.out.println("введите последнее число промежутка натуральных чисел (целое положительное)");

		try {
			n = Integer.parseInt(reader.readLine());
			if (n <= 0) {
				System.out.println("целое положительное пожалуйста");
				return;
			} else if (n < m) {
				System.out.println("последнее число промежутка должно быть больше его начального ");
			}
		} catch (NumberFormatException e) {
			System.out.println("целое положительное пожалуйста");
		} 
		
		reader.close();

		num = (n - m) + 1;
		
		int cycleN = m;
		
		for (int i = 0; i < num; i++) {
			System.out.println("делители для: " + cycleN);
			for (int j = 2; j < cycleN; j++) {
				if (cycleN % j == 0) {
					System.out.println(":" + j);
				}
			}
			cycleN++;
		}
		
	}
	
	

}
