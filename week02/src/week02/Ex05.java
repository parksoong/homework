package week02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
//		// 5-1
//		int sum = 0; //sum이라는 정수형 변수에 0이라는 값을 대입한다
//		for(int i=1; i<=10; i++) { //for문(초기식/조건식/증감식)을 통해서 몇번 반복을 할지 정한는 반복문이다
//			sum += i; //sum이라는 변수에 i의 값을 계속 더해준다
//		}
//		System.out.println("합 : "+ sum );//""의 문자메시지를 출력하고 sum이라는 변수를 출력한다
//
//		// 5-2
//		int sum = 0; //sum이라는 정수형 변수에 0이라는 값을 대입한다
//		for(int i=1; i<=100; i++) { //for문(초기식/조건식/증감식)을 통해서 몇번 반복을 할지 정한는 반복문이다
//			if(i % 2 == 0) {//if문( i % 2 == 0 즉 i의 나머지가 0이니까 짝수라면 실행이된다
//				sum += i; //sum이라는 변수에 i라는 값을 계속 더해준다
//			}
//		}
//		System.out.println("합 : "+sum);
//
//		// 5-3
//		for (int i = 2; i <= 9; i++) {//for문(초기식/조건식/증감식)을 통해서 몇번 반복을 할지 정한는 반복문이다
//			for (int j = 1; j <= 9; j++) {//여기선 for문에 for문이 사용이 되었으므로 총 반복 횟수는 바깥for문 x 안쪽for문 횟수만큼 총 반복을 한다
//				System.out.print(i + "X" + j + "=" + (i * j) + "\t");//i의 값과 j의 곲을 해주고 tab만큼 간격을 띄워준다 그리고 이걸 J만큼 반복을 해준다
//			}
//			System.out.println();// 줄바꿈해준다
//		}
//
//		// 5-4
//		for (int i = 0; i < 7; i++) { //for문(초기식/조건식/증감식)을 통해서 몇번 반복을 할지 정한는 반복문이다
//			for (int j = 0; j < 7 - i; j++) {//여기선 for문에 for문이 사용이 되었으므로 총 반복 횟수는 바깥for문 x 안쪽for문 횟수만큼 총 반복을 한다
//				System.out.print(" ");// 0~ 7-i만큼의 공백을 해준다 
//			}
//			for (int k = 0; k < (2 * i) + 1; k++) {//여기선 for문에 for문이 사용이 되었으므로 총 반복 횟수는 바깥for문 x 안쪽for문 횟수만큼 총 반복을 한다
//				System.out.print("*");//(0 ~ 2 *i ) +1 만큼의 수대로 별을 출력한다
//			}
//			System.out.println();// 줄바꿈해준다
//		}
//
//		// 5-5
//		int sum = 0; //sum이라는 정수형변수에 0이라는 값을 대입한다
//		int i = 1;  //i라는 변수에 1이라는 값을 대입한다
//		while(i <= 10) {//while문()안의 조건이 진실일때 반복 거짓이면{} 밖으로 이동
//			sum += i; //sum이라는 변수에 i의 값만큼 계속 더해준다
//			i++;//변수i를 사용하고 그 i의 값에 1을 더해준다
//		}
//		System.out.println("합 : "+sum);//""안의 문자를 출력하고 sum이라는 변수의 값을 출력해준다
//
//		// 5-6
//		int sum = 0;// sum이라는 정수형변수에 0이라는 값을 대입한다
//		int i = 1; // i라는 변수에 1이라는 값을 대입한다
//		do { // 만약 while문의 조건식을 만족을 하더라도 최초1회는 식을 실행을 한다 그리고 반복을 하는데 반복되는 동안 조건이 불일치하게되면
//				// 탈출하게된다
//			sum += i;//sum이라는 변수에 i라는 변수를 계속 더해준다
//			i++;//변수i를 사용하고 그 i의 값에 1을 더해준다
//		} while (i <= 10);//while()조건식으로써 조건의 내용이 진실되면 다시 do문으로들어가 반복을 하고 불일치하면 탈출하게 된다
//
//		System.out.println("합 : " + sum);//""안의 문자를 출력하고 sum이라는 변수의 값을 출력해준다
//
//		// 5-7
//		int sum = 0; // sum이라는 정수형변수에 0이라는 값을 대입한다
//		for (int i = 1; i <= 100; i++) { // for문(초기식/조건식/증감식)을 통해서 몇번 반복을 할지 정한는 반복문이다
//			if (i % 2 != 0) { // if문으로써 만약 i % 2 != 0 i를 2로 나눈 나머지가 0이 아니면 즉 홀수이면 {}의 식을 실행
//				continue; // 더이상 식을 실행하지말고 무시하고 진행해라 for문의 식 안쪽만 무시하고 다시 for문으로 돌아가면 다시 조건에 일치하면 반복
//			}
//			sum += i;//sum이라는 변수에 i라는 변수를 계속 더해준다
//		}
//		System.out.println("짝수 합 : " + sum);//""안의 문자를 출력하고 sum이라는 변수의 값을 출력해준다
//
//		// 5-8
//		int magicNumber = (int) (Math.random() * 50) + 1; // 정수형 변수 magicNumber에 Math.random() * 50이라는 식으로 0~49 즉 총 50개의
//															// 숫자중에서 랜덤으로 하나를 지정하겠따는 의미인데 +1을 사용해 1~50까지의 숫자중에서 랜덤으로 숫자
//															// 하나를 뽑겠다는 뜻이다
//		Scanner scan = new Scanner(System.in);// 스캐너 클래스생성
//		boolean isMatched = false;// 논리형타입 isMatched의 값을 false로 지정
//
//		for (int i = 0; i < 10; i++) {// for문(초기식/조건식/증감식)을 통해서 몇번 반복을 할지 정한는 반복문이다
//			System.out.println("찾는 숫자를 입력 >>");// ""안의 사용자에게 입력받고 싶은 메시지를 출력
//			int guess = scan.nextInt(); // guess라는 변수는 사용자에게 입력받은 값으로 지정을 하겠다
//
//			if (guess == magicNumber) {// if문 만약 guess가 사용자가 입력한 값이 랜덤으로 생성된 숫자와 같으면 실행
//				System.out.println((i + 1) + "번째에 맞췄습니다!");// ""안의 문자가 실행이된다
//				isMatched = true;// isMatched를 진실로 바꾼다
//				break;// 보조제어문 break를 사용해서 바로 일치하는 값이 나오면 for문을 탈출할 수 있게 된다
//			} else if (guess > magicNumber) {// else if문으로써 if의 식이 틀리고 다른 조건이 필요할 때 사용한다
//				System.out.println("맞춰야할 숫자가 더 작습니다.");// ""안의 문자가 실행이된다
//			} else if (guess < magicNumber) {// else if문으로써 if의 식이 틀리고 다른 조건이 필요할 때 사용한다
//				System.out.println("맞춰야할 숫자가 더 큽니다.");// ""안의 문자가 실행이된다
//			}
//
//			if (!isMatched) {// if문 만약 10번동안 반복할 동안 사용자가 다 틀렸을 때를 위한 if문 isMatched가 원래 false형인데 끝가지 false상태
//								// 이기 때문에 !isMatched를 사용해서 진실로바꾸고 안에 식을 실행해준다
//				System.out.println("정답을 맞추지 못했습니다.");// ""안의 문자가 실행이된다
//			}
//		}
	}

}
