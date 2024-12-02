package week02;

public class Ex03 {
	public static void main(String[] args) {
//		// 3-1
//		int x = 100; //정수형 자료형 에 변수 x를 생성하고 x에 100을 대입한다
//		int resultPlus = +x; // resultPlus라는 정수형 변수에 x에 +만 더해 값을 대입한다
//		int resultMinus = -x; // resultMinus라는 정수형 변수에 x에 -만 더해 값을 대입한다
//
//		System.out.println(resultPlus);
//		System.out.println(resultMinus);
//
//		// 3-2
//		double d = 1.11;//double이라는 실수형 자료형 변수 d에 1.11이라는 값을 대입한다
//		double result = -d;//result라는 실수형 변수에 d에 -만 해서 값을 대입한다
//
//		System.out.println(-d);//-d의 값을 출력하고 줄바꿈한다
//		System.out.println(result);//실수형 result변수의 값을 출력하고 줄바꿈한다
//
//		// 3-3
//		int num = 10;//int라는 정수형에 변수 num을 만들고 10이라는 값을 대입한다
//		System.out.println(num);//변수 num을 출력하고 줄바꿈한다
//		num++;//num의 ++즉 ;이 나오기전(문장이 끝나기전) 수식은 진행을 하고 그 뒤에 num에 +1을 해준다
//		System.out.println(num);//변수 num을 출력한다 하지만 전 식을 통해서 +1이 되어 11이 출력이되고 줄바꿈한다
//
//		// 3-4
//		int num = 10;//int라는 정수형에 변수 num을 만들고 10이라는 값을 대입한다
//		System.out.println(num++); //변수 num을 출력하고 출력이 끝나고 ++를 해준다 그리고 줄바꿈 한다
//		System.out.println(num); //변수 num을 출력하는데 윗 문장으로 +1이되어서 11이 된다 그리고 줄바꿈 한다
//
//		// 3-5
//		int num = 30; // int라는 정수형에 변수 num을 만들고 30이라는 값을 대입한다
//		System.out.println(++num); // 변수 num을 출력을 하는데 식이 진행되기 전에 ++를 해준다 그래서 31로 출력 그리고 줄바꿈 해준다
//		System.out.println(num); // 변수 num을 출력을 하는데 이미 31이 되어 있기 때문에 31로 출력 그리고 줄바꿈해준다
//
//		System.out.println(num++); // 변수 num을 출력하고 출력이 끝나고 ++를 해준다 그래서 출력은 31이지만 끝나고 num값은 32가된다 줄바꿈 한다
//		System.out.println(num); // 변수num을 출력을 하는데 위에 이미 32가 되어 있기 때문에 32가 출력이된다
//
//		// 3-6
//		int x = 1; //정수형 변수 x에 1이라는 값을 대입한다
//		System.out.println(x++); //변수x를 출력하고 x에 ++를 해준다 그리고 줄바꿈한다
//		System.out.println(x); //변수x를 그대로 출력한다 위에 ++이 되어 있기때문에 2라는 값으로
//		System.out.println(++x);//변수x를 출력하는데 출력하기전에 ++을 해주어서 3이라는 값으로 출력이된다
//
//		// 3-7
//		char alphabetX = 'X'; // char형 문자형 변수 alphabetX 라는 변수를 생성하고 X라는 값을 넣어줌
//		System.out.println(alphabetX++); // 문자형 변수 alphabetX를 출력을해주고 줄바꿈을한다
//		System.out.println(alphabetX); // 문자형 변수의 유니코드 값만큼 ++해주고 출력을해서 그 유니코드상 다음 문자인 Y가 출력이되고 줄바꿈한다
//
//		// 3-8
//		boolean isHuman = false; //논리형인 boolean타입을 통해 isHuman은 false라고 대입을 해준다
//		System.out.println(!isHuman); //isHuman이라는 논리형타입을 출력을 해줘야 하는데 그앞에 부정인 !을 넣어줘 false 의 부정 true가된다 그리고 줄바꿈한다
//		System.out.println(isHuman); //isHuman이라는 논리형타입을 출력을 원하니까 그대로 false가 출력이된다
//
//		// 3-9
//		int x = 100; //정수형 변수 x를 만들어서 100이라는 값을 대입한다
//		int y = 200; //정수형 변수 y를 만들어서 100이라는 값을 대입한다
//		System.out.println(x + y); //()안에 변수들을 덧셈을 해 출력하고 줄바꿈한다
//		System.out.println(x - y); //()안에 변수들을 뺄셈을 해 출력하고 줄바꿈한다
//		System.out.println(x * y); //()안에 변수들을 곱을 해 출력하고 줄바꿈한다
//		System.out.println(x / y); //()안에 변수들을 나눗셈을 해 출력하고 줄바꿈한다
//		System.out.println(x % y); //()안에 변수들의 나머지를 구해 출력하고 줄바꿈한다
//
//		// 3-10
//		double num1 = 1.2345; // double형 실수형 변수 num1을 생성하고 1.2345값을 대입한다
//		int num2 = 6; // int형 정수형 변수인 num2를 생성하고
//		System.out.println(num1 + num2); // ()안의 값을 더해서 출력을 해주는데 double형과 int형이 더해지니까 자동형변환을 하여 자동으로 double형 실수형으로 출력이
//											// 된다
//
//		// 3-11
//		int result = 1000000 * 100000; //int형 변수 result에 1000000 * 1000000을 해준 정수를 대입해준다
//		System.out.println(result); //하지만 int형이 받을 수 있는 최댓값 2^31을 넘어가기 때문에 잘못된 수가 출력이된다
//
//		// 3-12
//		int x = 10; //정수형 변수 x를 만들어주고 10이라는 값을 대입해준다
//		int y = 1; //정수형 변수 y를 만들어주고 1이라는 값을 대입해준다
//		y += x; //y라는 변수에 x만큼의 값을 더해줘라
//		System.out.println(y); //변수 y의 값을 출력하고 줄바꿈한다
//		y *= x; //y라는 변수에 x만큼의 값을 곱해줘라
//		System.out.println(y); //변수 y의 값을 출력하고 줄바꿈한다
//		y %= x; //y라는 변수에서 x로나눈 나머지의 값을 대입해라
//		System.out.println(y); //변수 y의 값을 출력하고 줄바꿈한다
//
//		// 3-13
//		int a = 10; //정수형 변수 a를 만들고 10이라는 값을 대입해준다
//		int b = 20; //정수형 변수 b를 만들고 20이라는 값을 대입해준다
//		// 값을 전부 true or false로 출력하게됨
//		System.out.println(a > b); // ()안의 연산자 a > b(a가 b보다 큰지)의 결과에 따라 논리연산자로 출력이된다 (true/false)
//		System.out.println(a <= b); // ()안의 연산자 a <= b(a가 b보다 작거나 같은지)의 결과에 따라 논리연산자로 출력이된다 (true/false)
//		System.out.println(a == b); // ()안의 연산자 a == b(a가 b와 일치한지)의 결과에 따라 논리연산자로 출력이된다 (true/false)
//		System.out.println(a != b); // ()안의 연산자 a != b(a와 b가 일치하지 않은지)의 결과에 따라 논리연산자로 출력이된다 (true/false)
//
//		// 3-14
//		int a = 10; // 정수형 변수 a에 10이라는 값을 대입한다
//		int b = 11; // 정수형 변수 b에 11이라는 값을 대입한다
//
//		System.out.println(a <= b); // ()안의 연산자 a <= b(a가 b보다 작거나 같은지)의 결과에 따라 논리연산자로 출력이된다 (true/false)
//		System.out.println(a == b); // ()안의 연산자 a == b(a가 b와 일치한지)의 결과에 따라 논리연산자로 출력이된다 (true/false)
//		System.out.println(a != --b); // ()안의 연산자 a != --b(a와 --b가 일치하지 않은지)의 결과에 따라 논리연산자로 출력이된다 (true/false)
//
//		// 3-15
//		boolean b1 = true;//논리형 자료형에 b1변수에 true라는 값을 대입한다
//		boolean b2 = false;//논리형 자료형에 b2변수에 false라는 값을 대입한다
//		boolean b3 = true;//논리형 자료형에 b3변수에 true라는 값을 대입한다
//		boolean b4 = false;//논리형 자료형에 b4변수에 false라는 값을 대입한다
//
//		System.out.println("###논리곱###");//""문자 안의 내용을 출력한다 줄바꿈한다
//		System.out.println(b1 && b2); //b1 &&(and 그리고) b2의 연산 결과가(true/false)인지 출력
//		System.out.println(b1 && b3); //b1 &&(and 그리고) b3의 연산 결과가(true/false)인지 출력
//		System.out.println(b2 && b4); //b1 &&(and 그리고) b2의 연산 결과가(true/false)인지 출력
//		System.out.println();// 줄바꿈한다
//
//		System.out.println("###논리합###");//""문자 안의 내용을 출력하고 줄바꿈한다
//		System.out.println(b1 || b2); //b1 ||(or 또는) b2의 연산 결과가(true/false)인지 출력
//		System.out.println(b1 || b3); //b1 ||(or 또는) b3의 연산 결과가(true/false)인지 출력
//		System.out.println(b2 || b4); //b2 ||(or 또는) b4의 연산 결과가(true/false)인지 출력
//		System.out.println();//줄바꿈한다
//
//		System.out.println("###배타적 논리합###");
//		System.out.println(b1 ^ b2); //b1 ^(xor 배타적 논리합) b2의 연산 결과가 둘다 같으면 true 다르면 false 출력
//		System.out.println(b1 ^ b3); //b1 ^(xor 배타적 논리합) b3의 연산 결과가 둘다 같으면 true 다르면 false 출력
//
//		// 3-16
//		int num = (7 > 1) ? 1 : 2; // ()안에 있는 조건식이 일치하면 ? 뒤에식을 실행하고 불일치하면 : 뒤에식을 실행한다
//		System.out.println(num); //()안에 조건 7 > 1이 일치하므로 1이라는 값이 출력 되고 줄바꿈한다
//
//		// 3-17
//		int num = 0; //정수형 자료형 int에 num이라는 변수를 만들고 0을 대입한다
//
//		if (7 > 1) { //if문을 사용해서 ()안에 식이 true라면 {}의 식을 실행하고 틀리면 else의 식을 실행한다 ()의식 7 > 1은 true이므로 {}의식이 바로 실행
//			num = 1; //num이라는 변수 1이라는 값을 대입
//		} else { //if문의 식이 틀렸을 때에 식이 실행
//			num = 2; //num이라는 변수에 2라는 값을 대입
//		}
//		System.out.println(num); //num이라는 변수를 출력하고 줄바꿈 위에 if문을 통해서 num이라는 변수의 값이 1로 대입이 됭ㅆ음

	}
}
