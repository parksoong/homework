package ex19;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex19_04 {
    public static void main(String[] args) {
    	//outputstream을 통해서 작성을 하는 스트림을 만든다
        OutputStream out = null;
        try {
        	//output스트림에 문자열을 넣어준다 
            out = new FileOutputStream("write_array.txt", false);
            String str = "hello world";
            //그 문자열을 바이트형태로 반환해서 작성을한다
            byte[] strArray = str.getBytes();
            out.write(strArray);
            //catch를 통해서 오류가 생기면 오류 생긴 위치를 알려준다
        } catch(IOException e) {
            e.printStackTrace();
            //finally를 통해서 아직도 창이 열려있다면 닫아주고 닫는중에 오류가 생기면 그 오류를 알려준다
        } finally {
            try {
                if(out != null) {
                    out.close();
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
