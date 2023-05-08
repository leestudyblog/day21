package day21;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*보조 스트림
 Buffer : 이클립스 내부 보조 저장소에 전부 올림 
*/
public class MainClass04 {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("c:/test/test.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		for (char i = 'A'; i<='Z'; i++) {
		
			
		
			Thread.sleep(2000); // 2초마다
			//fos.write(i); // A-Z까지 출력 -> 오래 걸림
			bos.write(i);
			
		}
		bos.flush();
		bos.write("hi".getBytes());
		bos.close();
		//bos.write("hi".getBytes());//닫혀서 실행X
		bos.close();
		fos.close();
	}

}
