package week03;

public class Ex08_08 {
	void sum(int num1, int num2) {// sum이라는 메소드를 생성한다 이 때 매개변수는 2개 int형으로 받겠다
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다.");//""안의 문자를 출력하고 받은 매개변수의 합을 출력 
	}
	public static void main(String[] args) {//main 메소드 생성
		Ex08_08 calc = new Ex08_08();//Ex08_08라는 클래스에 있는 메소드들을 calc라는 명령어를 통해서 사용할 수 있게 해준다
		calc.sum(5, 3);//calc(Ex08_08)에 있는 메소드를 .sum을 출력하는데 5랑 3을 매개변수로 하겠다
		calc.sum(10, 7);//calc(Ex08_08)에 있는 메소드를 .sum을 출력하는데 10랑 7을 매개변수로 하겠다
		
	}

}
