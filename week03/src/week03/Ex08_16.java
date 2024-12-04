package week03;

public class Ex08_16 {
	public int score(int[] scores) {//score이라는 메소드를 생성 여기에 매개변수는 int[] score라는 배열로 받겟다
		int result = 0;//배열의 합을 보고 싶어 result라는 정수형 변수를 생성하고 0을 대입
		for (int i = 0; i < scores.length; i++) {/for문을 사용해서 배열의 최대값까지 반복하는 반복문 생성
			result += scores[i];//결과값의 모든 배열의 합을 구함
		}

		return result;//return이라는 명령어를 통해서 배열의 합을 반환해줌 
	}

	public static void main(String[] args) {//main메소드 생성
		int[] studentA = { 97, 53 };//1차원 배열 studentA라는 변수명에 값이 97, 53인 길이가 2 배열을 생성
		int[] studentB = { 95, 66 };//1차원 배열 studentB라는 변수명에 값이 95, 66인 길이가 2 배열을 생성

		Ex08_16 mid = new Ex08_16();//Ex08_16라는 클래스에 있는 메소드들을 mid라는 명령어를 통해서 사용할 수 있게 해준다
		int sumA = mid.score(studentA);//sumA이라는 정수형값은 mid(Ex08_16)클래스에 있는 메소드 .score를 통해 매개변수 studentA를 대입시킨 값을 대입한다
		int sumB = mid.score(studentB);//sumB이라는 정수형값은 mid(Ex08_16)클래스에 있는 메소드 .score를 통해 매개변수 studentB를 대입시킨 값을 대입한다

		if (sumA > sumB) {//if문을 통해 sumA 와 sumB 비교
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");//""안의 메시지 출력
		} else if (sumA < sumB) {//if문을 통해 sumA 와 sumB 비교
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");//""안의 메시지 출력
		} else {//if문들의 조건이 모두 불일치시 실행
			System.out.println("두 학생의 중간고사 총점이 같습니다.");//""안의 메시지 출력
		}
	}

}
