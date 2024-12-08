package week03_2;

//9 - 1
class Snack{
	int price;//필드에 price 변수생성
	
	void info() {//info라고 하는 메소드를 생성
		System.out.println("과자의 가격은 " + price + "원입니다.");
	} 
}

public class Ex09_01 {
	public static void main(String[] args) {
		Snack chip = new Snack();//Snack이란 클래스를 chip이라고 지정
		chip.price = 2000;//chip에 price를 2000으로 변경
		chip.info();//chip에 info 메소드 출력
	}

}
