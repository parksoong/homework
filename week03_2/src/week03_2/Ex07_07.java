package week03_2;

// 7 - 7
class Car1 {
	int wheel;

	void ride() {
		System.out.println("달립니다");
	}
}
// 7 -8
class Ex07_08 {
	int wheel = 4;

	void ride() {
		System.out.println("달립니다");
		System.out.println("씽씽씽");
	}
}
// 7- 9
public class Ex07_07 {
	public static void main(String[] args) {
		Ex07_08 c = new Ex07_08();
		c.ride();
		c.ride();
		c.ride();
		
	}

}
