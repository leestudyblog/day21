package member;

import java.io.Serializable;

public class MemberDTO implements Serializable { //2객체 생성 및 직렬화
	 private String name;
	 private int age;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	 
}
