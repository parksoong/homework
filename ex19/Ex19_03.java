package ex19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex19_03 {
	public static void main(String[] args) {
		// output스트림을 설정해준다
		OutputStream out = null;
		try {
			// 거짓일때 그만두는 식을 통해서 문자형들을 텍스트로 만들어준다
			out = new FileOutputStream("write.txt", false);
			out.write('H');
			out.write('E');
			out.write('L');
			out.write('L');
			out.write('O');

		} catch (IOException e) {
			//그렇게 오류가 나오면 try catch를 통해서 오류들을 반환해주고 finally를 통해서 열려잇다면 닫아준다
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
