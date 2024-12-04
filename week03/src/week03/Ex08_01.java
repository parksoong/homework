package week03;

public class Ex08_01 {
	public static void main(String[] args) {
		printHello();//printHello라는 메소드 호출(같은 main 메소드 안에서 작성된 함수라 메소드 클래스를 생성하지 x)
	}
	
	static void printHello() {//static void로 printHello라는 메소드를 생성
		
		System.out.println("안녕하세요");//""안의 문자를 출력하고 줄바꿈
		System.out.println("만나서 반갑습니다.");//""안의 문자를 출력하고 줄바꿈
	}

}
