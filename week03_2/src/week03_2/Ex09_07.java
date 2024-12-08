package week03_2;

// 9 - 7
class Phone{
	String brand;//필드에 brand series 생성하고 초기값대입을함 color에는 검은색을 초기값으로 넣음
	int series;
	String color = "검은색";
	
	Phone(String b, int s, String c){//생성자에 String int String순서대로 대입을 받겠다
		brand = b;
		series = s;
		color = c;
	}
	// 9 - 9
	Phone(String b, int s) {//기본값이 검은색으로 있으니 없어도 출력이 되게 만듬
		super();
		brand = b;
		series = s;
	}
	void phoneInfo() {//폰 정보를 출력해주는 메소드
		System.out.println(color + " " + brand + " " + series);
	}
}
// 9 -8
public class Ex09_07 {
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시" , 1 , "흰색");//생성자에 맞는 식을 대입
//		Phone p2 = new Phone("아이폰" , 2 );// 생성자에 올바른 방식으로 대입이 안됬기 때문에 오류
		
		// 9 - 10
		
		Phone p3 = new Phone("갤럭시" , 1 , "흰색");//생성자에 맞는 식을 대입
		Phone p4 = new Phone("아이폰" , 2 );//생성자에 맞는 식을 대입 왜냐면 검은색은 기본으로 해주는 생성자가 있으니 없어도 오류가 x
		
		p3.phoneInfo();
		p4.phoneInfo();
	}

}
