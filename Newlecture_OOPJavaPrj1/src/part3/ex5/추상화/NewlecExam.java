package part3.ex5.�߻�ȭ;

public class NewlecExam extends Exam {
	
	int com;
	
	public NewlecExam() {
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor,eng,math);
		this.com = com;
	}
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		int total = onTotal() + getCom();
		return total;
	}

	@Override
	public float avg() {

		return total()/ 4.0f;
	}
	
}
