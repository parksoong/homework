package week03_2;

// 7 - 10
class Family {
	String name;// 필드에 name age address생성
	int age;
	String address = "서울";
}

// 7 - 11
public class Ex07_10 {
	public static void main(String[] args) {
		Family father = new Family();// Family라는 클래스를 father라 지정
		Family son = new Family();// Family라는 클래스를 son라 지정

		father.address = "인천";// father의 객체에서 address를 인천으로 변경
		System.out.println(son.address);// father라는 객체에서 변경이 됐기 때문에 son이라는 객체에서는 address값이 기존에 필드값에 있는 "서울"이라는 값으로 출력이 됌
	}

}
