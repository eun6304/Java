import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		System.out.println(totalSecond/3600+"시 "+totalSecond%3600/60+"분 "+totalSecond%60+"초");
		
		int hap = 0, j = 0, k = 0, L = 0;
		hap = ++j + k++ + ++L;
		System.out.println(hap+","+j+','+k+","+L);
		
		int a = 3, b = 4, c = 5, d = 5;
		a += 6 + --b;
		d *= 7 - c++;
		
		System.out.println(a + "," + b + "," + c + "," + d);
	}
}