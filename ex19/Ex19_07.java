package ex19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex19_07 {
	public static void main(String[] args) {
		int read = 0;
		InputStream in = null;
		try {
			//file_korea.txt파일을 받아온다
			in = new FileInputStream("file_korean.txt");
			while (true) {
				//파일을 읽다가 -1이면 종료하게해준다
				read = in.read();
				// -1 이면 종료
				if (read == -1) {
					break;
				}
				System.out.print((char) read);
			}
			//아래는 기존과 동일
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				// 객체가 사용 중이면 닫는다.
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
