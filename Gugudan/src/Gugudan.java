import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {

//		System.out.println("2��");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//		
//		System.out.println("3��");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
//		
//		
//		System.out.println("4��");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
//		
//		System.out.println("5��");
//		result = 5 * 1;
//		System.out.println(result);
//		result = 5 * 2;
//		System.out.println(result);
//		result = 5 * 3;
//		System.out.println(result);
//		result = 5 * 4;
//		System.out.println(result);
//		result = 5 * 5;
//		System.out.println(result);
//		result = 5 * 6;
//		System.out.println(result);
//		result = 5 * 7;
//		System.out.println(result);
//		result = 5 * 8;
//		System.out.println(result);
//		result = 5 * 9;
//		System.out.println(result);
		
		System.out.println("���ϴ� ��?:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println(number+"���� ������ �����ϴ�.");
		System.out.println(number +"��: " + number * 1);
		System.out.println(number +"��: " + number * 2);
		System.out.println(number +"��: " + number * 3);
		System.out.println(number +"��: " + number * 4);
		System.out.println(number +"��: " + number * 5);
		System.out.println(number +"��: " + number * 6);
		System.out.println(number +"��: " + number * 7);
		System.out.println(number +"��: " + number * 8);
		System.out.println(number +"��: " + number * 9);
		
		int i =1;
		System.out.println("while�� �̿��� "+number+"���� ������ �����ϴ�.");
		while(i<10) {
			System.out.println(number +"��: " + number * i);
			i++;
		}
		
		System.out.println("For�� �̿��� "+number+"���� ������ �����ϴ�.");
		for(i=1; i<10; i++) {
			System.out.println(number +"��: " + number * i);
		}
		
	}
}
