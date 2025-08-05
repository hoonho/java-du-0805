import java.util.Scanner;

// DTO(Data Transfer Object)
class MemberInfo0{
	// 필드 : 클래스로 객체를 생성할때 heap메모리를 할당 받아서 값을 저장하는 역할
	private String name;				 
	private int age;
	private String email;
	private String address;
	
	// 생성자 : 클래스로 객체를 생성할때 호출되며, 필드값을 초기화 시키는 역할
	public MemberInfo0(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	// 메소드 : 필드값을 출력하는 역할
	public void print() {
		System.out.println("name:"+ name);
		System.out.println("age:"+ age);
		System.out.println("email:"+ email);
		System.out.println("address:"+ address);
	}
	
}

public class MemberInput0 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성명을 입력 하세요?");
		String name = sc.nextLine();
		System.out.println("나이를 입력 하세요?");
		int age = sc.nextInt();     // 숫자를 입력받은후에 enter키를 
		sc.nextLine();              // 누르면 null값을 return하게 됨
		System.out.println("이메일주소를 입력 하세요?");
		String email = sc.nextLine();
		System.out.println("주소를 입력 하세요?");
		String address = sc.nextLine();
		
		MemberInfo0 m = new MemberInfo0(name, age, email, address);	

		m.print();
	}

}
