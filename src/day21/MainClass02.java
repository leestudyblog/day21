package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*파일 입출력
스트림
-output: 내용입력
-input : 파일 가져오기
*/
public class MainClass02 {
	public static void main(String[] args) throws Exception {
	File path = new File("c:/test/test.txt");
	FileOutputStream fos = new FileOutputStream(path, true); //true : 이어서 쓰기
	
	//fos.write(97); //소문자 a로 표시
	//fos.write('A'); //문자 A로 표시

	//true 없으면 파일 삭제 후 재생성 후 작성 됨
	fos.write(65); //대문자 A로 표시
	fos.write('B'); //문자 B로 표시
	
	fos.close(); // 스트림 닫기
	
	//파일 가져오기
	FileInputStream fis = new FileInputStream(path);
	System.out.println(fis.read()); //입력된 값 순서대로 출력, int 형태로 가져옴
	System.out.println(fis.read());
	
	fis.close();
	
	
	}
}
