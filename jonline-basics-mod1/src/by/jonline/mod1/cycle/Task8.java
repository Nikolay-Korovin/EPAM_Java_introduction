package by.jonline.mod1.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� ��� �����.���������� �����,�������� � ������ ��� ������� ��� � ������� �����.

public class Task8 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������� ��� ����� ������������� �����");

		try {
			a = Integer.parseInt(reader.readLine());
			if (a <= 0) {
				System.out.println("������� ����� ������������� �����");
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("������� ����� ������������� �����");
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			b = Integer.parseInt(reader.readLine());
			if (b <= 0) {
				System.out.println("������� ����� ������������� �����");
				return;
			}
			reader.close();
		} catch (NumberFormatException e) {
			System.out.println("������� ����� ������������� �����");
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
					System.out.println(quotientA + " ������ � ������ ��� ������� ��� � ������� �����");
					break;
				}
			}
		}

	}

}
