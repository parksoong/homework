package week02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
//		// 4-1
//		int result = 0; //result란 변수에 0을 대입
//		if (3 > 2) {//if문 만약 ()안의 식이 진실이면 {}의 식을 실행 틀리면 스킵
//			result = 3; 
//		}
//		System.out.println(result); //result의 값을 출력하고 줄바꿈
//
//		// 4-2
//		Scanner sc = new Scanner(System.in); //스캐너 클래스 생성
//		System.out.println("나이를 입력하세요."); //입력받고 싶은 메세지를 출력
//		int age = sc.nextInt();//int형 변수 age에 사용자가 입력받는 값을 대입한다
//
//		if (age > 19) { //if문이기 때문에 ()안의 식이 진실이면 바로{}의 식을 실행하고 아니면 {}밖으로 바로 빠져나감
//			System.out.println("성인입니다."); //""안의 문자를 출력하고 줄바꿈한다
//		}
//		System.out.println("프로그램을 종료합니다."); //""안의 문자를 출력하고 줄바꿈한다
//
//		// 4-3
//		int num = 5; //정수형 변수 num에 5라는 값을 대입한다
//
//		if (num > 4) { //if문을 통해서 ()의 식이 진실이면 {}의 식이 실행되고 거짓이면 {}밖의 식이 실행된다
//			System.out.println(num + "은(는) 4보다 큽니다.");//num변수의 값 출력해주고 ""의 메세지 출력
//		} else {
//			System.out.println(num + "은(는) 4보다 작습니다.");//num변수의 값 출력해주고 ""의 메세지 출력
//		}
//
//		// 4-4
//		int a = 4; //정수형 변수 a에 4라는 값을 대입한다
//		int b = 10; //정수형 변수 b에 10이라는 값을 대입한다
//		
//		if(a > b) { //if문의 식()의 식이 진실이면{}안에 식을 실행하고 아니면 else의 식을 실행한다
//			System.out.println("a가 b보다 큽니다."); //""안의 문자가 실행되고 줄바꿈한다
//		}else { //if문의 조건식()의 식이 거짓이면 {}의 식이 실행된다
//			System.out.println("a가 b보다 작거나 같습니다.");//""안의 문자가 실행되고 줄바꿈한다
//		}
//
//		// 4-5
//		int a = 4; //정수형 변수 a에 4라는 값을 대입한다
//		int b = 10; //정수형 변수 b에 10이라는 값을 대입한다
//		int max = 0; //정수형 변수 max에 0이라는 값을 대입한다
//
//		if (a > b) { //if문의식()가 진실되면 바로 {}의 식이 실행되고 거짓이면 else{}의 식이 실행된다
//			max = a; //max라는 변수에 a변수의값을 대입하겟다
//		} else {//if문의 식이 거짓이라면 실행되는 식
//			max = b; //max라는 변수에 b변수의 값을 대입하겠다
//		}
//		System.out.println(a + "와(과)" + b + " 중에 큰 수는 " + max + "입니다."); // ""if문을 통해서 큰 수를 max라는 변수에 저자을 했기 때문에 a ,b 의
//																			// 값을 출력하고 큰 값을 max라고 지칭해서 출력한다
//
//		// 4-6
//		Scanner sc = new Scanner(System.in);//스캐너 클래스 생성 
//		System.out.println("나이를 입력하세요."); //입력받고싶은 메시지 출력하고 줄바꿈한다
//		
//		int age = sc.nextInt(); //정수형 변수 age를 생성하고 그 값은 사용자가 다음에 입력하는 값으로 하겠다
//		
//		if(age >19) {//if문의 식이진실이면 {}의 식을 실행하고 거짓이면 바로 else{}의 식으로 이동
//			System.out.println("성인입니다.");//""의 문자를 출력하고 줄바꿈한다
//		}else {//if문의()식이 거짓일때 실행되는 식
//			System.out.println("미성년자입니다.");//""의 문자를 출력하고 줄바꿈한다
//		}
//
//		// 4-7
//		int favorite = 7; //정수형 변수 favorite를 생성하고 7이라는 값을 대입한다
//		
//		if(favorite < 5) {//if문에 ()식이 진실이면 실행되는 식{}
//			System.out.println("좋아하는 숫자가 5보다 작습니다.");//""의 문자를 출력하고 줄바꿈한다
//		}else if(favorite>5) {//if문의()식이 거짓이고 그에 또다른 규칙이 필요하면 else if(){}를 사용해 다시 한번 조건을 걸어준다
//			System.out.println("좋아하는 숫자가 5보다 큽니다.");//""의 문자를 출력하고 줄바꿈한다
//		}else {//모든 if문이 끝나고 나머지 의 상황에 실행되는 식이다
//			System.out.println("좋아하는 숫자가 5입니다.");//""의 문자를 출력하고 줄바꿈한다
//		}
//
//		// 4-8
//		int favorite = 7; //정수형 변수 favorite를 생성하고 7이라는 값을 대입한다
//		if (favorite > 5) {//if문에 ()식이 진실이면 실행이되는 식{}
//			System.out.println("좋아하는 숫자가 5보다 큽니다."); //""의 문자를 출력하고 줄바꿈한다
//		} else if (favorite == 7) { //else if문으로 favorite라는 변수가 7일때 문장이 실행되도록 하였다
//			System.out.println("좋아하는 숫자가 7입니다.");//""의 문자를 출력하고 줄바꿈한다
//		}
//
//		// 4-9
//		Scanner sc = new Scanner(System.in); //스캐너 클래스 생성
//		System.out.println("나이를 입력하세요"); //입력받고자 하는 식을 출력
//		int age = sc.nextInt();//age라는 정수형 변수를 생성하고 그에 값은 사용자가 입력할 값이다 
//		
//		if(age>19) { //if문으로 만약 사용자가 입력한 수가 19보다 크면 {}실행되고 아니면 넘어간다
//			System.out.println("성인입니다.");//""의 문자를 출력하고 줄바꿈한다
//		}else if(age >13) {else if문으로 만약사용자가 입력한 수가 19보다 작아 여기로 이동하고 13보다 크면 {}실행이 된다
//			System.out.println("청소년입니다.");//""의 문자를 출력하고 줄바꿈한다
//		}else if(age>6) {else if 문으로 만약 사용자가 입력한 수가 13보다 작아 여기로 이동하고 6보다 크면 {}실행이 된다
//			System.out.println("어린이입니다.");//""의 문자를 출력하고 줄바꿈한다
//		}else {//만약 사용자가 6보다 작아 여기로 온다면 {}의 식이 실행된다
//			System.out.println("유아입니다.");//""의 문자를 출력하고 줄바꿈한다
//		}
//
//		// 4-10
//		int num = 7; //num이라는 변수에 7이라는 수를 대입한다
//		
//		switch(num) { //switch case문으로 ()조건식의 을 적고 아래에 결과를 적는것이다
//		case 1: //case 만약에 num이 1이라면? 실행이된다
//			System.out.println("num은 1입니다."); //""의 문자를 출력하고 줄바꿈한다
//			break; //보조제어문 break를 사용해서 바로 일치하는 값이 나오면 switch문을 탈출할 수 있게 해준다
//		case 7: //case 만약에 num이 7이라면? 실행이된다
//			System.out.println("num은 7입니다.");//""의 문자를 출력하고 줄바꿈한다
//			break;//보조제어문 break를 사용해서 바로 일치하는 값이 나오면 switch문을 탈출할 수 있게 해준다
//		default: //case가 일치하는 경우가 없다면 실행이된다
//			System.out.println("num은 1도 7도 아닙니다.");//""의 문자를 출력하고 줄바꿈한다
//		}
//
//		 4-11
//		int num = 7; //num이라는 변수에 7이라는 수를 대입한다
//		
//		switch(num) {//switch case문으로 ()조건식의 을 적고 아래에 결과를 적는것이다
//		case 1: //case 만약에 num이 1이라면? 실행이된다
//			System.out.println("num은 1입니다.");//""의 문자를 출력하고 줄바꿈한다
//		case 7://case 만약에 num이 7이라면? 실행이된다
//			System.out.println("num은 7입니다.");//""의 문자를 출력하고 줄바꿈한다
//		default://case가 일치하는 경우가 없다면 실행이된다
//			System.out.println("num은 1도 7도 아닙니다.");//""의 문자를 출력하고 줄바꿈한다
//		}
//		//여기서는 break문을 안적어 줬기 때문에 조건이 일치하는 7에서 식이 switch문이 끝날 때까지 실행이 되었다
//
//		// 4-12
//		Scanner sc = new Scanner(System.in);//스캐너 클래스 생성
//		System.out.println("원하는 숫자를 입력하세요. (1~5)");//사용자에게 입력받고 싶은 메시지 출력
//
//		int num = sc.nextInt(); //num이라는 정수형 변수는 사용자가 입력한 값으로 받겠다
//
//		switch (num) {//switch case문으로 ()조건식의 을 적고 아래에 결과를 적는것이다
//		case 5://만약 num이 5라면 실행이된다
//			System.out.println("5를 입력하였습니다.");//""의 문자를 출력하고 줄바꿈한다
//			break;//보조제어문 break를 사용해서 바로 일치하는 값이 나오면 switch문을 탈출할 수 있게 해준다
//		case 4://만약 num이 4라면 실행이된다
//			System.out.println("4를 입력하였습니다.");//""의 문자를 출력하고 줄바꿈한다
//			break;//보조제어문 break를 사용해서 바로 일치하는 값이 나오면 switch문을 탈출할 수 있게 해준다
//		case 3://만약 num이 3라면 실행이된다
//			System.out.println("3를 입력하였습니다.");//""의 문자를 출력하고 줄바꿈한다
//			break;//보조제어문 break를 사용해서 바로 일치하는 값이 나오면 switch문을 탈출할 수 있게 해준다
//		case 2://만약 num이 2라면 실행이된다
//			System.out.println("2를 입력하였습니다.");//""의 문자를 출력하고 줄바꿈한다
//			break;//보조제어문 break를 사용해서 바로 일치하는 값이 나오면 switch문을 탈출할 수 있게 해준다
//		case 1://만약 num이 1라면 실행이된다
//			System.out.println("1를 입력하였습니다.");//""의 문자를 출력하고 줄바꿈한다
//			break;//보조제어문 break를 사용해서 바로 일치하는 값이 나오면 switch문을 탈출할 수 있게 해준다
//		default://만약 num이 1~5에 숫자가 아니라면 실행이된다
//			System.out.println("1~5까지의 숫자를 입력하세요.");//""의 문자를 출력하고 줄바꿈한다
//		}

	}
}
