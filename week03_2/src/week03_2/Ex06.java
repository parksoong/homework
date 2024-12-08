package week03_2;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {

		// 6 - 1
//		int[] arr = new int[4];// 길이가 4인 1차원배열을 생성
//
//		System.out.println(arr);

		// 6 - 2
//		int[] arr = new int[4];// 길이가 4인 1차원배열을 생성
//		
//		arr[0] = 1; //0번 인덱스에 1이라는 값 대입
//		arr[1] = 2; //1번 인덱스에 2이라는 값 대입
//		arr[2] = 3; //2번 인덱스에 3이라는 값 대입
//		arr[3] = 4; //3번 인덱스에 4이라는 값 대입
//		
//		System.out.println("arr[0] = " + arr[0]);//0번 인덱스의 값 출력
//		System.out.println("arr[1] = " + arr[1]);//1번 인덱스의 값 출력
//		System.out.println("arr[2] = " + arr[2]);//2번 인덱스의 값 출력
//		System.out.println("arr[3] = " + arr[3]);//3번 인덱스의 값 출력

		// 6 - 3
//		int[] intArray = new int[5]; //길이가 5인 정수형 배열 생성
//		String[] strArray = new String[5]; //길이가 5인 문자열 배열 생성
//
//		int[] varArray = { 1, 2, 3, 4, 5 }; //정수형 배열 varArray에 길이가 5이고 값이 {}안에 있는 배열 생성
//
//		System.out.println("intArray[0] = " + intArray[0]);//배열의 길이만 생성했지 값은 없기에 초기값인 0을 출력
//		System.out.println("intArray[1] = " + intArray[1]);//배열의 길이만 생성했지 값은 없기에 초기값인 0을 출력
//		System.out.println("strArray[0] = " + strArray[0]);//배열의 길이만 생성했지 값은 없기에 초기값인 null을 출력
//		System.out.println("strArray[1] = " + strArray[1]);//배열의 길이만 생성했지 값은 없기에 초기값인 null을 출력
//		System.out.println("varArray[0] = " + varArray[0]);//배열의 첫번째 인덱스의 값 1이 출력
//		System.out.println("varArray[1] = " + varArray[1]);//배열의 첫번째 인덱스의 값 2가 출력

		// 6 - 4
//		int[] numbers = new int[10]; // 길이가 10인 정수형 배열 생성
//		for (int i = 0; i < numbers.length; i++) {// for 반복문에서 i의 값이 numbrers라는 배열의 길이만큼 반복되도록 설정
//			numbers[i] = (int) (Math.random() * 30) + 1;// math.random()을 통해서 math클래스에있는 random 메소드를 불러와서 개수가 30까지 랜덤으로
//														// 숫자를 뽑는 식을 사용하는데 이러면 값이 0~29가 나오기 때문에 1~30이 나오기 위해 뒤에 +1을 해줌
//		}
//		int sum = 0;// sum이라는 정수형 변수에 0이라는 정수를 대입
//		for (int i = 0; i < numbers.length; i++) {// for 반복문에서 i의 값이 numbrers라는 배열의 길이만큼 반복되도록 설정
//			if (numbers[i] % 2 == 0) {// 만약 2를 나눴을때 나머지가 0이라면 즉짝수를 찾는 식
//				sum += numbers[i];// 짝수들의 합을 찾는 식
//			}
//		}
//		for (int i = 0; i < numbers.length; i++) {// for 반복문에서 i의 값이 numbrers라는 배열의 길이만큼 반복되도록 설정
//			System.out.println(numbers[i] + " ");// 값도 나왔고 배열의 0번부터 9번까지의 값을 출력해주는 식
//		}
//		System.out.println();// 줄바꿈
//		System.out.println("배열의 짝수들의 합 : " + sum);// 위에서 이미 짝수들의 합을 계산했기 때문에 값 출력

		// 6 - 5
//		char[] cards = { '1', 'L', 'O', '2', 'V', '3', 'E' }; //문자형 변수 배열에 1l2ov3e라는 값을 하나씩 대입
//		String myWord = "";//문자열 변수 선언
//
//		for (int i = 0; i < cards.length; i++) { // for 반복문에서 i의 값이 cards라는 배열의 길이만큼 반복되도록 설정
//			int word = cards[i]; //정수형 변수 int에 cards의 배열의 값 대입
//			if ((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) { //유니 코드를 통해서 알파벳이라면 문자열에 문자형배열의 값을 더해줌
//				myWord += (char) word; //문자열에 문자형들을 차례대로 더해줌
//			}
//		}
//
//		System.out.println("단어 : " + myWord);//출력

		// 6-6
//		int[] arr = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 }; // arr배열에 1~10까지의 값을 대입
//		int temp = 0; // 정수형 변수명temp를 생성
//		for (int i = arr.length - 1; i > 0; i--) { // for 반복문에서 i의 값이 arr일 때 arr배열의 길이만큼 반복되도록 설정
//			for (int j = 0; j < i; j++) {// j는 0번째 배열에서 부터 출발을 하는데 지금 배열의 길이가 10이라고 가정을 했을 때 0번1번 비교하고 1번2번 ... 8번9번
//											// 인덱스까지 비교를 해서 만약에 내가 0번이 1번인덱스의 값보다 크다면 0번의값을 1번으로 1번의값을 0번으로 대입을 한다 이 때
//											// 바로 바꾸면 어떤 값은 누락이 돼기 때문에 temp라는 정수를 따로 지정을 해서 0 > temp 1 > 0 temp > 1 순서대로
//											// 이렇게 3개를 통해서 바꾼다
//				if (arr[j] > arr[j + 1]) {//이 if는 0번과 1번의 값을 비교하기 위한 조건식이다
//					temp = arr[j + 1];
//					arr[j + 1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//
//		System.out.println("정렬 후 출력 : ");//저 식을 토대로 맨뒤에 9번인덱스부터 큰 값들을 대입해서 1번인덱스까지 큰값을 대입을 하기 때문에 0번 인덱스는 강제로 지정이 된다
//		for (int i = 0; i < arr.length; i++) {// 정렬이 끝났으니 for문을 통해서 순차적으로 출력
//			System.out.println(arr[i] + " ");
//		}

		// 6 - 7
//		int[] arr = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 }; // arr배열 선언후 1~10값을 대입
//		System.out.println(Arrays.toString(arr)); // Arrays이라는 클래스에 toString이라는 메소드를 통해서 안에 배열을 출력하는 식(하지만 Scanner클래스처럼 현재 클래스에서
		// Arrays라는 클래스를 확인을 못하기 때문에 ctrl shift o를 통해서 클래스를 import해준다)

		// 6 - 8
//		int[] arr = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 }; // arr배열 선언후 1~10값을 대입
//		
//		System.out.println("정렬 전 배열 : " + Arrays.toString(arr)); // 정렬 전 arr배열 출력
//		Arrays.sort(arr); // Arrays 클래스에 sort라는 메소드는 오름차순으로 정열을 해주는 메소드다
//		System.out.println("정렬 후 배열 : " + Arrays.toString(arr)); // 정렬 후 arr배열 출력

		// 6 - 9
//		Integer[] arr = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 }; // arr배열 선언후 1~10값을 대입
//		System.out.println("정렬 전 배열 : " + Arrays.toString(arr)); // 정렬 전 arr배열 출력
//
//		Arrays.sort(arr, Comparator.reverseOrder()); // Comparator이라는 클래스에 reverseOrder이라는 메소드를 통해서 앞에 있는 배열을 내림차순 하는
//														// 식(하지만 Scanner클래스처럼 현재 클래스에서 Comparator라는 클래스를 확인을 못하기 때문에
//														// ctrl shift o를 통해서 클래스를 import해준다)
//		System.out.println("내림차순 정렬 : " + Arrays.toString(arr));// 정렬 후 arr배열 출력

		// 6 - 10
//		int[] arr01 = { 1, 2, 3 };// arr01배열 선언후 123 대입
//		int[] arr02 = arr01; // arr02의 배열은 arr01의 배열을 대입한다
//
//		System.out.println("arr01 배열 : " + Arrays.toString(arr01));// arr01배열 출력
//		arr02[1] = 10;// 1번째 인덱스에 10 추가
//		System.out.println("arr02 배열 : " + Arrays.toString(arr02));// arr02 배열 출력
//		System.out.println("arr01 배열 : " + Arrays.toString(arr01)); // arr01배열을 출력 하지만 이 때에 왜 arr01의 1번째 인덱스에도 값이 10이
//																	// 되느냐 위에서 식을 볼 때 int[] arr02 = arr01이라고 작성이 되어 있다
//																	// 이것은 arr02라는 배열이 arr01이 된다는 의미인데 arr01은 배열이 가지고 있는
//																	// 참조값 즉 1,2,3이 들어 있는 배열의 위치를 알려주는 것이 기 때문에 arr02는
//																	// arr01의 배열을 알려주는 역할을 할 뿐이다

		// 6 - 11
//		int[] card = { 1, 6, 4, 5, 3, 2 };
//		int[] newCard = new int[card.length]; // newCar라는 배열을 기존에 있는 card의 길이만큼 배열을 새로 생성함
//		for (int i = 0; i < card.length; i++) { // for반복문을 통해 같은 인덱스에 같은 값이 들어오도록 값을 대입
//			newCard[i] = card[i];
//		}
//		System.out.println("card 배열 :  " + Arrays.toString(card));// card라는 배열 출력
//		System.out.println("newCard 배열 :  " + Arrays.toString(newCard));// newCard라는 배열 출력 이 때 값이 같지만 위에서 한 얕은복사와 다른 것인데
//																		// 왜냐하면 이것은 참조값을 통해서 위치를 알려주는 형식이 아니라 기존에 배열의
//																		// 길이가 6이라는 것을 통해서 길이가 6이라는 배열을 새롭게 생성을 해주고
//																		// for문을 통해서 기존에 생성된 newCard라는 곳은 길이가6인데 값은 다
//																		// 0이라는 초기값으로 입력이 되어 있기 때문에 card의 인덱스값과 동일하게 만들어
		// 준 것이기때문에 이것을 깊은 복사라고 한다

		// 6 - 12
//		int[] card = { 1, 6, 4, 5, 3, 2 }; //card라는 배열 생성
//		int[] newCard = Arrays.copyOf(card, card.length); //arrays 클래스에 copyOf라는 메소드를 통해서 (card 배열을 복사할 것 이고 길이는 card 배열의 길이만큼 복사할 것이다는 의미이다)
//															//만약 여기서 길이를 바꿔도 식은 성립을 하는데 card의 0번 인덱스 값을 newCard의 0번으로 대입하는 것 이기 때문에 길이만 줄어들 뿐이다
//		System.out.println("card 배열 :  "+Arrays.toString(card));//card라는 배열 출력
//		
//		card[1] = 10; //card의 인덱스1번을 10으로 대체
//		System.out.println("card 배열 :  "+Arrays.toString(card)); //card라는 배열 출력
//		System.out.println("newCard 배열 :  "+Arrays.toString(newCard)); //newCard라는 배열 출력 인데 1번인덱스의 값은 여전히 6으로 된다 값을 대입해준 것 뿐이지 두개의 배열은 서로 영향을 미치지 않는다

		// 6 - 13
//		int[] card = { 1, 6, 4, 5, 3, 2 }; //card배열 생성
//		int[] newCard = new int[card.length]; //newCard는 card의 배열의 길이와 같은 배열 생성
//
//		System.arraycopy(card, 0, newCard, 0, card.length); //(복사 대상 배열, 복사 시작 위치, 카피할배열, 시작위치, 복사할 길이)를 해주는 arraycopy라는 식
//		System.out.println("card 배열 :  " + Arrays.toString(card));//card라는 배열 출력
//		System.out.println("newCard 배열 :  " + Arrays.toString(newCard));//newCard라는 배열 출력

		// 6 - 14
//		int[][] arr = new int[2][3]; //2행3열 2차원배열 생성
//		
//		arr[0][0] = 1;//0행0열 값 1대입
//		arr[0][1] = 2;//0행1열 값 2대입
//		arr[0][2] = 3;//0행2열 값 3대입
//	
//		arr[1][0] = 11;//1행0열 값 11대입
//		arr[1][1] = 12;//1행1열 값 12대입
//		arr[1][2] = 13;//1행2열 값 13대입
//		
//		System.out.println("2차원 배열 : "+arr); //2차원 배열의 참조값
//		System.out.println("2차원 배열 1행 : "+arr[0]); //2차원 배열중에 0행의 참조값
//		System.out.println("행의 크기 : "+arr.length); //arr배열의 행의 길이 
//		System.out.println("1행 열 크기 : "+arr[0].length); //arr배열의 0행의 열의 길이
//		System.out.println("2행 열 크기 : "+arr[1].length); //arr배열의 1행의 열의 길이
//		System.out.println("arr[0][0] : "+arr[0][0]); //arr배열의 0행의0열 의 값 출력

		// 6 - 15

//		int[][] arr = new int[5][5]; //5행5열 2차원 배열 생성
//
//		int count = 1; //정수형변수 count에 1 대입
//
//		for (int i = 0; i < 5; i++) { //이중 for문을 통해서 배열의 0행 ~5행 까지 순차적으로 반복
//			for (int j = 0; j < 5; j++) {//이중 for문을 통해 배열의 0열부터 5열까지 순차적으로 반복
//				arr[i][j] = count++;//이중 for문을 통해서 나온 arr의 행과 열에 count의값을 대입하고 +1
//			}
//		}
//
//		for (int i = 0; i < 5; i++) {//이중 for문을 통해서 배열의 0행 ~5행 까지 순차적으로 반복
//			for (int j = 0; j < 5; j++) {//이중 for문을 통해 배열의 0열부터 5열까지 순차적으로 반복
//				System.out.print(arr[i][j] + " ");//이중 for문을 통해서 나온 arr의 행과 열의 값을 출력
//			}
//			System.out.println();
//		}

		// 6 - 16
//		int[][] lotto = { { 2, 6, 11, 33, 42, 44 }, 
//						{ 1, 6, 17, 22, 24, 33 }, { 7, 16, 24, 33, 42, 44 },
//						{ 11, 27, 32, 34, 43, 46 }, {6, 17, 22, 24, 33, 41} }; // 배열에 각 행과 열에 값을 일일이 대입 5행 6열}
//		Scanner scan = new Scanner(System.in);// 스캐너 클래스 생성
//		String myNum = ""; // 문자열 변수명 myNum생성
//		System.out.println("당첨 숫자 6개를 연속으로 입력해주세요 >> "); // 입력 메시지 출력
//		myNum = scan.next(); //변수명에 입력받기
//
//		boolean isWin = false; // 논리형 변수를 통해서 담청 미당첨 구분
//
//		for (int i = 0; i < lotto.length; i++) { //로또의 행길이 만큼 반복하는 반복문
//			String lottoNumber = ""; //문자열 변수명lottoNumber을 생성
//			for (int j = 0; j < lotto[i].length; j++) { //로또의 열 길이 만큼 반복하는 반복문
//				lottoNumber += lotto[i][j]; //문자열 로또넘버에 정수형을 대입
//			}
//			if (myNum.equals(lottoNumber)) { //둘다 문자열로 123415이렇게 입력을 받기 때문에 equals를 통해서 같은지 확인 하고 같으면 종료
//				isWin = true;
//				break;
//			}
//		}
//
//		if (isWin) { //위에서 비교를 했기 때문에 같으면 당첨 아니면 미당첨 출력
//			System.out.println(myNum + "번호 당첨!");
//		} else {
//			System.out.println(myNum + "번호는 당첨되지 못했습니다. ");
//		}
//		scan.close();//scan이라고하는 scanner클래스 종료

		// 6 - 17
//		int[] score = { 90, 92, 93 }; // 정수형 배열 score 생성및 값 대입
//		int sum = 0; // 정수형 sum 생성
//		double avg = 0; // 실수형 avg 생성
//		for (int val : score) { // for-each문을 통해서 val이라는 정수형변수에 score배열 0~길이까지 값들이 대입되는데 sum이라는 값에 계속해서 더함 결국엔
//								// score배열의 0~길이 까지의 모든 값들의 합을 나타냄
//			sum += val;
//		}
//		avg = (double) sum / 3; //sum이 int형이기 때문에 double을 통해서 강제 형변환을 해서 소수점자리수를 더 상세하게 확인함 만약에 형변환을 안했으면 소수점 아래자리들은 버림이된다
//		System.out.println("총점 : " + sum + ", 평균 : " + avg);//나머지 출력

	}

}
