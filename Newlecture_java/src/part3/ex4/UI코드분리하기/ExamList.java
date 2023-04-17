package part3.ex4.UI코드분리하기;

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
			// 1. 크기가 5개 정도 더 큰 새로운 배열을 생성하시오.
			Exam[] temp = new Exam[size + 5];
			// 2. 값을 이주시키기
			for (int i = 0; i < 3; i++)
				temp[i] = exams[i];
			// 3. list.exams가 새로만든 temp배열을 참조.
			this.exams = temp; // exams는 안됨.
		}

		this.exams[this.current] = exam;
		this.current++;

		System.out.println("─────────────────────────────");

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
