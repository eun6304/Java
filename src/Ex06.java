import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		int result = num1%5 == 0 ? num1/5 : num1/5+1;
		System.out.println("�ʿ��� ������ �� : " + result);
	}

}
