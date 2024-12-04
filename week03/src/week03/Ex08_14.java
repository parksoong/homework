package week03;

public class Ex08_14 {
	public int sum(int[] nums) {//sum이라는 메소드를 생성 여기에 매개변수는 int[] nums라는 배열로 받겟다
		int result = 0;//배열의 합을 보고 싶어 result라는 정수형 변수를 생성하고 0을 대입
		for(int i = 0; i < nums.length; i++) {//for문을 사용해서 배열의 최대값까지 반복하는 반복문 생성
			result += nums[i];//결과값의 모든 배열의 합을 구함
		}
		
		return result;//return이라는 명령어를 통해서 배열의 합을 반환해줌 
	}
	public static void main(String[] args) {//main 메소드 생성
		int[] nums = {500, 200};//1차원배열에 값이 각각 500,200 길이가 2인 배열 생성
		Ex08_14 calc = new Ex08_14();//Ex08_14라는 클래스에 있는 메소드들을 calc라는 명령어를 통해서 사용할 수 있게 해준다
		
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다.");//return을 통해서 값을 돌려 받았으니 이 값을 실행시켜줄 명령어 syso를 통해서 출력을 해줌
	}

}
