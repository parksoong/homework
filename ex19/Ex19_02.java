package ex19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex19_02 {
	public static void main(String[] args) {
		// read 변수설정
		int read = 0;
		// 스트림 선언
		InputStream in = null;

		// 데이터를 담을 배열 선언
		byte[] buffer = new byte[5];

		try {
			//in이라는 스트림에 my_file.txt파일을 읽게 해준다
			in = new FileInputStream("my_file.txt");
			while (true) {
				//이것도 마찬가지로 읽을 글자 수가 0번째 까지는 있찌만 -1번째가 되면 그만 읽게 해준다
				read = in.read(buffer);
				if (read == -1) {
					break;
				}
				//잘린것들을 바로 출력을 해준다
				System.out.print(new String(buffer, 0, read));
			}
			//오류가 생기면 바로 try catch를 통해서 돌려준다
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
