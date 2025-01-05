package ex19;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex19_09 {
	public static void main(String[] args) {
		// 파일을 읽어올 변수
		int read = 0;
		// 스트림 선언
		Reader in = null;
		
		try {
			in = new FileReader("file_korean.txt");
			char[] buffer = new char[256];
			
			while(true) {
				// 파일 읽기
				read = in.read(buffer);
				// -1 이면 종료
				if(read == -1) {
					break;
				}
				System.out.println(String.valueOf(buffer, 0, read));
			}
		} catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
