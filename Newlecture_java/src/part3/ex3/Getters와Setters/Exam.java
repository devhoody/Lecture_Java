package part3.ex3.Getters와Setters;

public class Exam {
	int kor;
	int eng;
	int math;

	// 기본 생성자.
	public Exam() {
		this(0, 0, 0);
	}

	// 생성자 오버로
	public Exam(int kor, int eng, int math) {
		// this는 생략이 가능하나, 두 변수가 이름이 같기에 this를 붙여주어 혼선을 줄임.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// Getters 와 Setters
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

	// exam객체 안에서의 데이터로 구성된 total,avg을 선언.
	public int total() {
		return kor + eng + math;
	}

	public float avg() {
		return total() / 3.0f; // total() = this.total()
	}

}
