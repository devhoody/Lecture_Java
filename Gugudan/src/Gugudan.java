import java.util.Scanner;

public class Gugudan {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� ��?");
		int times = sc.nextInt();
		
		for(int j = 2; j<= times; j++) {
			for(int i= 1; i<= times; i++) {
				System.out.printf("%d * %d = %d\n", j, i, j*i);
			}
		}
	}
}
