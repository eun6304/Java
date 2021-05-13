import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// ctrl + d 한줄지우기
		/*
		int i = 3;
		int j = 10;
		
		System.out.println(i == j ? "같다" : "다르다");
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력  : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력  : ");
		int num2 = sc.nextInt();
		System.out.println("두 수의 차 : " + (num1 > num2 ? num1 - num2 :  num2 -  num1));
	}

}
