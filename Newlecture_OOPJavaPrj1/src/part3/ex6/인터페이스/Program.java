package part3.ex6.�������̽�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		FileInputStream fis = new FileInputStream("src/part3/ex6/�������̽�/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		
		Class clazz = Class.forName(className);
		A a = new A();
		X x = (X) clazz.newInstance(); //���͸�
		
		a.setX(x);
		a.print();
	}

}
