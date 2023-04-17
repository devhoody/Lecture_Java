package part3.ex4.UI�ڵ�и��ϱ�;

import java.util.Scanner;

public class ExamConsole {
	
	private ExamList list;
	
	public ExamConsole() {
		list = new ExamList();
	}
	
	void PrintList() {
		PrintList(list.size());
	}

	void PrintList(int size) {
		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  ���                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();


		for (int i = 0; i < size; i++) {
			Exam exam = list.get(i);//this.exams[i];
			int kor = exam.getKor();// exam.kor;
			int eng = exam.getEng();// exam.eng;
			int math = exam.getMath();// exam.math;

			int total = exam.total();// kor + eng + math;
			float avg = exam.avg();// total / 3.0f;

			System.out.printf("���� = %d\n", kor);
			System.out.printf("���� = %d\n", eng);
			System.out.printf("���� = %d\n", math);

			System.out.printf("���� : %3d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("����������������������������������������������������������");
		}
	}
	
	void InputList() {
		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  �Է�                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("����: ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("����: ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("����: ");
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (math < 0 || 100 < math);

		Exam exam = new Exam(kor, eng, math);

//		-----------------------add--------------------------------------------
		
		list.add(exam);
		
		
	}
}
