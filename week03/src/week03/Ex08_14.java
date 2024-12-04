package week03;

public class Ex08_14 {
	public int sum(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		
		return result;
	}
	public static void main(String[] args) {
		int[] nums = {500, 200};
		Ex08_14 calc = new Ex08_14();
		
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다.");
	}

}
