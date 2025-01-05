package ex19;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex19_12 {
	public static void main(String[] args) {
		FileInputStream readFile = null; // 기반 스트링
		FileInputStream bisReadFile = null; // 보조 스트링에 사용할 기반 스트링
		BufferedInputStream bis = null; // 보조 스트링

		try {
			System.out.println("기본 스트림으로 읽기 시작");
			readFile = new FileInputStream("back.jpg");
			long start = System.currentTimeMillis();
			while (readFile.read() != -1) {
				// 이미지 읽기
			}
			long end = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작1");
			System.out.println("이미지 읽기 종료1");
			System.out.println("소요 시간 : " + (end - start) / 1000 + "초");
			System.out.println("스트림으로 읽기 종료");

			System.out.println("기본 스트림으로 읽기 시작");
			System.out.println("보조 스트림으로 읽기 시작");
			bisReadFile = new FileInputStream("back.jpg");
			bis = new BufferedInputStream(bisReadFile);
			start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작2");
			while (bis.read() != -1) {
				// 이미지 읽기
			}
			System.out.println("이미지 읽기 종료2");
			end = System.currentTimeMillis();
			double result = (double) (end - start) / 1000;
			System.out.println("소요 시간 : " + result + "초");
			System.out.println("보조 스트림으로 읽기 종료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bisReadFile != null) {
					bisReadFile.close();
				}
				if (readFile != null) {
					readFile.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
