package ex19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex19_08 {
	public static void main(String[] args) {
		int read = 0;
		// 스트링 선언
		Reader reader = null;

		try {
			reader = new FileReader("file_korean.txt");
			while (true) {
				// 파일 읽기
				read = reader.read();
				// -1 이면 종료
				if (read == -1) {
					break;
				}
				System.out.print((char) read);
			}
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				// 객체가 사용 중이면 닫는다.
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
