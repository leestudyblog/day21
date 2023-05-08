package day21;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

//공통 경로
public class MainClass_Read06 implements CommonPath{ //상속 받아서 사용 해도 O
	public static void main(String[] args) throws Exception {
		//File path = new File("c:/test/test.txt");
		String path = CommonPath.PATH; // 지역변수로 만들고 사용해도 O
		FileInputStream fis = new FileInputStream(path); //인터페이스로 생성한 패스 
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		//Object o = ois.readObject();//값 가져오기
		//TestClass01 t = (TestClass01)o; 
		TestClass01 t = (TestClass01)ois.readObject();
		System.out.println("name :" + t.getName());
		System.out.println("age :" + t.getAge());
		
		ois.close(); bis.close(); fis.close();
	}
}
