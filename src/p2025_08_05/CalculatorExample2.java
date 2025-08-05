// p282
// 클래스 내부에서 메소드 호출 : 메소드 안에서 다른 메소드 호출
class Calculator2{
	int plus(int x, int y) {
		int result = x + y;					// 17
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);			// plus() 메소드 호출 :  sum=17.0
		double result = sum / 2;            // 8.5
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);			// avg() 메소드 호출
		println("실행결과:"+ result);         // println() 메소드 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
}

public class CalculatorExample2 {
	public static void main(String[] args) {
		Calculator2 mycal = new Calculator2();
		
		mycal.execute();
	}

}
