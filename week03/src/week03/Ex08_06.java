package week03;

public class Ex08_06 {
	void count(int bookNum) {// count라는 메소드를 생성 이때 매개변수는 int형 정수를 받고 bookNum이라고 변수를 저장하겠다
		System.out.println("책은 " + bookNum + "권 입니다");// 여기서 ""의 내용을 출력해주고 bookNum은 위에서 매개변수의 값을 대입해주겠다 그리고 ""의 내용을 출력
	}

	public static void main(String[] args) {//main메소드 생성
		Ex08_06 myBook = new Ex08_06();//Ex08_06라는 클래스에 있는 메소드들을 myBook라는 명령어를 통해서 사용할 수 있게 해준다
		myBook.count(3);//myBook(Ex08_06)에 있는 .count 메소드에 (3)이라는 매개변수를 대입하겠다
	}

}
