package by.jonline.mod1.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, ����� ������� � ������ �����.
//m � n �������� � ����������.

public class Task7 {

	public static void main(String[] args) throws IOException{

		int n = 0;
		int m = 0;
		int num;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������� ������ ����� ���������� ����������� ����� (����� �������������)");

		try {
			m = Integer.parseInt(reader.readLine());
			if (m <= 0) {
				System.out.println("����� ������������� ����������");
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("����� ������������� ����������");
		} 

		System.out.println("������� ��������� ����� ���������� ����������� ����� (����� �������������)");

		try {
			n = Integer.parseInt(reader.readLine());
			if (n <= 0) {
				System.out.println("����� ������������� ����������");
				return;
			} else if (n < m) {
				System.out.println("��������� ����� ���������� ������ ���� ������ ��� ���������� ");
			}
		} catch (NumberFormatException e) {
			System.out.println("����� ������������� ����������");
		} 
		
		reader.close();

		num = (n - m) + 1;
		
		int cycleN = m;
		
		for (int i = 0; i < num; i++) {
			System.out.println("�������� ���: " + cycleN);
			for (int j = 2; j < cycleN; j++) {
				if (cycleN % j == 0) {
					System.out.println(":" + j);
				}
			}
			cycleN++;
		}
		
	}
	
	

}
