package week03;

public class Ex08_12 {
	void sum(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		System.out.println("숫자들의 합은 " + result + "입니다.");
	}
	public static void main(String[] args) {
		int nums[] = {100, 200};
		Ex08_12 calc = new Ex08_12();
		calc.sum(nums);
	}

}
