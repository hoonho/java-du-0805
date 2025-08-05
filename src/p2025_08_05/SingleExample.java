// p302
// 싱글톤(singleton) : 객체 생성을 1번만 수행 하는것.
class Singleton{
	// 싱글톤(singleton) : 객체 생성을 1번만 수행 하는것.
	 private static Singleton s = new Singleton();      // 정적 필드
	 
	 public static Singleton getInstance() {			// 정적 메소드
		 return s;
	 }
	
	 private Singleton() {}   // 기본 생성자 : 직접 객체 생성을 막아주는 역할       
	 
	 public void check() {
		 System.out.println("메소드 호출성공1");
	 }
	 public void check2() {
		 System.out.println("메소드 호출성공2");
	 }
}

public class SingleExample {

	public static void main(String[] args) {
		
		// private 접근 제어자 때문에 외부 클래스에서 직접 접근할 수 없다.
//		System.out.println(Singleton.s);         // 에러발생
		
//		Singleton s = new Singleton();           // 에러발생
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {     // 주소값 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		obj1.check();		
		obj1.check2();	
		
		obj2.check();		
		obj2.check2();	

	}

}
