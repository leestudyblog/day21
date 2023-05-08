package day21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.BufferOverflowException;
import java.util.Scanner;

/*보조 스트림
DataOutputStream
직렬화 :byte 형식으로 가져옴 
역직렬화 : 반대
*/

public class MainClass05 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\test\\test.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		System.out.println("print input: ");
		String n = new Scanner(System.in).next();
		
		dos.writeUTF(n);
		
		dos.close();
		bos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String s = dis.readUTF();
		
		System.out.println("text : " +s);
		
		dis.close();
		bis.close();
		fis.close(); // 역순 닫기
		
		
}
}
