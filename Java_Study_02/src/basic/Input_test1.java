package basic;
import java.util.Scanner;

public class Input_test1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int number = scanner.nextInt();
		scanner.nextLine(); //이 문장 제거시 아래 Input이 스킵 됨.

		System.out.print("문장을 입력하세요: ");
		String sentence = scanner.nextLine();
		System.out.println("입력된 문장: " + sentence);
		
		System.out.println(number);
		scanner.close();
	}
}
