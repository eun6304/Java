import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��ϼ���. : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ���. : ");
		int num2 = sc.nextInt();
		
		if(num1>=num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}

}
