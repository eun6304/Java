import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int DB = sc.nextInt();
		
		System.out.print("전자계산기 구조 : ");
		int ec = sc.nextInt();
		
		System.out.print("OS : ");
		int OS = sc.nextInt();
		
		System.out.print("데이터통신 : ");
		int data = sc.nextInt();
		
		System.out.print("소프트웨어공학 : ");
		int sw = sc.nextInt();
		
		int total = DB+ec+OS+data+sw;
		boolean result = DB>=8 && ec>=8 && OS>=8 && data>=8 && sw>=8 && total>=60;
		
		if(result) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}
	}

}
