package part3.ex4.UI�ڵ�и��ϱ�;

//
public class ExamList {
	private Exam[] exams;
	private int current;

	public Exam get(int i) {
		// TODO Auto-generated method stub
		return this.exams[i];
	}

	public void add(Exam exam) {
		Exam[] exams = this.exams;
		int size = this.current;

		if (exams.length == size) {
			// 1. ũ�Ⱑ 5�� ���� �� ū ���ο� �迭�� �����Ͻÿ�.
			Exam[] temp = new Exam[size + 5];
			// 2. ���� ���ֽ�Ű��
			for (int i = 0; i < 3; i++)
				temp[i] = exams[i];
			// 3. list.exams�� ���θ��� temp�迭�� ����.
			this.exams = temp; // exams�� �ȵ�.
		}

		this.exams[this.current] = exam;
		this.current++;

		System.out.println("����������������������������������������������������������");

	}

	public ExamList() {
		this(3);
	}

	public ExamList(int size) {
		this.exams = new Exam[size];
		this.current = 0;

	}

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}

}
