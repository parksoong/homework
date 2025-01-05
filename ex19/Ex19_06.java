package ex19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex19_06 {
	public static void main(String[] args) {
		//input과 output스트림으로 파일을 받고 만들 수 있게해준다
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			//back.jpg와 back_copy.jpg를 받고 생성한다고 정의한다 
		    in = new FileInputStream("back.jpg");
		    out = new FileOutputStream("back_copy.jpg");
		    //byte를 512byte를 받게 해주고 buffer라는 
		    byte[] buffer = new byte[512];
		    
		    //아래는 전과 동일
		    long start = System.currentTimeMillis();
		    System.out.println("이미지 읽기 시작");
		    int read = 0;
		    while((read = in.read(buffer)) != -1) {
		        out.write(buffer, 0, read);
		    }
		    System.out.println("이미지 읽기 종료");
		    long end = System.currentTimeMillis();
		    double time = (double)(end - start) / 1000;
		    System.out.println(time + "초");
		} catch(IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if(out != null) {
		            out.close();
		        }
		        if(in != null) {
		            in.close();
		        }
		    } catch(Exception e) {
		        e.printStackTrace();
		    }
		}

	}

}
