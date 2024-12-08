package week03_2;

// 9 - 5
class Person {
	String name;//필드에 문자열 name과 정수형 age생성
	int age;

	Person(String n, int a) {//생성자를 통해서 문자열과 정수형을 입력받아서 name과 age에 대입하게함
		name = n;
		age = a;
	}

	void introduce() {//this를 사용 안했지만 필드에 있는 값들을 출력하는 메소드 생성
		System.out.println("안녕하세요. 저는 " + age + "세 " + name + "입니다.");
	}
}
// 9 - 6
public class Ex09_05 {
	public static void main(String[] args) {
		Person p1 = new Person("김자바" , 20);//p1이라는 객체에 자바랑 20을 대입
		Person p2 = new Person("이코딩" , 40);//p2라는 객체에 이코딩이랑 40을 대입
		
		p1.introduce();//p1의 introduce메소드 출력
		p2.introduce();//p2의 introduce메소드 출력
	}

}
