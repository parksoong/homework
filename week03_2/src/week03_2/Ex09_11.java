package week03_2;

//9 - 11
class Book{
	String title = "제목없음";//필드에 String int int타입 생성하고 초기값을 다 지정해줌
	int series = 1;
	int page = 100;
	
	Book(){//아무것도 입력 안받는 생성자
		
	}
	Book(String t){//title의 제목만 받는 생성자
		title = t;
	}
	Book(String t , int p){//title의 제목과 페이지수를 받는 생성자
		title = t;
		page = p;
	}
	Book(int s, String t){//series와 title제목을 받는생성자
		series = s;
		title = t;
	}
}
// 9 - 12
public class Ex09_11 {
	public static void main(String[] args) {//1234순으로 각 생성자에 맞는 인수를 대입해줌
		Book b1 = new Book();
		System.out.println("b1.title : " + b1.title);
		System.out.println("b1.series : " + b1.series);
		System.out.println("b1.page : " + b1.page);
		
		Book b2 = new Book("멘토시리즈 자바");
		System.out.println("b1.title : " + b2.title);
		System.out.println("b1.series : " + b2.series);
		System.out.println("b1.page : " + b2.page);
		
		Book b3 = new Book("신데렐라" , 170);
		System.out.println("b1.title : " + b3.title);
		System.out.println("b1.series : " + b3.series);
		System.out.println("b1.page : " + b3.page);
		
		Book b4 = new Book(5, "노인과 바다");
		System.out.println("b1.title : " + b4.title);
		System.out.println("b1.series : " + b4.series);
		System.out.println("b1.page : " + b4.page);
		
		
	}

}
