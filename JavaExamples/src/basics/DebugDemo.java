package basics;

public class DebugDemo {
	public static void main(String[] args) {
		System.out.println("DebugDemo-- main");
		Calculator calc = new Calculator();
		int sum = calc.add(10, 20);
		System.out.println("the sum is--"+sum);

		for(int a=0; a<5; a++) {
			int f = a+ 5 *3;
			//System.out.println("the no is="+f);
			int j = a *2;
			int f2 = a+ 5 *3 +j;
			System.out.println("the no is="+f);

		}
		//throw new NullPointerException();
		throw new NullPointerException();

	}



}
