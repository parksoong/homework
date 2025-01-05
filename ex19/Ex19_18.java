package ex19;

import java.io.File;

public class Ex19_18 {
	public static void main(String[] args) {
		File f = new File(".../stc/example.txt");
		if(f.exists()) {
			System.out.println("length : " + f.length());
			System.out.println("canRead : " + f.canRead());
			System.out.println("canWrite : " + f.canWrite());
			System.out.println("getAbsolutePath : " + f.getAbsolutePath());
			
			System.out.println("getName : " + f.getName());
			System.out.println("getParent : " + f.getParent());
			System.out.println("getPath : " + f.getPath());
		} else {
			System.out.println("파일이 존재하지 않습니다");
		}
	}

}
