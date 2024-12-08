package week03_2;

// 9 - 3
class Snack1{
	int price;//필드에 price라는 변수 생성
	
	Snack1(int p){//p라는 변수가 들어오면
		price = p;//price라는 변수에 p라는 값 대입
	}
	
	void info() {
		System.out.println("과자의 가격은 " + price + "원입니다.");
	}
}
// 9 - 4
public class Ex09_03 {
	public static void main(String[] args) {
		Snack1 chip1 = new Snack1(5000);//생성자를 통해서 Snack1에 자동으로 변수 p를 대입해서 price란 변수에 5000이라는 값이 대입됌
		
		chip1.info();
	}

}
