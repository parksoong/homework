package week03;

public class Ex08_16 {
	public int score(int[] scores) {
		int result = 0;
		for (int i = 0; i < scores.length; i++) {
			result += scores[i];
		}

		return result;
	}

	public static void main(String[] args) {
		int[] studentA = { 97, 53 };
		int[] studentB = { 95, 66 };

		Ex08_16 mid = new Ex08_16();
		int sumA = mid.score(studentA);
		int sumB = mid.score(studentB);

		if (sumA > sumB) {
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		} else if (sumA < sumB) {
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
		} else {
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
	}

}
