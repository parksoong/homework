package ex19;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex19_14 {
	public static void main(String[] args) {

		FileReader reader = null;
		BufferedReader br = null;

		try {
			reader = new FileReader("book.txt");
			br = new BufferedReader(reader);

			String str = "";

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
