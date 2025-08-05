
import java.util.Scanner;

class MemberInfo0{
	private String name;
	private int age;
	private String email;
	private String address;
	
	public MemberInfo0(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
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
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("이메일주소를 입력 하세요?");
		String email = sc.nextLine();
		System.out.println("주소를 입력 하세요?");
		String address = sc.nextLine();
		
		MemberInfo0 m = new MemberInfo0(name, age, email, address);	

		m.print();
	}

}
