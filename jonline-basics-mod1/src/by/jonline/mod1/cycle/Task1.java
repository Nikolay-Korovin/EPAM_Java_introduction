package by.jonline.mod1.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Напишите программу, где пользователь вводит любое ЦЕЛОЕ ПОЛОЖИТЕЛЬНОЕ ЧИСЛО. А программа суммирует
//все числа от 1 до введенного пользователем числа

public class Task1 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int a = 0;
		int b = 0;

		System.out.println("Введите целое положительное число >> ");

		try {
			a = Integer.parseInt(reader.readLine());
			if (a <= 0) {
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

		for (int i = 1; i <= a; i++) {

			b = b + i;

		}

		System.out.println("Сумма всех чисел от 1 до " + a + " = " + b);

	}

}
