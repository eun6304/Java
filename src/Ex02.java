import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//  키보드로 값 입력 받기
		int num =10;
		
		// 사용자로부터 값 입력 받기
		// 파이썬에서의 input()
		// Java 에서는 Scanner class
		// 1. Scanner class 불러오기
		Scanner sc = new Scanner(System.in);
		// import 3번째에 있는 java.util 선택
		// import 단축키 ctrl shift 'o'
		
		// 입력을 위한 안내 문구
		//System.out.print("정수 입력 : ");
		
		//값을 입력받는 코드
		//int number = sc.nextInt();
		
		//System.out.println("입력한 정수 : " + number);
		
		//산술연산자 예제
		System.out.print("첫번째 정수입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수입력 : ");
		int num2 = sc.nextInt();
		
		//ctrl alt 아랫방향
		System.out.println("두 수의 더하기 : " +  (num1+num2));
		System.out.println("두 수의 빼기 : " +  (num1-num2));
		System.out.println("두 수의 곱하기 : " +  num1*num2);
		System.out.println("두 수의 나누기(몫) : " +  num1/num2);
		

	}

}
