package week03_2;

// 7 - 14
class Student1 {
	static String schoolName = "코리아 고등학교";// 정적으로 schoolName이라는 변수에 코리아 고등학교를 넣는다
	String studentName;

	static void goToSchool() {// 정적으로 goToSchool이라는 메소드를 출력하면 학교에 갑니다 메시지가 출력된다
		System.out.println("오늘은 학교에 가는 날입니다.");
	}

	void hello() {// hello라는 메소드를 출력하면 아래에 메시지가 출력됨
		System.out.println("안녕하세요, 제 이름은" + studentName + "입니다");
	}
}

// 7 - 15
public class Ex07_14 {
	public static void main(String[] args) {
		Student1 stu1 = new Student1(); // Student1이라는 클래스를 stu1이라고 설정
		stu1.studentName = "김고이";//stu1에서 studentName을 김고이라고 대입
		stu1.hello(); //stu1클래스에 있는 hello라는 메소드 출력
		System.out.println("학교는 " + Student1.schoolName + "입니다");
		Student1.goToSchool();//stu1에 있는 goToSchool라는 메소드 출력

		Student1 stu2 = new Student1();// Student1이라는 클래스를 stu2이라고 설정
		stu2.studentName = "김고삼";//stu2에서 studentName을 김고이라고 대입
		stu2.hello();//stu2클래스에 있는 hello라는 메소드 출력
		System.out.println("학교는 " + Student1.schoolName + "입니다");
		Student1.goToSchool();//stu2에 있는 goToSchool라는 메소드 출력

	}

}
