package week03;

public class Ex08_18 {
	void take(int m) {
		
		while(true) {
			if(m < 3000) {
				System.out.println("교통카드를 충전하러 갑니다.");
				return;
			}
			System.out.println("버스를 탑니다.");
			m -= 1250;
		}
	}
	public static void main(String[] args) {
		int money = 10000;
		
		Ex08_18 bus = new Ex08_18();
		bus.take(money);
	}

}
