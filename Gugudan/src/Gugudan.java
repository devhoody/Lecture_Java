import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		// �ݺ��� - while
		int i = 1;
		System.out.println("while�� �̿��� " + number + "���� ������ �����ϴ�.");
		while (i < 10) {
			System.out.println(number + "��: " + number * i);
			i++;
		}

		// �ݺ��� - for
		System.out.println("For�� �̿��� " + number + "���� ������ �����ϴ�.");
		for (i = 1; i < 10; i++) {
			System.out.println(number + "��: " + number * i);
		}

	}
}
