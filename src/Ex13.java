import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int hour = sc.nextInt();
		int basic_hour = 8;
		int basic_wage = 5000;
		float extra_wage = basic_wage*1.5f;
		int wage = hour*basic_wage;
		int extra_hour = hour-8;
		
		
		if(hour>basic_hour) {
			float totalwage = extra_hour*extra_wage + basic_hour*basic_wage;
			
			System.out.println("�� �ӱ��� " + (int)totalwage + "�� �Դϴ�.");
		}else {
			System.out.println("�� �ӱ��� " + hour*basic_wage + "�� �Դϴ�.");
		}
	}

}
