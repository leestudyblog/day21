package day21;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.BufferOverflowException;

//객체저장은 바이트 형식으로 : 직렬화
public class MainClass06 {
	public static void main(String[] args) throws Exception {
		
		TestClass01 t = new TestClass01();
		t.setName("lee");
		t.setAge(20);
		
		//File path = new File("c:/test/test.txt");
		FileOutputStream fos = new FileOutputStream(CommonPath.PATH);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream obs = new ObjectOutputStream(bos);
		
		obs.writeObject(t);
		
		obs.close(); bos.close(); fos.close();
		
		
	}

}
