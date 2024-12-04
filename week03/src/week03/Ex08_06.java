package week03;

public class Ex08_06 {
	void count(int bookNum) {
		System.out.println("책은 " + bookNum + "권 입니다");
	}
	public static void main(String[] args) {
		Ex08_06 myBook = new Ex08_06();
		myBook.count(3);
	}

}
