import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int DB = sc.nextInt();
		
		System.out.print("���ڰ��� ���� : ");
		int ec = sc.nextInt();
		
		System.out.print("OS : ");
		int OS = sc.nextInt();
		
		System.out.print("��������� : ");
		int data = sc.nextInt();
		
		System.out.print("����Ʈ������� : ");
		int sw = sc.nextInt();
		
		int total = DB+ec+OS+data+sw;
		boolean result = DB>=8 && ec>=8 && OS>=8 && data>=8 && sw>=8 && total>=60;
		
		if(result) {
			System.out.println("�հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�!");
		}
	}

}
