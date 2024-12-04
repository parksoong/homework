package week03;

public class Ex08_10 {
	void introduce(String name, int age) {
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");
	}
	
	void hello() {
		System.out.println("안녕하세요.");
	}
	
	public static void main(String[] args) {
		Ex08_10 hong = new Ex08_10();
		hong.introduce("박승우", 20);
		hong.hello();
	}

}
