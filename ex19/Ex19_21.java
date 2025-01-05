package ex19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex19_21 {
	public static void main(String[] args) {
		FileInputStream in = null;
		ObjectInputStream ois = null;
		try {
			in = new FileInputStream("object_data.dat");
			ois = new ObjectInputStream(in);

			while (in.available() != 0) {
				Person p = (Person) ois.readObject();
				System.out.println("이름 : " + p.getmyName() + ", 나이 : " + p.getMyAge());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
				if (in != null) {
					in.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
