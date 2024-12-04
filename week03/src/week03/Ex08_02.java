package week03;

public class Ex08_02 {
	void run() {//class Ex08_02에서 run이라는 메소드 생성
		System.out.println("run run run!");//""안의 메시지를 출력하고 줄바꿈
	}
	public static void main(String[] args) {//메인메소드 생성 
		Ex08_02 jogger = new Ex08_02();//Ex08_02라는 클래스에 있는 메소드들을 jogger라는 명령어를 통해서 사용할 수 있게 해준다
		jogger.run();//jogger(Ex08_02)에 있는 메소드.run이라는 메소드를 실행하겠다
	}

}
