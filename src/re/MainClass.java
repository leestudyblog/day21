package re;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name =null;
		int num , age =0;
		member.MemberDTO dto = null;
		MemberService ms = new MemberService();
		boolean bool = true;
		
		while (bool) {
			System.out.println("1.저장");
			System.out.println("2.검색");
			System.out.println("3.종료");
			System.out.println(">>> :");
			num = sc.nextInt();
			switch (num) {
			case 1 :
				System.out.println("이름 : ");
				name = sc.next();
				if(ms.Usercheck(name)){
					System.out.println("존재하는 이름입니다.");
					break;
				}
				System.out.println("나이 : ");
				age = sc.nextInt();
				//dto = new MemberDTO();
				dto.setName(name);
				dto.setAge(age);
				//ms.save(dto);    
				break;
			case 2 :
				System.out.println("이름 : ");
				name = sc.next();
				if(ms.Usercheck(name)==false){
					System.out.println("해당 사용자는 존재하지 않습니다");
					break;
					
				}
			//	dto=ms.getMember(name));
				System.out.println("이름 :"+dto.getName());
				System.out.println("나이 :"+dto.getAge());
				break;
			case 3 : System.out.println("시스템 종료"); bool = false; break;
			}
		}
	}
}
