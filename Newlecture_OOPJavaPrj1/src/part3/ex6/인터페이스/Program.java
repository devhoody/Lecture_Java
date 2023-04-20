package part3.ex6.인터페이스;

public class Program {

	public static void main(String[] args) {
		A a = new A();
		B b = new B(); //배터리
		
		a.setX(b);
		a.print();
	}

}
