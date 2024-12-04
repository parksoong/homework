package week03;

public class Ex08_18 {
	void take(int m) {//take라는 메소드를 생성하고 여기서는 정수형 매개변수를 받겠다
		
		while(true) {//while문이지만 while문의 조건인 true를써 반복문 내부에서 나가는 명령어를 사용하지 않으면 무한 루프가됨
			if(m < 3000) {//if문을 사용 m 값이 3000보다 작다면
				System.out.println("교통카드를 충전하러 갑니다.");//""안의 메시지 출력
				return;//return; 뒤에 아무런 입력값이 없다면 종료와 같은 뜻이다
			}
			System.out.println("버스를 탑니다.");//""안의 메시지 출력
			m -= 1250;//기존m이라는 값에서 1250을 뺀 값을 m에다가 대입함
		}
	}
	public static void main(String[] args) {//main메소드 생성
		int money = 10000;//money라는 정수형 변수에 10000이라는 값을 대입
		
		Ex08_18 bus = new Ex08_18();//Ex08_18라는 클래스에 있는 메소드들을 bus라는 명령어를 통해서 사용할 수 있게 해준다
		bus.take(money);//bus(Ex08_18)클래스에 있는 .take메소드에 매개변수 money를 대입한다.
	}

}
