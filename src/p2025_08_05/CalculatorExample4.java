// p298
// 정적필드, 정적 메소드
// 1. 정적필드와 정적 메소드는 공유를 목적으로 누구나 쉽게 사용할 경우에 주로 사용한다.
// 2. 정적필드와 정적 메소드를 호출할 때는 클래스로 직접 객체를 생성하지 않고,
//    클래스명.정적필드, 클래스명.정적메소드  형식으로 사용한다.
class Calculator4{
	int k;									// 인스턴스 필드
	
	static int i;							// 정적필드: int형은 0으로 초기화
	static double d;						// 정적필드: double형은 0.0으로 초기화
	static boolean b;						// 정적필드: boolean형은 false로 초기화
	static double pi = 3.14159;				// 정적필드
	
	// 정적 메소드 안에는 정적 필드만 사용할 수 있다.
	static void check() {					// 정적 메소드
//		System.out.println(k);              // 에러발생
		System.out.println(Calculator4.i);              
		System.out.println(i);    
	}	
	
	static int plus(int x, int y) {			// 정적 메소드
		return x + y;
	}
	
	static int minus(int x, int y) {		// 정적 메소드
		return x - y;
	}
}

public class CalculatorExample4 {
	public static void main(String[] args) {
		
		// 정적 필드는 클래스명으로 점(.)으로 접근한다.
		System.out.println("i="+ Calculator4.i);
		System.out.println("d="+ Calculator4.d);
		System.out.println("b="+ Calculator4.b);
		System.out.println("pi="+ Calculator4.pi);
		
		double result1 = 10 * 10 * Calculator4.pi;
		
		// 정적 메소드를 호출할때는 클래스명으로 점(.)으로 접근해서 호출한다.
		int result2 = Calculator4.plus(10, 5);
		int result3 = Calculator4.minus(10, 5);
		
		System.out.println("result1:"+ result1);
		System.out.println("result2:"+ result2);
		System.out.println("result3:"+ result3);

	}

}
