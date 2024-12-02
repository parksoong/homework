package week02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
//		//괄호()안에 데이터를 콘솔창에 출력
//
//		// 2-1
//		System.out.print("Wellcom."); 	// "" 안에 문자를 출력
//		System.out.print("JAVA World");	// "" 안에 문자를 출력
//
//		// 2-2
//		System.out.println("Wellcom.");		// "" 안에 문자를 출력하고 줄바꿈
//		System.out.println("JAVA World");	// ""안에 문자를 출력하고 줄바꿈
//
//		// 2-3
//		System.out.printf("저는 대학교 %d학년에 재학중입니다!", 3);	
//		// ""안에 문자들을 출력을 하고 서식에 맞는 자료형을 출력한다 여기선 정수를 출력하는 %d가 나와서 3이 출력이됨  
//
//		// 2-4
//		System.out.printf("%d은 첫 번재, %f은 두 번째, %s은 세 번째.", 1, 2.0, "셋");
//		// ""안에 문자들을 출력하고 서식에 맞는 자료형을 출력한다 %d는 정수형 %f는 실수형 기본 6번째자리 까지 나오고 7번째부터 반올림 %s는 문자열이 출력이됨 
//
//		// 2-5
//		System.out.printf("%5d", 1); // ""안에 문자를 출력하는데 5칸을 지정해서 오른쪽 정렬
//		System.out.println(); // ()안에 내용을 출력을 하고 줄바꿈이지만 내용이 없어서 바로 줄바꿈
//		System.out.printf("%5d", 12); // ""안에 문자를 출력하는데 5칸을 지정해서 오른쪽 정렬
//		System.out.println(); // ()안에 내용을 출력을 하고 줄바꿈이지만 내용이 없어서 바로 줄바꿈
//		System.out.printf("%5d", 123); // ""안에 문자를 출력하는데 5칸을 지정해서 오른쪽 정렬
//		System.out.println(); // ()안에 내용을 출력을 하고 줄바꿈이지만 내용이 없어서 바로 줄바꿈
//		System.out.printf("%5d", 1234); // ""안에 문자를 출력하는데 5칸을 지정해서 오른쪽 정렬
//		System.out.println(); // ()안에 내용을 출력을 하고 줄바꿈이지만 내용이 없어서 바로 줄바꿈
//		System.out.printf("%5d", 12345);// ""안에 문자를 출력하는데 5칸을 지정해서 오른쪽 정렬
//		System.out.println(); // ()안에 내용을 출력을 하고 줄바꿈이지만 내용이 없어서 바로 줄바꿈
//		// 오른쪽 정렬일 뿐이라서 54321로 출력이되는건 아니고 앞에 숫자가 부족하면 공백이 나옴 0을 공백이라고보면 00001 00012
//		// 이런식으로 출력이됨
//
//		// 2-6
//		System.out.printf("%.1f", 1.1234567); // ""안에 문자를 출력하는데 %f는 실수형을 출력을한다 근데 앞에 .1이 소수점 1자리까지 출력을 하기 때문에 1.1이라는 실수만
//												// 출력
//		System.out.println(); // ()안에 내용을 출력을 하고 줄바꿈이지만 내용이 없어서 바로 줄바꿈
//		System.out.printf("%.2f", 1.1234567); // ""안에 문자를 출력하는데 %f는 실수형을 출력을한다 근데 앞에 .2이 소수점 2자리까지 출력을 하기 때문에 1.12이라는
//												// 실수만 출력
//		System.out.println(); // ()안에 내용을 출력을 하고 줄바꿈이지만 내용이 없어서 바로 줄바꿈
//		System.out.printf("%.3f", 1.1234567); // ""안에 문자를 출력하는데 %f는 실수형을 출력을한다 근데 앞에 .3이 소수점 3자리까지 출력을 하기 때문에 1.123이라는
//												// 실수만 출력
//		System.out.println(); // ()안에 내용을 출력을 하고 줄바꿈이지만 내용이 없어서 바로 줄바꿈
//		System.out.printf("%.4f", 1.1234567); // ""안에 문자를 출력하는데 %f는 실수형을 출력을한다 근데 앞에 .4이 소수점 4자리까지 출력을 하기 때문에 1.1235이라는
//												// 실수만 출력
//		System.out.println(); // ()안에 내용을 출력을 하고 줄바꿈이지만 내용이 없어서 바로 줄바꿈
//		System.out.printf("%.5f", 1.1234567); // ""안에 문자를 출력하는데 %f는 실수형을 출력을한다 근데 앞에 .5이 소수점 5자리까지 출력을 하기 때문에 1.12346이라는
//												// 실수만 출력
//		System.out.println(); // ()안에 내용을 출력을 하고 줄바꿈이지만 내용이 없어서 바로 줄바꿈
//		// 여기서 마지막에 왜 12346이 나오게 되었냐면 5번째 자리 까지 출력을 하라는 것은 그 이후 6번째 자리부터 다 버림을 하라는 것이 아닌
//		// 6번째 자리에서 반올림을 해서 5번째 자리 까지 보여달라는 의미임 기존에 위에 있던 .4도 마찬가지 .3도 버린것이 아닌 4이기 때문에 반올림해서 버려진것
//
//		// 2-7
//		int studentAge; // 정수형 타입을 생성해 주는데 이 때 정수형의 변수명을 studentAge라고 지정함
//		studentAge = 20; // 지정한 변수명 studentAge 의 20이라는 값을 대입해줌
//
//		System.out.println(studentAge); // ()안에 있는 문자를 출력해주는데 studentAge 라는 변수는 정수형이고 20이라는 수를 가지고 있기 때문에 20이라는 수를 출력하고
//										// 줄바꿈
//
//		// 2-8
//		String myCity = "Seoul"; // 문자열 타입을 생성해 주는데 이 때 문자열의 변수명을 myCity라고 설정을 해주고 이 변수에 ""안에 있는 문자 Seoul이라는 문자열을
//									// 대입해준다
//		System.out.println("I am from " + myCity); // ()안에 있는 것들을 출력해 주는데 ""안에 있는 문자들은 그대로 출력해주고 + myCity라는 변수를 출력해주는데 이
//													// 변수 안에는 Seoul이라는 문자열이 들어가 있고 ""과 + 가 순서대로 출력됨
//
//		// 2-9
//		int myAge = 20; // 정수형 타입을 생성해 주는데 이 때 변수명을 myAge라고 설정을 해두고 오른쪽에 있는 값 20을 변수명myAge에다가 저장을 함
//		int yourAge = myAge;//정수형 타입을 생성해주는데 이 때 변수명을 yourAge라고 설정을 해두고 오른쪽에 있는 변수명의 값 myAge의 값 20을 다시 yourAge에 대입함
//
//		System.out.println(myAge); //20이라는 값이 대입된 myAge라는 변수를 출력하고 줄바꿈
//		System.out.println(yourAge); //20이라는 값이 대입된 변수 myAge의 값 20이 대입된 yourAge라는 변수의 값 20을 출력하고 줄바꿈
//
//		// 2-10
//		int myAge = 20; // 정수형 타입을 생성해 주는데 이 때 변수명을 myAge라고 생성하고 20이라는 값을 myAge라는 변수명에 대입
//		int yourAge = 30; // 정수협 타입을 생성해 주는데 이 때 변수명을 yourAge라고 생성하고 30이라는 값을 yourAge라는 변수명에 대입
//		int tempAge; // 정수형 타입을 생성하고 정수형 변수tempAge를 생성 값은 없으나 정수형이라는 것만 생성된 상태
//
//		tempAge = myAge; // 정수형 타입의 변수 tempAge라는 변수명에 myAge의값 20을 대입함
//		myAge = yourAge; // 정수형 타입의 변수 myAge라는 변수명에 yourAge의 값 30을 대입함
//		yourAge = tempAge; // 정수형 타입의 변수 yourAge라는 변수명에 tempAge의 값 20을 대입함
//
//		System.out.println(myAge); // 정수형 타입의 변수명 myAge의값 기존에 20 이였다가 yourAge의 값을 입력 받았으므로 30이라는 값이 출력되고 줄바꿈함
//		System.out.println(yourAge);// 정수형 타입의 변수명 yourAge의 값 기존 30이였지만 20이였던 tempAge의 값을 입력 받았으므로 20이라는 값이 출력되고
//									// 줄바꿈함
//
//		// 2-11
//		byte num1 = 20; // byte라는 정수형의 타입에 num1이라는 변수를 생성하고 20이라는 값을 대입함 이때 자료형byte는 최대값이 1byte이기 때문에
//						// 1byte = 8bit 따라서 2^7이 최대값임
//		short num2 = 30;// short라는 정수형 타입에 num2라는 변수를 생성하고 30이라는 값을 대입함 short의 byte수가 2이기 때문에 2byte =
//						// 16bit 따라서 2^15가 최대값임
//		int num3 = 40; // int라는 정수형 타입에 num3라는 변수를 생성하고 40이라는 값을 대입함 이 때 int형의 기본 바이트는 4byte이고 = 32bit기
//						// 때문에 2^31이 최대 값이다
//		long num4 = 50; // long이라는 정수형 타입에 num4라는 변수를 생성하고 50이라는 값을 대입함 이 때 long형의 기본 바이트는 8byte이고 =
//						// 64bit기 때문에 2^63이 최대값이다
//
//		System.out.println(num1); //num1이라는 변수를 출력함 이때 num1은 20이라는 값을 가지고 있고 줄바꿈을함
//		System.out.println(num2); //num2라는 변수를 출력함 이 때 num2는 30이라는 값을 가지고 있고 줄바꿈을 함
//		System.out.println(num3); //num3라는 변수를 출력함 이 때 num3는 40이라는 값을 가지고 있고 줄바꿈을 함
//		System.out.println(num4); //num4라는 변수를 출력함 이 때 num4는 50이라는 값을 가지고 있고 줄바꿈을 함
//
//		// 2-12
//		byte num1 = 0110; // byte라는 정수형 타입에 num1이라는 변수를 생성하고 이에 값을 0110 8진수로 대입 10진수로는 72라는 값을 대입해줌
//		short num2 = 0107; // short라는 정수형 타입에 num2라는 변수를 생성하고 이에 값을 0107 8진수로 대입 10진수로는 71이라는 값을 대입해줌
//		int num3 = 0x46; // int라는 정수형 타입에 num3라는 변수를 생성하고 이에 값을 0X46 16진수로 대입 10진수로는 70이라는 값을 대입해줌
//		long num4 = 69L; // long이라는 정수형 타입에 69라는 값을 대입해줌 근데 기본형이 int형이기 때문에 long자료형이라는 것을 의미하기 위해 숫자 뒤에
//							// L을 입력해줌
//
//		System.out.println(num1); //num1이라는 변수를 출력하고 줄바꿈
//		System.out.println(num2); //num2이라는 변수를 출력하고 줄바꿈
//		System.out.println(num3); //num3이라는 변수를 출력하고 줄바꿈
//		System.out.println(num4); //num4이라는 변수를 출력하고 줄바꿈
//
//		// 2-13
//		double marathon = 42.195; // double이라는 실수형 자료형을 생성해주고 marathon이라는 변수명을 지정해주고 42.195라는 값을 대입한다
//		float halfMarathon = 21.0975f; // float라는 실수형 자료형을 생성해주고 halfMarathon이라는 변수명을 지정해주고 21.0975라는값을 대입해준다 하지만 실수형의
//										// 기본 자료형이 double형이기 때문에 값뒤에 f 라는 문자를 적어 float자료형 실수라는 것을 의미한다
//
//		System.out.println("마라톤은 " + marathon + "km를 달립니다."); //""안에 문자열을 출력하고 marathon이라는 변수를 출력해주고 다시 문자열""을 출력한다 
//		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다."); //""안에 문자열을 출력하고 halfmarathon이라는 변수를 출력해주고 다시 문자열""을 출력한다 
//
//		// 2-14
//		double pieDouble = 3.141592653589793; // double이라는 실수형 자료형을 생성해 변수명 pieDouble로 지정을 하고 3.141592653589793 이라는 값을
//												// 대입해준다
//		float pieFloat = 3.141592653589793f; // float이라는 실수형 자료형을 생성해 변수명 pieFloat로 지정을 하고 3.141592653589793 이라는 값을
//												// 대입해준다 물론 기본형이 double이기 때문에 값 맨 뒤에 f 를 적어주어 float형이라는 것을 의미함
//
//		System.out.println("double : " + pieDouble); // ""안에 문자를 출력을 하고 pieDouble이라는 변수에 있는 값을 출력한다
//		System.out.println("float : " + pieFloat); // ""안에 문자를 출력하고 pieFloat라는 변수에 있는 값을 출력을 해야 하지만 Float형은 최대 소수점아래
//													// 6~7자 밖에 저장되지 않아 출력할 때 7번째인 3.1415926까지 출력이되고 그 다음자리인 8번째자리 5에서
//													// 반올림을했다
//
//		// 2-15
//		char ga = '가';// 문자형 ga라는 변수에 '가'를 대입한다
//		char na = '나';// 문자형 na라는 변수에 '나'를 대입한다
//		char alphabetA = 'A'; //문자형 alphabetA 라는 변수에 'A'를 대입한다
//		char alphabetB = 'B'; //문자형 alphabetB 라는 변수에 'B'를 대입한다
//
//		System.out.println(ga);//ga라는 변수를 출력하고 줄바꿈을 한다 
//		System.out.println(na);//na라는 변수를 출력하고 줄바꿈을 한다
//		System.out.println(alphabetA + ", " + alphabetB);//alhabetA라는 변수를 출력하고 ""안에 문자를 출력하고 alhabetB라는 변수를 출력한다
//
//		// 2-16
//
//		int ga = '가'; // int라는 자료형에 변수명 ga라는 변수를 생성해주고 거기에 한글 '가'를 대입하는데 자료형이 다르기 때문에 강제로 형변환이 되어
//						// 유니코드값으로 44032라는 값이 대입이됨
//		int na = '나'; // int라는 자료형에 변수명 na라는 변수를 생성해주고 거기에 한글 '나'를 대입하는데 자료형이 다르기 때문에 강제로 형변환이 되어
//						// 유니코드값으로 45208라는 값이 대입이됨
//		int alphabetA = 'A'; // int라는 자료형에 변수명 alphabetA라는 변수를 생성해주고 거기에 영어 문자 'A'를 대입하는데 자료형이 다르기 때문에 강제로
//								// 형변환이 되어 유니코드값으로 65라는 값이 대입이됨
//		int alphabetB = 'B'; // int라는 자료형에 변수명 alphabetB라는 변수를 생성해주고 거기에 영어 문자 'B'를 대입하는데 자료형이 다르기 때문에 강제로
//								// 형변환이 되어 유니코드값으로 66라는 값이 대입이됨
//
//		System.out.println(ga); // '가'라는 문자가 유니코드로 바뀌어 ga변수가 출력이됨
//		System.out.println(na); // '나'라는 문자가 유니코드로 바뀌어 na변수가 출력이됨
//		System.out.println(alphabetA); // 'A'라는 문자가 유니코드로 바뀌어 alphabetA변수가 출력이됨
//		System.out.println(alphabetB); // 'B'라는 문자가 유니코드로 바뀌어 alphabetB변수가 출력이됨
//
//		// 2-17
//		int alphabetA = 'A'; // int라는 자료형에 변수명 alphabetA라는 변수를 생성해주고 거기에 영어 문자 'A'를 대입하는데 자료형이 다르기 때문에 강제로
//								// 형변환이 되어 유니코드값으로 65라는 값이 대입이됨
//		int alphabetB = 'B'; // int라는 자료형에 변수명 alphabetB라는 변수를 생성해주고 거기에 영어 문자 'B'를 대입하는데 자료형이 다르기 때문에 강제로
//								// 형변환이 되어 유니코드값으로 66라는 값이 대입이됨
//		System.out.println(alphabetA); // 'A'라는 문자가 유니코드로 바뀌어 alphabetA변수가 출력이됨
//		System.out.println(alphabetB); // 'B'라는 문자가 유니코드로 바뀌어 alphabetB변수가 출력이됨
//
//		char alphabetC = 67; // char라는 문자형 변수에 변수명 alphabetC 라는 변수명에 67이라는 값을 대입 하지만 문자가아닌 정수이기 때문에 유니코드를 통해
//								// 바뀌어 67의 유니코드값 C로 변환됨
//		System.out.println(alphabetC); // alphabetC라는 변수를 출력을 했지만 67이라는 정수가 유니코드에의해 바뀌어 C라는 문자로 출력이된다
//
//		// 2-18
//		boolean isStudent = true; // boolean이라는 논리 연산자 true, false를 구분해주는 자료형에 isStudent라는 값을 변수를 지정해주고 true값을 대입함
//		System.out.println(isStudent); //isStudent라는 변수를 출력을 하는데 이것은 논리형의 true값으로 출력이된다
//
//		// 2-19
//		boolean isStudent = true; // boolean이라는 논리 연산자 true, false를 구분해주는 자료형에 isStudent라는 값을 변수를 지정해주고 true값을 대입함
//
//		if (isStudent) { // if문을 사용해서 ()안의 문장이 진실이면 if(){}다음에 오는 중괄호 안으로 들어가 코드를 실행한다 하지만 위에서 boolean 형으로
//							// 지정한 isStudent변수는 true값이였기 때문에 if문의 코드를 사용함
//			System.out.println("저는 학생입니다."); // ""안에 있는 문자메시지 출력
//		} else { // if문에서 ()안의 문장이 진실이 아니면 if(){}else{} 다음에 있는 else{} 중괄호 안의 식으로 코드가 진행이됨
//			System.out.println("저는 학생이 아닙니다."); // ""안에 있는 문자메시지 출력
//		}
//
//		// 2-20
//		String hi = "안녕하세요,"; //문자열을 받는 자료형을 사용해 hi라는 변수명에 안녕하세요,를 대입
//		String niceToMeetYou = "만나서 반갑습니다.";//문자열을 받는 자료형을 사용해 niceToMeetYou라는 변수명에 만나서반갑습니다. 이라는 문자메시지를 저장
//
//		System.out.println(hi); //hi변수를 출력을 해주고 줄바꿈
//		System.out.println(niceToMeetYou);//niceToMeetYou변수를 출력 해주고 줄바꿈
//
//		// 2-21
//		int num1 = 11; // 정수형 자료형인 int형을 통해 num1이라는 변수에 11이라는 정수의 값을 대입함
//		double num2 = 3.14; // 실수형 자료형인 double을사용해 num2라는 변수에 3.14라는 실수를 대입함
//		double num1Change = (double) num1;// 기존 정수형으로 이루어진 num1이라는 변수를 형변환을 통해 (double)형으로 바꿔주고 그 바꿔준 값을 num1Change라는
//											// 변수에 대입해줌
//
//		System.out.println("num1 : " + num1); // ""안에 문자를 출력해주고 num1이라는 정수형 변수를 출력해주고 줄바꿈함
//		System.out.println("num1Change : " + num1Change);// ""안에 문자를 출력해주고 num1Change라는 실수형 변수를 출력해주고 줄바꿈함
//		System.out.println(num1Change + num2);// 실수형인 num1Change와 num2의 값을 더한뒤에 그 값을 출력해주고 줄바꿈함
//		System.out.println((int) 1.23);// 1.23이라는 실수값을 (int)를 사용해서 강제적으로 형변환을 해준다 정수로 그에 따라서 소수점 이하는 날라감
//
//		// 2-22
//		int i1 = 10; //int라는 정수형 자료형을 통해서 i1이라는 변수에 10을 대입해준다
//		byte b1 = (byte) i1;//byte라는 정수형에 b1이라는 변수명을 입력하고 거기에 (byte)를통해서 강제 형변환을한 i1의 값을 대입해준다
//		System.out.println(b1);//b1이라는 변수를 출력하고 줄바꿈
//		
//		int i2 = 128; //int라는 정수형 자료형을 통해서 i2이라는 변수에 128을 대입해준다
//		byte b2 = (byte) i2; //byte라는 정수형에 b2이라는 변수명을 입력하고 거기에 (byte)를통해서 강제 형변환을한 i2의 값을 대입해준다
//		System.out.println(b2);//byte에서 최대로 받을 수 있는 정수는 127이 최대라서 강제로 형변환을 한 결과로 이것에 벗어나 -128이라는 숫자가 나오게 된다그리고 줄바꿈
//
//		// 2-23
//		double d1 = 1.0e100; // double이라는 실수형에 d1이라는 변수를 생성하고 1.0e100이라는 값을 대입
//		float f1 = (float) d1;// float라는 실수형에 f1이라는 변수를 생성하고 강제형변환을 통해서 d1이라는 실수형을 float로 변환함
//		System.out.println(f1);// f1이라는 실수형 변수를 출력하는데 기존 float에서 받을 수 있는 최대값보다 더 큰 값을 가지고 있던 것을 강제적으로 형변환을 했기
//								// 때문에 Infinity라고 출력이 제대로 되지 않는다
//		double d2 = 1.0e-100;// double이라는 실수형에 d2이라는 변수를 생성하고 1.0e-100이라는 값을 대입
//		float f2 = (float) d2;// float라는 실수형에 f2이라는 변수를 생성하고 강제형변환을 통해서 d2이라는 실수형을 float로 변환함
//		System.out.println(f2);// f2라는 실수형 변수를 출력하는데 기존에 float에서 받을 수 있는 최솟값보다 더 작은 수를 가지고 있던 것을 강제적으로 형변환을 했기
//								// 때문에 0.0이라는 값으로 출력이 제대로 되지 않는다
//
//		// 2-24
//		double pie = 3.14; //double이라는 실수형에 pie라는 변수를 생성하고 3.14라는 값을 대입
//		int pieInt = (int) pie;//int라는 정수형에 pieInt라는 변수를 생성하고 pie라는 변수를 (int)를통해서 강제적으로 정수형으로 바꿔줌
//		System.out.println(pieInt);//실수형 pieInt를 출력함 이때 위에서 강제 형변환을 진행했기 때문에 기존에 3.14라는 값에서 소수점 아래가 날아감
//
//		int num = 100;//정수형 자료형에 num이라는 변수를 생성 100이라는 값을 대입함
//		double numD = (double) num;//실수형 자료형numD에 정수형 변수인 num을 double로 형변환해줌
//		float numF = (float) 100;//실수형 자료형numF에 정수형 변수인 num을 float로 형변환해줌
//		System.out.println(numD);//실수 numD의 값이 그대로 출력이됨 정수 -> 실수에서 실수가 더 큰범위기 때문에
//		System.out.println(numF);//실수 numF의 값이 그대로 출력이됨 정수 -> 실수에서 실수가 더 큰범위기 때문에
//
//		int i = 99999999;//정수형 변수 i 를 생성해서 99999999를 대입
//		float f = (float) i;//실수형 변수 f를 생성해서 정수형인 변수i를 float로 강제로 변환
//		System.out.println(f);//오류가 생겨서 1.0E8로 나오게 된다
//
//		// 2-25
//		int num1 = 14;//정수형 변수인 num1을 만들어주고 14라는 값을 대입
//		double num2 = 3.14;//실수형 변수인 num2를 만들어주고 3.14라는 값을 대입
//		int num4 = (int) num2;//정수형 변수인 num4를 만들어 실수형인 num2를 정수형으로 강제적으로 변환을해주고 대입해준다
//
//		System.out.println(num4);//기존에 3.14에서 소수점아래 14가 버려져서 3이라는 정수값만 출력이 된다
//
//		// 2-26
//		int i = 100;//정수형 변수 i 를생성하고 100이라는 값을 대입한다
//		char c = 'a';//문자형 변수 c를 생성하고 'a'라는 문자를 대입한다
//		int j = c; //정수형 변수 j를 생성하고 c라변수의 문자를 대입해주는데 정수형으로 강제로 바뀌어 유니코드값 97로 대입이된다
//		double d = i;//실수형 변수 d를 생성하고 i라는변수를 대입해주는데 정수에서 실수로 변하는 것이니 손실이 없이 100으로 잘 대입이 됨
//
//		System.out.println("int형 변수 j의 값 : " + j);//유니코드로 바뀐 97이라는 값이 j가 되어 출력되고 줄바꿈
//		System.out.println("double형 변수 d의 값 : " + d);//정수에서 실수로 바뀐 값j가 100.0이되어 출력되고 줄바꿈
//
//		// 2-27
//		int i = 10;// 정수형 변수i를 생성하고 10을 대입해준다
//		byte b = (byte) i;// 정수형변수 b를 생성해주고 int형을 byte형으로 강제적으로 변환해 준다
//		System.out.println("[int -> byte] i의 값 :" + i + " b의 값 :" + b);// ""안에 문자를 출력해주고 int형인 변수 i의 값을 출력해주고 ""안의 문자를
//																		// 출력하고 byte형인 b의 값을 출력한다
//
//		int j = 1000;// 정수형 변수j를 생성하고 1000을 대입해준다
//		byte c = (byte) j;// 정수형변수 c를 생성해주고 int형을 byte형으로 강제적으로 변환해 준다
//		System.out.println("[int -> byte] j의 값 :" + j + " c의 값 :" + c);// ""안에 문자를 출력해주고 int 형 변수 j의값은 그대로 출력이 되는데 기존에
//																		// 저장이 가능한 bit수를 넘어간 byte형 변수 c의 값은 -24라고 잘못된 값이
//																	    //출력이 된다
//
//		// 2-28
//
//		double d1 = 1.1234;// 실수형 자료형 double형을 통해 변수 d1을 생성하고 1.1234라는 값을 대입한다
//		float f1 = (float) d1; //실수형 자료형 float형을 통해 변수 f1을 생성하고 double형인 변수 d1을 강제적으로 형변환을 해준다
//		System.out.println("[double -> float] d1의 값 :" + d1 + ", f1의 값 :" + f1);// ""안의 문자를 출력하고 double형 변수 d1의 값 출력 그리고
//																					// ""안의 문자를 출력하고 float형 변수인 f1의 값 출력 그리고
//																				 	//줄바꿈
//
//		double d2 = 1.0e-50;// 실수형 자료형 double형을 통해 변수 d2을 생성하고 1.0e-50라는 값을 대입한다
//		float f2 = (float) d2;// 실수형 자료형 float형을 통해 변수 f2을 생성하고 double형인 변수 d2을 강제적으로 형변환을 해준다
//		System.out.println("[double -> float] d2의 값 :" + d2 + ", f2의 값 :" + f2);// ""안의 문자를 출력하고 double형 변수 d2의 값 출력 그리고
//																				// ""안의 문자를 출력하고 float형 변수인 f2의 값 출력 여기서
//																				// float가 허용가능한 최솟값보다 더 낮아 오류로 0.0으로 표기됨
//																				// 그리고 줄바꿈
//		double d3 = 1.0e100;// 실수형 자료형 double형을 통해 변수 d3을 생성하고 1.0e100라는 값을 대입한다
//		float f3 = (float) d3;// 실수형 자료형 float형을 통해 변수 f3을 생성하고 double형인 변수 d3을 강제적으로 형변환을 해준다
//		System.out.println("[double -> float] d3의 값 :" + d3 + ", f3의 값 :" + f3);// ""안의 문자를 출력하고 double형 변수 d3의 값 출력 그리고
//																				// ""안의 문자를 출력하고 float형 변수인 f3의 값 출력 여기서
//																				// float가 허용가능한 최대값보다 더 커 오류로 Infinity로 표기됨
//																				// 그리고 줄바꿈
//
//		double d4 = 9.123456789; // 실수형 자료형 double형을 통해 변수 d4을 생성하고 9.123456789라는 값을 대입한다
//		float f4 = (float) d4; // 실수형 자료형 float형을 통해 변수 f4을 생성하고 double형인 변수 d4을 강제적으로 형변환을 해준다
//		System.out.println("[정밀도 차이] d4의 값 :" + d4 + ", f4의 값 :" + f4);// ""안의 문자를 출력하고 double형 변수 d4의 값 출력 그리고 ""안의 문자를
//																		// 출력하고 float형 변수인 f4의 값을 출력 하지만 float형은 6~7자리
//																		// 밖에 출력을 못해주기 때문에 6~7번째 뒤에까지 반올림을해주고 나머지는 버려진다
//
//		// 2-29
//		float f1 = 12345.67f; // 실수형 자료형인 float형을 통해 변수 f1을 생성하고 12345.67라는 값을 대입해주는데 double형이 기본형이기 때문에 숫자뒤에
//								// f를 대입해 flaot형이라는 것을 의미한다
//		int i1 = (int) f1; // 정수형 자료형인 int를 통해서 i1이라는 변수를 생성하고 실수형인 f1변수를 (int)를 통해서 강제로 형변환 한다
//		System.out.println("[float->int] f1의 값 :" + f1 + ", i1의 값 :" + i1);// ""안의 문자를 출력하고 실수형변수인 f1의 값을 출력하고 ""안의 문자를
//																			// 출력하고 정수형값이 i1의 값이 출력이때 i1은 강제 형변환을 통해
//																			// 바뀌어서 소수점이 날라간다 그리고 줄바꾼다
//
//		double d1 = 12345.678; // 실수형 자료형인 double형을 통해 변수 d1을 생성하고 12345.678이라는 값을 대입해준다
//		int i2 = (int) d1; // 정수형 자료형인 int를 통해서 i1이라는 변수를 생성하고 실수형인 d1변수를 (int)를 통해서 강제로 형변환 한다
//		System.out.println("[double->int] d1의 값 :" + d1 + ", i2의 값 :" + i2);// ""안의 문자를 출력하고 실수형 변수인 d1의 값을 출력하고 ""안의
//																			// 문자를 출력하고 정수형 변수인 i2의 값이 출력된다 이 때 i2는 강제
//																			// 형변환을 통해 바뀌었기 때문에 소수점아래 678이라는 값은 없어진다 그리고
//																			// 줄바꿈한다
//
//		// 2-30
//		Scanner scanner = new Scanner(System.in);//스캐너 클래스를 만든다
//
//		System.out.println("나이를 입력해주세요"); // ""안의 문자를 출력하고 줄바꿈한다
//		int age = scanner.nextInt(); //""다음에 입력받는것은  Int형으로 정수만 입력을 받겠다 그리고 그 입력받은 것을 int형 변수인 age에 저장하겠다
//		System.out.printf("내 나이는 %d세 입니다.", age);//""안에 있는 문자 출력 그리고 %d라는 서식에 맞게 뒤에 age라는 변수를 대입해서 출력하고 줄바꿈한다
//
//		// 2-31
//		Scanner scanner = new Scanner(System.in);//스캐너 클래스를 만든다
//
//		String name, address; //name, address라는 변수를 만들어 문자열을 입력 받을 수 있게 생성한다
//		int age; // int형 변수에 age라는 변수를 생성한다
//		double weight; //double형 변수에 weight라는 변수를 생성한다
//
//		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요.");//출력메시지를 통해서 사용자에게 입력받고 싶은 내용을 출력한다 그리고 줄바꿈한다
//		name = scanner.next();//문자열을 입력받는다 그리고 그 입력받은 것을 문자열 변수 name에 저장한다
//		address = scanner.next();//문자열을 입력받는다 그리고 그 입력받은 것을 문자열 변수 address에 저장한다
//		age = scanner.nextInt();//정수형을 입력받는다 그리고 그 입력받은 것을 정수형 변수 age에 저장한다
//		weight = scanner.nextDouble();//실수형을 입력받는다 그리고 그 입력받은 것을 실수형 변수 weight에 저장한다
//
//		System.out.printf("당신의 이름은 %s입니다.%n", name);//""안의 문자를 출력하는데 서식 %s에 맞게 문자를 출력하는데 그 문자는 name이라는 변수를 출력한다 그리고 %n으로 줄바꿈을 해준다 
//		System.out.printf("당신의 주소는 %s입니다.%n", address);//""안의 문자를 출력하는데 서식 %s에 맞게 문자를 출력하는데 그 문자는 address이라는 변수를 출력한다 그리고 %n으로 줄바꿈을 해준다 
//		System.out.printf("당신의 나이는 %d입니다.%n", age);//""안의 문자를 출력하는데 서식 %d에 맞게 정수를 출력하는데 그 정수는 age이라는 변수를 출력한다 그리고 %n으로 줄바꿈을 해준다 
//		System.out.printf("당신의 체중은 %.1fkg입니다.%n", weight);//""안의 문자를 출력하는데 서식 %.1f에 맞게 실수를 출력하는데 그 실수는 weight이라는 변수를 출력한다 그리고 %n으로 줄바꿈을 해준다 

	}

}