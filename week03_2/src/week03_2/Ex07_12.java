package week03_2;

// 7 - 12
class Student{
	static String schoolName = "코리아 고등학교";//정적으로 schoolName이라는 변수에 코리아 고등학교를 넣는다
	
	static void goToSchool() {//정적으로 goToSchool이라는 메소드를 출력하면 학교에 갑니다 메시지가 출력된다
		System.out.println("학교에 갑니다");
	}
}
// 7 - 13
public class Ex07_12 {
	public static void main(String[] args) {
		System.out.println(Student.schoolName);//정적으로 고정했기 때문에 클래스명.변수명 으로 사용된다
		Student.goToSchool();//정적으로 고정했기에 클래스명.메소드명 으로 사용된다
	}

}
