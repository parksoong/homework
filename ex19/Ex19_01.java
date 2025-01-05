package ex19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex19_01 {
	public static void main(String[] args) {
		int read = 0;
		//스트림선언
		InputStream in = null;
		try {
			//파일이름중에 my_file.txt라고 된 파일을 in이라는 스트림에 넣겟다
			in = new FileInputStream("my_file.txt");
			while(true) {
				//read를 통해서 읽는데 한 바이트씩읽는데 컴퓨터니까 제일 낮은 숫자는 0이라고 인덱스번호처럼 생각을 한다 그래서 1일때 종료를 하게 한다
				read = in.read();
				if(read == -1) {
					break;
				}
				//읽어온 문자형을 붙여서 출력을 한다
				System.out.print((char)read);
			}
			//하지만 만약에 파일을 못찾거나 다른 오류들이 생길 수 잇으니 cathc를 통해서 에러를 알려준다
		}catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
			//finally를 사용해 try catch의 마무리 구문을 사용해준다
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
