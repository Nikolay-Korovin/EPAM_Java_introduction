package by.jonline.mod1.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�������� ���������, ��� ������������ ������ ����� ����� ������������� �����. � ��������� ���������
//��� ����� �� 1 �� ���������� ������������� �����

public class Task1 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int a = 0;
		int b = 0;

		System.out.println("������� ����� ������������� ����� >> ");

		try {
			a = Integer.parseInt(reader.readLine());
			if (a <= 0) {
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

		for (int i = 1; i <= a; i++) {

			b = b + i;

		}

		System.out.println("����� ���� ����� �� 1 �� " + a + " = " + b);

	}

}
