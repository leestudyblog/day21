package day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*파일 입출력
  스트림
  -output
 */

public class MainClass01 {
	public static void main(String[] args) throws FileNotFoundException { //예외처리
	
		//변수에 파일 경로 입력 + txt 파일 생성
		//String path ="C:\\test\\test.txt";
		
		// 파일 클래스 형태로 경로 지정 및 txt 생성(주로 사용)
		File path =new File ("C:\\test\\abc.txt"); 
		
		// path  위치에 파일 생성
		path.mkdir(); 
		
		// path  위치에 파일 삭제		
		path.delete();
		
		//FileOutputStream fos = new FileOutputStream(path); //path : 파일위치 
	}

}
