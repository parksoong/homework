package week03_2;

// 7 - 5
class Car{
	int wheel = 4;//필드에 wheel이라는 정수형 배열 생성하고 4라는 값 대입
}
public class Ex07_05 {//클래스 생성
	public static void main(String[] args) {
		Car c = new Car();//Car라는 클래스를 이제 c라고 사용하겠다
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다.");//출력
		
		c.wheel = 5;//Car클래스 이하 c로 사용 에 있는 wheel이라는 정수형 배열에 5라는 값 대입
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다.");//출력
		
	}

}
