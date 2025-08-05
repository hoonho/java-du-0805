// p287
// 메소드 오버로딩(Method Overloading)
// : 한개의 클래스 안에 동일한 이름을 가진 메소드를 여러개 정의 하는것.
// 메소드 오버로딩 조건 : 매개 변수의 데이터 타입, 갯수, 순서
class Calculator3{
	// 메소드 오버로딩
	double areaRectangle(double width) {					// 정사각형의 넓이
		return width * width;
	}
	double areaRectangle(double width, double height) {		// 직사각형의 넓이
		return width * height;
	}	
}

public class CalculatorExample3 {

	public static void main(String[] args) {
		Calculator3 mycal = new Calculator3();
		
		// 정사각형의 넓이
		double result1 = mycal.areaRectangle(10);
		
		// 직사각형의 넓이
		double result2 = mycal.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이:"+ result1);
		System.out.println("직사각형의 넓이:"+ result2);
	}

}
