package by.jonline.mod1.cycle;

//���� �������� ��� T � ��������� ����� E. ����� ����� ��� ������ ����, ������ ������� ������ ��� �����
//��������� �. 

public class Task5 {

	public static void main(String[] args) {

		double sum = 0;
		float e = 0.1f;
		short t = 5;
		double[] mas = new double[t];

		System.out.println("�������� �������� = " + e);
		
		System.out.println("��� ����: ");

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i)); // ����� ���� ���� ����� ���

		}

		for (double a : mas) {
			System.out.println(a);
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}

		System.out.println("����� ������ ����, ��� ������ ������ ��� ����� ��������� �������� = " + sum);

	}

}
