package week03;

public class Ex08_12 {
	void sum(int[] nums) {//sum이라는 메소드를 생성 여기에 매개변수는 int[] nums라는 배열로 받겟다
		int result = 0;//result라는 변수 int형정수 생성후 0 대입
		for(int i = 0; i < nums.length; i++) {//for문을 사용해서 배열의 최대값까지 반복하는 반복문 생성
			result += nums[i];//결과값의 모든 배열의 합을 구함
		}
		System.out.println("숫자들의 합은 " + result + "입니다.");//""안의 문자 출력 
	}
	public static void main(String[] args) {//main 메소드 생성
		int nums[] = {100, 200};//1차원배열에 값이 각각 100,200 길이가 2인 배열 생성
		Ex08_12 calc = new Ex08_12();//Ex08_12라는 클래스에 있는 메소드들을 calc라는 명령어를 통해서 사용할 수 있게 해준다
		calc.sum(nums);//calc(Ex08_12)클래스에 있는 메소드 .sum을 실행하고 메인 메소드에 생성해 놓은 nums라는 배열을 대입
	}

}
