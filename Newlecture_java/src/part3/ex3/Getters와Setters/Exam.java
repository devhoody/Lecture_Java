package part3.ex3.Getters��Setters;

public class Exam {
	int kor;
	int eng;
	int math;

	// �⺻ ������.
	public Exam() {
		this(0, 0, 0);
	}

	// ������ ������
	public Exam(int kor, int eng, int math) {
		// this�� ������ �����ϳ�, �� ������ �̸��� ���⿡ this�� �ٿ��־� ȥ���� ����.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// Getters �� Setters
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	// exam��ü �ȿ����� �����ͷ� ������ total,avg�� ����.
	public int total() {
		return kor + eng + math;
	}

	public float avg() {
		return total() / 3.0f; // total() = this.total()
	}

}
