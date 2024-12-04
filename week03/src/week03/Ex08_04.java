package week03;

public class Ex08_04 {
	String name;//정수형 자료형인 String을 통해서 정수형 변수 name을 생성
	
	void run() {//class Ex08_04에서 run이라는 메소드 생성
		System.out.println("run run run!");//""안의 메시지를 출력하고 줄바꿈
	}
	
	void sayName() {//class Ex08_02에서 sayName이라는 메소드 생성
		System.out.println("제 이름은 " +  name + "입니다.");//""안에 문자를 출력하고 name이라는 변수를 출력해주고 ""안에 문자를 출력하고 줄바꿈
	}
	public static void main(String[] args) {//main메소드 생성
		Ex08_04 jogger = new Ex08_04();//Ex08_04라는 클래스에 있는 메소드들을 jogger라는 명령어를 통해서 사용할 수 있게 해준다
		jogger.name = "박승우";//jogger.name 클래스에있는 .name이라는 변수에 ""안의 문자를 대입해준다
		jogger.sayName();//jogger(Ex08_04)에 있는 메소드.sayName이라는 메소드를 실행하겠다
		jogger.run();//jogger(Ex08_04)에 있는 메소드.sayName이라는 메소드를 실행하겠다
	}

}
