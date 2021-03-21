package by.jonline.mod1.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Даны два числа.Определить цифры,входящие в запись как первого так и второго числа.

public class Task8 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("введите два целых положительных числа");

		try {
			a = Integer.parseInt(reader.readLine());
			if (a <= 0) {
				System.out.println("Введите целое положительное число");
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("Введите целое положительное число");
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			b = Integer.parseInt(reader.readLine());
			if (b <= 0) {
				System.out.println("Введите целое положительное число");
				return;
			}
			reader.close();
		} catch (NumberFormatException e) {
			System.out.println("Введите целое положительное число");
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}

		int quotientA;
		int quotientB;
		int numberOfNumbers;
		while (a != 0) {
			quotientA = a % 10;
			a /= 10;
			numberOfNumbers = b;
			while (numberOfNumbers != 0) {
				quotientB = numberOfNumbers % 10;
				numberOfNumbers /= 10;
				if (quotientA == quotientB) {
					System.out.println(quotientA + " входит в запись как первого так и второго числа");
					break;
				}
			}
		}

	}

}
