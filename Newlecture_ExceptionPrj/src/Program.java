
public class Program {

	public static void main(String[] args)  {
		Calculator calc = new Calculator();
		
		int result = 0;
		
		try {
			result = Calculator.add(3,10000);
			result = Calculator.sub(3,-4);
		} catch (õ���Ѵ¿��� e) {
			System.out.println(e.getMessage());
		}
		catch (�������Ǵ¿��� e) {
			System.out.println(e.getMessage());
		}
		System.out.printf("add : %d\n", result);
		System.out.printf("sub : %d\n", result);
		result = Calculator.multi(3,4);
		System.out.printf("multi : %d\n", result);
		result = Calculator.div(3,4);
		System.out.printf("div : %d\n", result);
	}

}
