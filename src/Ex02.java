import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//  Ű����� �� �Է� �ޱ�
		int num =10;
		
		// ����ڷκ��� �� �Է� �ޱ�
		// ���̽㿡���� input()
		// Java ������ Scanner class
		// 1. Scanner class �ҷ�����
		Scanner sc = new Scanner(System.in);
		// import 3��°�� �ִ� java.util ����
		// import ����Ű ctrl shift 'o'
		
		// �Է��� ���� �ȳ� ����
		//System.out.print("���� �Է� : ");
		
		//���� �Է¹޴� �ڵ�
		//int number = sc.nextInt();
		
		//System.out.println("�Է��� ���� : " + number);
		
		//��������� ����
		System.out.print("ù��° �����Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° �����Է� : ");
		int num2 = sc.nextInt();
		
		//ctrl alt �Ʒ�����
		System.out.println("�� ���� ���ϱ� : " +  (num1+num2));
		System.out.println("�� ���� ���� : " +  (num1-num2));
		System.out.println("�� ���� ���ϱ� : " +  num1*num2);
		System.out.println("�� ���� ������(��) : " +  num1/num2);
		

	}

}
