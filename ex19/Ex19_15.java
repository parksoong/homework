package ex19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex19_15 {
	public static void main(String[] args) {

		FileReader reader = null;
		BufferedReader br = null;
		FileWriter writer = null;
		BufferedWriter bw = null;

		try {

			reader = new FileReader("boox.txt");
			writer = new FileWriter("book_copy.txt", false);
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);

			String str = "";

			System.out.println("텍스트 파일 복사 시작");

			while ((str = br.readLine()) != null) {
				bw.write(str + "\n");
			}
			System.out.println("텍스트 파일 복사 완료");
		} catch (Exception e) {

		} finally {

			try {
				if (bw != null) {
					bw.close();
				}
				if (writer != null) {
					writer.close();
				}
				if (br != null) {
					br.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {

			}
		}
	}

}
