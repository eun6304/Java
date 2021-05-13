import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는? : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자 입니다.");
		}
	}

}
