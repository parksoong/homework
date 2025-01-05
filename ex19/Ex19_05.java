package ex19;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex19_05 {
    public static void main(String[] args) {
    	//input과 output을 통해서 파일을 가져오고 만들 수 있게 해준다
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
        	//in을 통해서 back.jpg라는 이미지를 가져오고
        	//out을 통해서 back_copy.jpg라는 파일로 만들거라고 알려준다
            in = new FileInputStream("back.jpg");
            out = new FileOutputStream("back_copy.jpg");
            
            //얼마나 걸리는지 알려주는것
            long start = System.currentTimeMillis();
            System.out.println("이미지 읽기 시작");
            int read = 0;
            //read()를 통해서 아나씩 읽게해주는데 0이되면 못읽으니 -1이면 종료되게 해준다
            while((read = in.read()) != -1) {
                out.write(read);
            }
            System.out.println("이미지 읽기 종료");
            //끝난 시간을 체크해준다
            long end = System.currentTimeMillis();
            //끝난시간에서 시작한 시각을 빼주면 걸린 시간이 나오는데 이건 ms이므로 1000으로 나눠서 초로 나오게한다
            long time = (end - start) / 1000;
            //초를 출력
            System.out.println(time + "초");
            //그리고 파일을 찾는데 오류가 나면 그걸 알려준다
        } catch(IOException e) {
            e.printStackTrace();
            //finally을 통해서 in과 out이 열려있으면 닫게해준다
        } finally {
            try {
                if(in != null) in.close();
                if(out != null) out.close();
                //닫는중에 오류가 생기면 던져준다
            } catch(IOException e) {
                e.printStackTrace();
                //그러는데 한번 더 체크를해서 닫아준다 하나만 닫힐 수 있으니
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
}
