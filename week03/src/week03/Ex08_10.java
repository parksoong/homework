package week03;

public class Ex08_10 {
	void introduce(String name, int age) {//introduce라는 메소드를 생성하는데 여기에 문자열타입과 정수형 타입 이렇게 2개를 매개변수로 하겠다
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");// ""출력 메시지와 매개변수 출력
	}
	
	void hello() {//hello라는 메소드를 생성
		System.out.println("안녕하세요.");//메소스 실행시 ""안의 문자열 출력
	}
	
	public static void main(String[] args) {//main메소드 생성
		Ex08_10 hong = new Ex08_10();//Ex08_10라는 클래스에 있는 메소드들을 hong라는 명령어를 통해서 사용할 수 있게 해준다
		hong.introduce("박승우", 20);//hong(Ex08_10)클래스에 있는 메소드 .introduce를 실행하고 매개변수를 문자열 "박승우" int형 20을 대입한다
		hong.hello();//hong(Ex08_10)클래스에 있는 메소드 .hello를 실행한다
	}

}
