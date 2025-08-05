import java.util.ArrayList;
import java.util.Scanner;

class Member {
  private String name;
  private int age;
  private String email;
  private String address;

  public Member() {}

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getInfo() {
    return name + "\t" + age + "\t" + email + "\t" + address;
  }
}

class MemberManager {
  private ArrayList<Member> memberList = new ArrayList<>();
  private Scanner sc = new Scanner(System.in);

  public void inputMember() {
    Member member = new Member();

    System.out.print("이름: ");
    member.setName(sc.nextLine());

    int age = 0;
    while (true) {
      System.out.print("나이: ");
      try {
        age = Integer.parseInt(sc.nextLine());
        member.setAge(age);
        break;
      } catch (NumberFormatException e) {
        System.out.println("숫자를 입력하세요.");
      }
    }

    System.out.print("이메일: ");
    member.setEmail(sc.nextLine());

    System.out.print("주소: ");
    member.setAddress(sc.nextLine());

    memberList.add(member);
    System.out.println("회원가입이 완료되었습니다.");
  }

  public void printMembers() {
    if (memberList.isEmpty()) {
      System.out.println("등록된 회원이 없습니다.");
      return;
    }

    System.out.println("\n--- 회원 목록 ---");
    for (Member m : memberList) {
      System.out.println(m.getInfo());
    }
  }
}

public class MemberInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MemberManager manager = new MemberManager();

    while (true) {
      System.out.println("\n1. 회원가입");
      System.out.println("2. 회원 정보 출력");
      System.out.println("0. 종료");

      int choice = -1;
      while (true) {
        System.out.print("메뉴 선택: ");
        String input = sc.nextLine();

        try {
          choice = Integer.parseInt(input);
          if (choice < 0 || choice > 2) {
            System.out.println("잘못된 입력입니다.");
            continue;
          }
          break;
        } catch (NumberFormatException e) {
          System.out.println("숫자만 입력 가능합니다.");
        }
      }

      switch (choice) {
        case 1:
          manager.inputMember();
          break;

        case 2:
          manager.printMembers();
          break;

        case 0:
          System.out.println("프로그램을 종료합니다.");
          sc.close();
          return;

        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }
}
