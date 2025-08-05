// p275 ~ 276
// 매개변수의 갯수를 모르는 경우
class Computer{
	
	// 주소값 전달에 의한 메소드 호출방식(Call by Reference 방식)
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];		//  sum = sum + values[i]
		}
		return sum;
	}
	
	// ... : 전달된 값을 배열로 받는다.
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}	
}

public class ComputerExample {
	public static void main(String[] args) {
		
		Computer mycom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = mycom.sum1(values1);					// sum1() 메소드 호출
		System.out.println("result1:"+ result1);
		
		int result2 = mycom.sum1(new int[] {1,2,3,4,5});	// sum1() 메소드 호출
		System.out.println("result2:"+ result2);
		
		int result3 = mycom.sum2(1,2,3);					// sum2() 메소드 호출
		System.out.println("result3:"+ result3);
		
		int result4 = mycom.sum2(1,2,3,4,5);				// sum2() 메소드 호출
		System.out.println("result4:"+ result4);
 	}

}
