import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		// 반복문 - while
		int i = 1;
		System.out.println("while을 이용한 " + number + "단은 다음과 같습니다.");
		while (i < 10) {
			System.out.println(number + "단: " + number * i);
			i++;
		}

		// 반복문 - for
		System.out.println("For을 이용한 " + number + "단은 다음과 같습니다.");
		for (i = 1; i < 10; i++) {
			System.out.println(number + "단: " + number * i);
		}

	}
}
