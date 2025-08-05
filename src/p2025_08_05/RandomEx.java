import java.io.InputStream;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class RandomEx {

	public static void main(String[] args) {
	
		// java.lang 패키지 안에 있는 String 클래스는 import를 생략할 수 있다.
		String str = new String("자바");
		
		java.util.Date d1 = new java.util.Date();
		
		// 자동 import : Ctrl + Shift + 오(o)
		Date d = new Date();
		System.out.println(d);
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
//---------------------------------------------------------------------------------
		// 난수 발생 방법 : 1. Math.random()
		//               2. Random 클래스
		
		Random r = new Random();
		
		int n1 = r.nextInt(10);				// 0 ~ 9
		System.out.println("n1="+ n1);
		
		// 주사위 번호 : 1 ~ 6
		int n2 = r.nextInt(6) + 1;
		System.out.println("주사위 번호="+ n2);
		
		// 로또 번호 : 1 ~ 45
		int n3 = r.nextInt(45) + 1;
		System.out.println("로또 번호="+ n3);
	}

}



