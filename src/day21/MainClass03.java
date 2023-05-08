package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*파일 입출력
스트림
-반복 
*/
public class MainClass03 {
	public static void main(String[] args) throws Exception {
		File path = new File("c:/test/test.txt");
		FileInputStream fis = new FileInputStream(path);
		
		while(true) {
			int ch = (char)fis.read();
			if(ch == -1) {
				System.out.println("ch : "+ch);
				break;
			}
			System.out.println((char)ch);
			fis.close();
			//무한
		}
		
	}
}
