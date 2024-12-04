package week03;

public class Ex08_04 {
	String name;
	
	void run() {
		System.out.println("run run run!");
	}
	
	void sayName() {
		System.out.println("제 이름은 " +  name + "입니다.");
	}
	public static void main(String[] args) {
		Ex08_04 jogger = new Ex08_04();
		jogger.name = "박승우";
		jogger.sayName();
		jogger.run();
	}

}
